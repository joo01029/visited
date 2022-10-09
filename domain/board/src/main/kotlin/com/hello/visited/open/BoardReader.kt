package com.hello.visited.open

import com.hello.visited.board.domain.GetBoardResult

interface BoardReader {
    fun getBoards():List<GetBoardResult>
}