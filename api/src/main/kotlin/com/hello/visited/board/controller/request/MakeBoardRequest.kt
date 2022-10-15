package com.hello.visited.board.controller

import com.hello.visited.board.domain.MakeBoardSource
import com.hello.visited.open.inputs.UserSource
import org.hibernate.validator.constraints.Length

class MakeBoardRequest {
    @Length(min = 2, max = 20, message = "제목은 2~20글자 사이로 만들어야 합니다.")
    var title: String? = null
    @Length(min = 2, max = 100, message = "내용은 2~100글자 사이로 만들어야 합니다.")
    var content: String? = null

    var userName: String? = "none"

    fun toMakeBoardSource(): MakeBoardSource {
        return MakeBoardSource(
            title = this.title!!,
            content = this.content!!
        )
    }

    fun toUserSource(): UserSource {
        return UserSource(
            name = this.userName!!
        )
    }
}
