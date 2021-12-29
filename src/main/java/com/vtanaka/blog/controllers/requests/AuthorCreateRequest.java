package com.vtanaka.blog.controllers.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthorCreateRequest {

  private Long id;

  private String name;

  private String cpf;

  private String rg;

  private String email;

  @JsonProperty("address_name")
  private String addressName;

  @JsonProperty("address_number")
  private Long addressNumber;

  @JsonProperty("address_detail")
  private String addressDetail;
}
