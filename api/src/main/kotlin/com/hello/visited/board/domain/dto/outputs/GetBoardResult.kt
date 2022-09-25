package com.hello.visited.board.domain

data class GetBoardResult (
    val id: Long,
    val title: String,
    val content: String,
    val userName:String
    )