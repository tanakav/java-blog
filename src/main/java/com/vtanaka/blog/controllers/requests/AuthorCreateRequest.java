package com.vtanaka.blog.controllers.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AuthorCreateRequest {

  @NotBlank private String name;

  @NotBlank private String cpf;

  @NotBlank private String rg;

  @Email private String email;

  @NotBlank
  @JsonProperty("address_name")
  private String addressName;

  @NotBlank
  @JsonProperty("address_number")
  private Long addressNumber;

  @JsonProperty("address_detail")
  private String addressDetail;

  public AuthorCreateRequest(String name, String cpf, String rg, String email, String addressName, Long addressNumber,
      String addressDetail) {
    this.name = name;
    this.cpf = cpf;
    this.rg = rg;
    this.email = email;
    this.addressName = addressName;
    this.addressNumber = addressNumber;
    this.addressDetail = addressDetail;
  }

  public AuthorCreateRequest() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public Long getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(Long addressNumber) {
    this.addressNumber = addressNumber;
  }

  public String getAddressDetail() {
    return addressDetail;
  }

  public void setAddressDetail(String addressDetail) {
    this.addressDetail = addressDetail;
  }
}
