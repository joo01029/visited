package com.hello.visited.board.domain

import com.hello.visited.user.domain.UserImpl
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardImpl: BoardImpl,
    private val userReader: UserImpl
) {

    fun makeBoard(boardDto: BoardDto, userDto: UserDto){
        //user이름이 존재하는 지 확인 및 없으면 새로 생성

        //board 생성
    }
}