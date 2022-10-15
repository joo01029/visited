package com.hello.visited.board.controller

import com.hello.visited.board.controller.response.GetBoardListResponse
import com.hello.visited.board.domain.BoardService
import com.hello.visited.board.domain.GetBoardResult
import com.hello.visited.response.DefaultResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/board")
class BoardController(
    private val boardService: BoardService
) {

    @PostMapping
    fun makeBoard(@Valid @RequestBody request: MakeBoardRequest): DefaultResponse<Nothing> {
        boardService.makeBoard(request.toMakeBoardSource(), request.toUserSource())
        return DefaultResponse.success()
    }

    @GetMapping("/list")
    fun getBoards(): DefaultResponse<GetBoardListResponse> {
        val result = boardService.getBoards()
        return DefaultResponse.success(GetBoardListResponse.create(result))
    }

    @GetMapping
    fun getBoard(@Valid request: GetBoardResult): DefaultResponse<Nothing> {

        return DefaultResponse.success()
    }
}
