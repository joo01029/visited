package com.hello.visited.board.controller.response

import com.hello.visited.board.domain.GetBoardResult

class GetBoardListResponse(
    val boards: List<BoardListItem>
) {
    companion object {
        private fun make(sources: List<BoardListItem>): GetBoardListResponse {
            return GetBoardListResponse(
                sources
            )
        }

        fun create(sources: List<GetBoardResult>): GetBoardListResponse {
            val results = sources.map {
                BoardListItem.make(it)
            }
            return GetBoardListResponse.make(results)
        }
    }
}

class BoardListItem(
    val id: Long,
    val title: String,
    val userName: String
) {
    companion object {
        fun make(source: GetBoardResult): BoardListItem {
            return BoardListItem(
                id = source.id,
                title = source.title,
                userName = source.userName
            )
        }
    }
}
