package com.vtanaka.blog.controllers.docs;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorCreationResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface AuthorApi {

  @ResponseStatus(CREATED)
  AuthorCreationResponse create(AuthorCreateRequest request);

  @ResponseStatus(OK)
  AuthorResponse getById(Long id);
}
