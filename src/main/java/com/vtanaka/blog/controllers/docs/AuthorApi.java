package com.vtanaka.blog.controllers.docs;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorCreationResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;

public interface AuthorApi {

  AuthorCreationResponse create(AuthorCreateRequest request);

  AuthorResponse getById(Long id);
}
