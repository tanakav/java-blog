package com.vtanaka.blog.services.article;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.controllers.responses.ArticleResponse;
import com.vtanaka.blog.models.Article;

public interface ArticleFactory {

  Article buildArticleFrom(ArticleRequest request);

  ArticleCreationResponse buildArticleFrom(Article article);

  ArticleResponse buildResponseFrom(Article article);

}
