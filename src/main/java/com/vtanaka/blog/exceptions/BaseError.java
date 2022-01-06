package com.vtanaka.blog.exceptions;

public class BaseError {

  private String code;

  private String message;

  public String getCode() {
    return code;
  }

  public BaseError setCode(String code) {
    this.code = code;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public BaseError setMessage(String message) {
    this.message = message;
    return this;
  }
}
