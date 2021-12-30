package com.vtanaka.blog.controllers.responses;

public class AuthorCreationResponse {

  private Long id;

  public AuthorCreationResponse() {}

  public AuthorCreationResponse(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
