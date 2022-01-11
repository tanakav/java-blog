package com.vtanaka.blog.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import java.util.Arrays;
import org.springframework.http.HttpStatus;

public enum ErrorCode {
  USER_NOT_FOUND("001", BAD_REQUEST, "User {0} not found"),
  ARTICLE_NOT_FOUND("002", BAD_REQUEST, "Article {0} not found"),
  UNKNOWN("999", INTERNAL_SERVER_ERROR, "Unknown error: {0}");

  private String code;

  private HttpStatus status;

  private String message;

  ErrorCode(String code, HttpStatus status, String message) {
    this.code = code;
    this.status = status;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public HttpStatus getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public static ErrorCode fromCode(String code) {
    return Arrays.stream(ErrorCode.values())
        .filter(error -> code.equalsIgnoreCase(error.getCode()))
        .findFirst()
        .orElseThrow(() -> new ServiceException(UNKNOWN));
  }
}
