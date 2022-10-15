package com.hello.visited.close

import com.hello.visited.board.domain.GetBoardResult
import com.hello.visited.data.BoardRepo
import com.hello.visited.open.BoardReader
import org.springframework.stereotype.Component

@Component
internal class BoardReaderImpl(
    private val boardRepo: BoardRepo
) : BoardReader {

    override fun getBoards(): List<GetBoardResult> {
        val boards = boardRepo.findAll()
        return boards.map {
            GetBoardResult.make(it)
        }
    }
}
