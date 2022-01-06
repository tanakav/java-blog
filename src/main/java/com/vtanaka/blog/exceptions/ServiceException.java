package com.vtanaka.blog.exceptions;

import java.text.MessageFormat;

public class ServiceException extends RuntimeException {

  private ErrorCode errorCode;

  private String message;

  public ErrorCode getErrorCode() {
    return errorCode;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public ServiceException(ErrorCode error) {
    this.errorCode = error;
    this.message = error.getMessage();
  }

  public ServiceException(ErrorCode error, Object ... params) {
    this.errorCode = error;
    this.message = MessageFormat.format(error.getMessage(), params);
  }

}
