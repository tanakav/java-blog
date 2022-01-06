package com.vtanaka.blog.controllers.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

public class AddressResponse {

  private Long id;

  private String name;

  private Long number;

  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private String detail;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }
}
