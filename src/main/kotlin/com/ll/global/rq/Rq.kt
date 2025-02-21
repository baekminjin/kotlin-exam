package com.ll.global.rq

class Rq(cmd: String) {

    val action: String
    private val paramMap = mutableMapOf<String, String>()

    init {
        val cmdBits = cmd.split("?", limit = 2) // ? 기준으로 좌우 나누기

        action = cmdBits[0].trim()

        if (cmdBits.size == 2) {
            val queryStr = cmdBits[1]
            val queryBits = queryStr.split("&")

            for (queryBit in queryBits) {
                val queryParamBits = queryBit.split("=", limit = 2)

                if (queryParamBits.size != 2) {
                    continue
                }

                val paramName = queryParamBits[0].trim()
                val paramValue = queryParamBits[1].trim()

                paramMap[paramName] = paramValue
            }
        }

    }

    private fun getParamValue(name: String): String? {
        return paramMap[name]
    }

    fun getParamValue(name: String, default: String): String {
        return getParamValue(name) ?: default
    }


    fun getParamValueAsInt(name: String, default: Int): Int {
        val paramValue = getParamValue(name) ?: return default

        return try {
            paramValue.toInt() //정수화
        } catch (e: NumberFormatException) {
            default
        }
    }

}
