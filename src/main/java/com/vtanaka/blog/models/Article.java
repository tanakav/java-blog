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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

  @PrePersist
  public void initialize() {
    this.createdAt = LocalDateTime.now();
    this.lastUpdate = LocalDateTime.now();
  }

  @PreUpdate
  public void updatedLastUpdateDate() {
    this.lastUpdate = LocalDateTime.now();
  }
}
