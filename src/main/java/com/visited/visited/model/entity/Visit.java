package com.visited.visited.model.entity;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@Getter
@RedisHash(value = "visit", timeToLive = 10*60)
public class Visit {
	@Id
	private String id;
	private Long BoardId;
	private LocalDateTime createAt;

	public Visit(Long boardId){
		this.BoardId = boardId;
		this.createAt = LocalDateTime.now();
	}
}
