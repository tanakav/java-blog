package com.vtanaka.blog.controllers.responses;

public class ArticleCreationResponse {

  private Long id;

  public ArticleCreationResponse() {
  }

  public ArticleCreationResponse(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public ArticleCreationResponse setId(Long id) {
    this.id = id;
    return this;
  }
}
