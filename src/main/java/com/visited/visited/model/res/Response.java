package com.visited.visited.model.res;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
	String message;

	public Response(String message){
		this.message = message;
	}

	public Response(){
		message = "성공";
	}
}
