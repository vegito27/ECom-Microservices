package com.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler extends RuntimeException {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	  public ResponseEntity<String> handleGenericException(Exception ex) {
	        return new ResponseEntity<>("Something went wrong: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	
	

}
