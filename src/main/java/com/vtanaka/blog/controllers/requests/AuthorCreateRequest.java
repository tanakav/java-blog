package com.vtanaka.blog.controllers.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
