package com.app

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    println("== 명언앱 ==")

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

            val id  = 1

            println("${id}번 명언이 등록되었습니다.")

        }
    }
}