package com.vtanaka.blog.exceptions;

import java.text.MessageFormat;

public class ServiceException extends RuntimeException {

  private String code;

  private String message;

  public ServiceException(ErrorCode error) {
    this.code = error.getCode();
    this.message = error.getMessage();
  }

  public ServiceException(ErrorCode error, Object ... params) {
    this.code = error.getCode();
    this.message = MessageFormat.format(error.getMessage(), params);
  }

}
