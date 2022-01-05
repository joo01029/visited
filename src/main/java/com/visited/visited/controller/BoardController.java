package com.visited.visited.controller;

import com.visited.visited.model.req.board.InsertBoardDto;
import com.visited.visited.model.res.Response;
import com.visited.visited.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {
	private final BoardService boardService;
	@PostMapping
	public Response insert(@RequestBody InsertBoardDto insertBoardDto){
		boardService.insertBoard(insertBoardDto);

		return new Response();
	}
}
