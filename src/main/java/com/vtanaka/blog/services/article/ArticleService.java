package com.vtanaka.blog.services.article;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.controllers.responses.ArticleResponse;
import java.util.List;

public interface ArticleService {
  ArticleCreationResponse create(ArticleRequest request);

  List<ArticleResponse> findAllByAuthor(Long authorId);

  ArticleResponse findById(Long id);
}
