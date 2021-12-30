package com.vtanaka.blog.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Article implements Serializable {

  static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  private String content;

  private LocalDateTime createdAt;

  private LocalDateTime lastUpdate;

  @ManyToOne
  @JoinColumn(name = "author_id")
  private Author author;

  public Article() {}

  @PrePersist
  public void initialize() {
    this.createdAt = LocalDateTime.now();
    this.lastUpdate = LocalDateTime.now();
  }

  @PreUpdate
  public void updatedLastUpdateDate() {
    this.lastUpdate = LocalDateTime.now();
  }

  public Article(Long id, String title, String content, Author author) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public Author getAuthor() {
    return author;
  }

  public static ArticleBuilder builder() {
    return new ArticleBuilder();
  }

  public static class ArticleBuilder {
    private Long id;

    private String title;

    private String content;

    private Author author;

    public ArticleBuilder id(Long id) {
      this.id = id;
      return this;
    }

    public ArticleBuilder title(String title) {
      this.title = title;
      return this;
    }

    public ArticleBuilder content(String content) {
      this.content = content;
      return this;
    }

    public ArticleBuilder author(Author author) {
      this.author = author;
      return this;
    }

    public Article build() {
      return new Article(id, title, content, author);
    }
  }
}
