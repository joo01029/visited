package com.hello.visited.board.domain

import com.hello.visited.user.domain.dto.inputs.UserSource
import com.hello.visited.user.domain.UserImpl
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardWriter: BoardWriter,
    private val boardReader: BoardReader,
    private val userImpl: UserImpl

) {

    fun makeBoard(makeBoardSource: MakeBoardSource, userSource: UserSource){
        val user = userImpl.getUser(userSource.name) ?: userImpl.saveUser(userSource.name)
        boardWriter.saveBoard(makeBoardSource, user)
    }

    fun getBoards():List<GetBoardResult> = boardReader.getBoards()
}