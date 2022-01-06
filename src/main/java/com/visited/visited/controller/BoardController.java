package com.visited.visited.controller;

import com.visited.visited.model.req.board.InsertBoardDto;
import com.visited.visited.model.res.Response;
import com.visited.visited.model.res.board.SimpleBoardDto;
import com.visited.visited.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {
	private final BoardService boardService;
	@PostMapping
	@ResponseBody
	public Response insert(@RequestBody InsertBoardDto insertBoardDto){
		boardService.insertBoard(insertBoardDto);

		return new Response();
	}
	@GetMapping
	public String mainPage(Model model){
		List<SimpleBoardDto> boards = boardService.getBoards();
		model.addAttribute("boards", boards);
		return "main";
	}
}
