package com.ll.domain.wiseSaying.wiseSaying.entity

data class WiseSaying ( // data class: 데이터를 담는 클래스
    var content: String,
    var author: String
) {
    var id: Int = 0

    fun modify(content: String, author: String) {
        this.content = content
        this.author = author
    }

    fun isNew(): Boolean { // 새로운 데이터인지 확인
        return id == 0
    }

    val json: String
        get() {
            return """
                {
                    "id": $id,
                    "content": "$content",
                    "author": "$author"
                }
            """.trimIndent()
        }
}
