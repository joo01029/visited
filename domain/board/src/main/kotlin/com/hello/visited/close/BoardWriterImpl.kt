package com.hello.visited.close

import com.hello.visited.board.domain.MakeBoardSource
import com.hello.visited.data.Board
import com.hello.visited.data.BoardRepo
import com.hello.visited.open.BoardWriter
import com.hello.visited.open.UserReader
import com.hello.visited.open.UserWriter
import com.hello.visited.open.inputs.UserSource
import org.springframework.stereotype.Component

@Component
internal class BoardWriterImpl(
    private val boardRepo: BoardRepo,
    private val userReader: UserReader,
    private val userWriter: UserWriter
) : BoardWriter {

    override fun saveBoard(board: MakeBoardSource, userSource: UserSource) {
        val user = userReader.getUser(userSource) ?: userWriter.saveUser(userSource)
        val newBoard = Board(
            title = board.title,
            content = board.content,
            user = user
        )
        user.boards.add(newBoard)

        boardRepo.save(newBoard)
    }
}
