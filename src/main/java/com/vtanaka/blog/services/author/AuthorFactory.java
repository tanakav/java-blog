package com.vtanaka.blog.services.author;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.models.Author;

public interface AuthorFactory {

  Author buildModel(AuthorCreateRequest request);

}
