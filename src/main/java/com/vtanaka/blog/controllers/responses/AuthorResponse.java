package com.vtanaka.blog.controllers.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorResponse {

  private final Long id;

}
