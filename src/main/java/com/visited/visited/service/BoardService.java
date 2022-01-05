package com.visited.visited.service;

import com.visited.visited.mapper.BoardMapper;
import com.visited.visited.model.req.board.InsertBoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardMapper boardMapper;

	public void insertBoard(InsertBoardDto insertBoardDto){
		boardMapper.insertBoard(insertBoardDto);
	}
}
