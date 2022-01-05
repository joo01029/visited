package com.visited.visited;

import com.visited.visited.mapper.BoardMapper;
import com.visited.visited.model.req.board.InsertBoardDto;
import com.visited.visited.model.res.board.SimpleBoardDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@SpringBootTest
//@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
public class BoardTest {
	@Autowired
	private BoardMapper boardMapper;

	@Test
	public void insertTest(){
		System.out.println("aa");
		InsertBoardDto insertBoardDto = new InsertBoardDto();
		insertBoardDto.setTitle("test1");
		insertBoardDto.setContent("test1");
		List<SimpleBoardDto> beforeInsert = boardMapper.getAllBoard();
		boardMapper.insertBoard(insertBoardDto);

		List<SimpleBoardDto> afterInsert = boardMapper.getAllBoard();
		Assertions.assertThat(afterInsert.size()).isGreaterThan(beforeInsert.size());
	}

	@Test
	public void test(){

	}

}
