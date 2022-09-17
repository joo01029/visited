package com.hello.visited.board.domain

import com.hello.visited.user.domain.UserDto
import com.hello.visited.user.domain.UserImpl
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardImpl: BoardImpl,
    private val userImpl: UserImpl
) {

    fun makeBoard(boardDto: BoardDto, userDto: UserDto){
        val user = userImpl.getUser(userDto.name) ?: userImpl.saveUser(userDto.name)
        boardImpl.saveBoard(boardDto, user)
    }
}