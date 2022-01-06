package com.vtanaka.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {

  static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private Long number;

  private String detail;

  @JsonIgnore
  @OneToOne(mappedBy = "address")
  private Author author;

  public Address(Long id, String name, Long number, String detail, Author author) {
    this.id = id;
    this.name = name;
    this.number = number;
    this.detail = detail;
    this.author = author;
  }

  public Address() {}

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Long getNumber() {
    return number;
  }

  public String getDetail() {
    return detail;
  }

  public Author getAuthor() {
    return author;
  }

  public static AddressBuilder builder() {
    return new AddressBuilder();
  }

  public static class AddressBuilder {

    private Long id;

    private String name;

    private Long number;

    private String detail;

    private Author author;

    AddressBuilder() {}

    public AddressBuilder id(Long id) {
      this.id = id;
      return this;
    }

    public AddressBuilder name(String name) {
      this.name = name;
      return this;
    }

    public AddressBuilder number(Long number) {
      this.number = number;
      return this;
    }

    public AddressBuilder detail(String detail) {
      this.detail = detail;
      return this;
    }

    public AddressBuilder author(Author author) {
      this.author = author;
      return this;
    }

    public Address build() {
      return new Address(id, name, number, detail, author);
    }
  }
}
