package com.vtanaka.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Author implements Serializable {

  static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String cpf;

  private String rg;

  private String email;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id", referencedColumnName = "id")
  private Address address;

  @JsonIgnore
  @OneToMany(mappedBy = "author")
  private List<Article> articles;

  public Author(
      Long id,
      String name,
      String cpf,
      String rg,
      String email,
      Address address,
      List<Article> articles) {
    this.id = id;
    this.name = name;
    this.cpf = cpf;
    this.rg = rg;
    this.email = email;
    this.address = address;
    this.articles = articles;
  }

  public Author() {}

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCpf() {
    return cpf;
  }

  public String getRg() {
    return rg;
  }

  public String getEmail() {
    return email;
  }

  public Address getAddress() {
    return address;
  }

  public List<Article> getArticles() {
    return articles;
  }

  public static AuthorBuilder builder() {
    return new AuthorBuilder();
  }

  public static class AuthorBuilder {
    private Long id;

    private String name;

    private String cpf;

    private String rg;

    private String email;

    private Address address;

    private List<Article> articles;

    public AuthorBuilder id(Long id) {
      this.id = id;
      return this;
    }

    public AuthorBuilder name(String name) {
      this.name = name;
      return this;
    }

    public AuthorBuilder cpf(String cpf) {
      this.cpf = cpf;
      return this;
    }

    public AuthorBuilder rg(String rg) {
      this.rg = rg;
      return this;
    }

    public AuthorBuilder email(String email) {
      this.email = email;
      return this;
    }

    public AuthorBuilder address(Address address) {
      this.address = address;
      return this;
    }

    public AuthorBuilder articles(List<Article> articles) {
      this.articles = articles;
      return this;
    }

    public Author build() {
      return new Author(id, name, cpf, rg, email, address, articles);
    }
  }
}
