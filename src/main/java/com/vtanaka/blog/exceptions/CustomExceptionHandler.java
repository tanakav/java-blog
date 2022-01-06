package com.vtanaka.blog.exceptions;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

  @ExceptionHandler(ServiceException.class)
  public ResponseEntity<BaseError> serviceException(
      ServiceException exception,
      HttpServletRequest request) {
    BaseError error = new BaseError();
    error.setCode(exception.getErrorCode().getCode());
    error.setMessage(exception.getMessage());

    return ResponseEntity.status(exception.getErrorCode().getStatus()).body(error);
  }

}
