package com.hello.visited.board.domain

import com.hello.visited.data.BoardRepo
import org.springframework.stereotype.Component

@Component
class BoardReader(
    private val boardRepo: BoardRepo
) {

    fun getBoards():List<GetBoardResult>{
        val boards = boardRepo.findAll()
        return boards.map {
            GetBoardResult.make(it)
        }
    }
}