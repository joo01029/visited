package com.hello.visited.board.domain

import com.hello.visited.data.Board
import com.hello.visited.data.BoardRepo
import com.hello.visited.data.User
import org.springframework.stereotype.Component

@Component
class BoardImpl (
    private val boardRepo: BoardRepo
){

    fun saveBoard(board: BoardDto,user: User){
        val newBoard = Board(
            title = board.title,
            content = board.content,
            user = user
        )
        user.boards.add(newBoard)

        boardRepo.save(newBoard);
    }
}