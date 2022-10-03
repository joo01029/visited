package com.hello.visited.board.domain

import com.hello.visited.data.Board

data class GetBoardResult (
    val id: Long,
    val title: String,
    val content: String,
    val userName:String
    ){
    companion object{
        fun make(board: Board):GetBoardResult{
            return GetBoardResult(
                id = board.id!!,
                title = board.title,
                content = board.content,
                userName = board.user.name
            )
        }
    }
}