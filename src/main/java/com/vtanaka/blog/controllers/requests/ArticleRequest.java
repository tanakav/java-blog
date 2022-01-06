package com.vtanaka.blog.controllers.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleRequest {

  private String title;

  @JsonProperty("user_id")
  private Long userId;

  @JsonProperty("short_description")
  private String shortDescription;

  private String content;

  public Long getUserId() {
    return userId;
  }

  public ArticleRequest setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public ArticleRequest setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public ArticleRequest setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ArticleRequest setContent(String content) {
    this.content = content;
    return this;
  }
}
