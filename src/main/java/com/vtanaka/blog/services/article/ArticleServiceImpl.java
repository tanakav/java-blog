package com.vtanaka.blog.services.article;

import static com.vtanaka.blog.exceptions.ErrorCode.ARTICLE_NOT_FOUND;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.controllers.responses.ArticleResponse;
import com.vtanaka.blog.exceptions.ServiceException;
import com.vtanaka.blog.models.Article;
import com.vtanaka.blog.repositories.article.ArticleRepository;
import java.util.List;
import java.util.stream.Collectors;
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

  @Override
  public List<ArticleResponse> findAllByAuthor(Long authorId) {
    return articleRepository.findAllByAuthorId(authorId).stream()
        .map(article -> articleFactory.buildResponseFrom(article))
        .collect(Collectors.toList());
  }

  @Override
  public ArticleResponse findById(Long id) {
    return articleRepository
        .findById(id)
        .map(article -> articleFactory.buildResponseFrom(article))
        .orElseThrow(() -> new ServiceException(ARTICLE_NOT_FOUND, id));
  }
}
