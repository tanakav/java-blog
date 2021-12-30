package com.vtanaka.blog.controllers.responses;

import com.vtanaka.blog.models.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AddressResponse {

  private Long id;

  private String name;

  private Long number;

  private String detail;

  private Author author;
}
