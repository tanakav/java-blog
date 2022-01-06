package com.vtanaka.blog.services.article;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;

public interface ArticleService {
  ArticleCreationResponse create(ArticleRequest request);
}
