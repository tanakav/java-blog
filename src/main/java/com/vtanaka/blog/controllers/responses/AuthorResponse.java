package com.vtanaka.blog.controllers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorResponse extends AuthorBaseResponse {

  private String cpf;

  private String rg;

  private String email;

  @JsonProperty("address")
  private AddressResponse addressResponse;

  public AuthorResponse() {}

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

  public AddressResponse getAddressResponse() {
    return addressResponse;
  }

  public void setAddressResponse(AddressResponse addressResponse) {
    this.addressResponse = addressResponse;
  }
}
