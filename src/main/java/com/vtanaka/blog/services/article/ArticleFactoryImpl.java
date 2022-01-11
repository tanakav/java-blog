package com.vtanaka.blog.services.article;

import static com.vtanaka.blog.exceptions.ErrorCode.USER_NOT_FOUND;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.controllers.responses.ArticleResponse;
import com.vtanaka.blog.exceptions.ServiceException;
import com.vtanaka.blog.models.Article;
import com.vtanaka.blog.models.Author;
import com.vtanaka.blog.repositories.author.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleFactoryImpl implements ArticleFactory {

  private final AuthorRepository authorRepository;

  public ArticleFactoryImpl(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  @Override
  public Article buildArticleFrom(ArticleRequest request) {

    return Article.builder()
        .title(request.getTitle())
        .content(request.getContent())
        .shortDescription(request.getShortDescription())
        .author(findByAuthorId(request.getUserId()))
        .build();
  }

  @Override
  public ArticleCreationResponse buildArticleFrom(Article article) {
    return new ArticleCreationResponse(article.getId());
  }

  @Override
  public ArticleResponse buildResponseFrom(Article article) {

    return new ArticleResponse(article);
  }

  private Author findByAuthorId(Long authorId) {
    return authorRepository
            .findById(authorId)
            .orElseThrow(() -> new ServiceException(USER_NOT_FOUND, authorId));
  }


}
