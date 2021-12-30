package com.vtanaka.blog.services.author;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorCreationResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;

public interface AuthorService {

  AuthorCreationResponse createAuthor(AuthorCreateRequest request);

  AuthorResponse getAuthor(Long id);
}
