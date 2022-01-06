package com.vtanaka.blog.controllers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vtanaka.blog.models.Article;
import java.time.LocalDateTime;

public class ArticleResponse {

  private Long id;

  private String title;

  @JsonProperty("short_description")
  private String shortDescription;

  private String content;

  private LocalDateTime createdAt;

  private LocalDateTime lastUpdate;

  public Long getId() {
    return id;
  }

  public ArticleResponse(){}

  public ArticleResponse(Article article){
    this.id = article.getId();
    this.title = article.getTitle();
    this.shortDescription = article.getShortDescription();
    this.content = article.getContent();
    this.createdAt = article.getCreatedAt();
    this.lastUpdate = article.getLastUpdate();
  }

  public ArticleResponse setId(Long id) {
    this.id = id;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public ArticleResponse setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public ArticleResponse setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ArticleResponse setContent(String content) {
    this.content = content;
    return this;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public ArticleResponse setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public ArticleResponse setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }
}
