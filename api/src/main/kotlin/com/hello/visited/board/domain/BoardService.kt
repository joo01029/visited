package com.hello.visited.board.domain

import com.hello.visited.open.BoardReader
import com.hello.visited.open.BoardWriter
import com.hello.visited.open.inputs.UserSource
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardWriter: BoardWriter,
    private val boardReader: BoardReader,

) {
    fun makeBoard(makeBoardSource: MakeBoardSource, userSource: UserSource) = boardWriter.saveBoard(makeBoardSource, userSource)

    fun getBoards(): List<GetBoardResult> = boardReader.getBoards()
}
