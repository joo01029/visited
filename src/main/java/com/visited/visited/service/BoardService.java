package com.visited.visited.service;

import com.visited.visited.mapper.BoardMapper;
import com.visited.visited.model.entity.Visit;
import com.visited.visited.model.repository.VisitRedisRepository;
import com.visited.visited.model.req.board.InsertBoardDto;
import com.visited.visited.model.res.board.DetailBoardDto;
import com.visited.visited.model.res.board.SimpleBoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
	private final BoardMapper boardMapper;
	private final VisitRedisRepository visitRedisRepository;

	public void insertBoard(InsertBoardDto insertBoardDto){
		boardMapper.insertBoard(insertBoardDto);
	}

	public List<SimpleBoardDto> getBoards(){
		return boardMapper.getAllBoard();
	}

	public DetailBoardDto getBoard(Long boardId){
		Visit visit = new Visit(boardId);
		visitRedisRepository.save(visit);
		return boardMapper.getBoard(boardId);
	}
}
