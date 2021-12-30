package com.vtanaka.blog.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
  USER_NOT_FOUND("001", BAD_REQUEST, "User {0} not found"),
  UNKNOWN("002", INTERNAL_SERVER_ERROR, "Unknown error: {0}");

  private String code;

  private HttpStatus status;

  private String message;

  public static ErrorCode fromCode(String code) {
    return Arrays.stream(ErrorCode.values())
        .filter(error -> code.equalsIgnoreCase(error.getCode()))
        .findFirst()
        .orElseThrow(() -> new ServiceException(UNKNOWN));
  }
}
