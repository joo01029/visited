package com.visited.visited.handler;

import com.visited.visited.model.res.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> exceptionHandler(Exception e){
		e.printStackTrace();
		return new ResponseEntity<Response>(new Response("서버에러"), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
