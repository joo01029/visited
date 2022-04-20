package com.visited.visited.model.entity;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@Getter
@ToString
@RedisHash(value = "visit", timeToLive = 5*60)
public class Visit {
	@Id
	private String id;
	private Long boardId;
	private LocalDateTime createAt;
	private Boolean isSaved = false;

	public Visit(Long boardId){
		this.boardId = boardId;
		this.createAt = LocalDateTime.now();
	}

	public void setSaved(){
		this.isSaved = true;
	}
}
