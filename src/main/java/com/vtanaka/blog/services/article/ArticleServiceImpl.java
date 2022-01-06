package com.vtanaka.blog.services.article;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.models.Article;
import com.vtanaka.blog.repositories.article.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

  private final ArticleRepository articleRepository;

  private final ArticleFactory articleFactory;

  public ArticleServiceImpl(ArticleRepository articleRepository, ArticleFactory articleFactory) {
    this.articleRepository = articleRepository;
    this.articleFactory = articleFactory;
  }

  @Override
  public ArticleCreationResponse create(ArticleRequest request) {
    Article newArticle = articleRepository.save(articleFactory.buildArticleFrom(request));
    return articleFactory.buildArticleFrom(newArticle);
  }
}
