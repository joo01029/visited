package com.hello.visited.board.domain

import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardReader: BoardReader
) {

    fun makeBoard(boardDto: BoardDto, userDto: UserDto){

    }
}