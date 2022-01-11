package com.vtanaka.blog.controllers.responses;

import com.vtanaka.blog.models.Author;

public class AuthorBaseResponse {

  private Long id;

  private String name;

  public AuthorBaseResponse() {}

  public AuthorBaseResponse(Author author) {
    this.id = author.getId();
    this.name = author.getName();
  }

  public Long getId() {
    return id;
  }

  public AuthorBaseResponse setId(Long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public AuthorBaseResponse setName(String name) {
    this.name = name;
    return this;
  }
}
