package com.hello.visited.board.controller

import com.hello.visited.board.domain.BoardService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/board")
class BoardController (
    private val boardService: BoardService
    ) {

    @PostMapping
    fun makeBoard(@Valid request : MakeBoardRequest){
        boardService.makeBoard(request.toBoardDto(), request.toUserDto())
    }
}