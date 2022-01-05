package com.visited.visited.mapper;

import com.visited.visited.model.req.board.InsertBoardDto;
import com.visited.visited.model.res.board.SimpleBoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
	List<SimpleBoardDto> getAllBoard();
	void insertBoard(InsertBoardDto insertBoardDto);
}
