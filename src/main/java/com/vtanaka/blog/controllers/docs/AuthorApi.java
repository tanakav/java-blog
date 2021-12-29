package com.vtanaka.blog.controllers.docs;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorResponse;

public interface AuthorApi {

  AuthorResponse createAuthor(AuthorCreateRequest request);

}
