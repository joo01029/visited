package com.hello.visited.board.controller.response

import com.hello.visited.board.domain.GetBoardResult

class GetBoardResponse (
    val boards : List<BoardItem>
){
    companion object{
        private fun make(sources: List<BoardItem>):GetBoardResponse{
            return GetBoardResponse(
                sources
            )
        }

        fun create(sources: List<GetBoardResult>) : GetBoardResponse{
            val results = sources.map {
                BoardItem.make(it)
            }
            return GetBoardResponse.make(results)
        }
    }
}

class BoardItem (
    val id: Long,
    val title: String,
    val content: String,
    val userName: String
){
    companion object{
        fun make(source: GetBoardResult):BoardItem{
            return BoardItem(
                id = source.id,
                title = source.title,
                content = source.content,
                userName = source.userName
            )
        }
    }
}