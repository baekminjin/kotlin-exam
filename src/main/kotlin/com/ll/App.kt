package com.ll

class App {
    fun run() {
        println("== 명언앱 ==")

        var lastId = 0
        val wiserSayings = mutableListOf<WiserSaying>()

        while (true) {
            print("명언) ")

            // val input = readlnOrNull()?.trim() //값이 있으면 공백제거 없으면 null
            val input = readlnOrNull()!!.trim() // !!은 null 아님을 보장

            if (input == "종료")
                break

            else if (input == "등록") {
                print("명언 : ")
                val content = readlnOrNull()!!.trim()
                print("작가 : ")
                val author = readlnOrNull()!!.trim()

                val id  = ++lastId

                wiserSayings.add(WiserSaying(id, content, author))

                println("${id}번 명언이 등록되었습니다.")

            }

            else if(input == "목록"){
                if(wiserSayings.isEmpty()){
                    println("등록된 명언이 없습니다.")
                    continue
                }

                println("번호 / 내용 / 작가")

                println("------------------")

                wiserSayings.forEach{
                    println("${it.id} / ${it.content} / ${it.author}")
                }
            }
        }
    }
}