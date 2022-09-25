package com.hello.visited.board.controller.response

import com.hello.visited.board.domain.GetBoardResult

class GetBoardResponse (
    val id: Long,
    val title: String,
    val content: String,
    val userName: String
){
    companion object{
        fun make(source: GetBoardResult):GetBoardResponse{
            return GetBoardResponse(
                id = source.id,
                title = source.title,
                content = source.content,
                userName = source.userName
            )
        }
    }
}