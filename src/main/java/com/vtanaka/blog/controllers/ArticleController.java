package com.vtanaka.blog.controllers;

import static com.vtanaka.blog.configs.ApplicationConstants.ArticleResource.ARTICLE_ID_PARAM;
import static com.vtanaka.blog.configs.ApplicationConstants.ArticleResource.ARTICLE_RESOURCE;
import static com.vtanaka.blog.configs.ApplicationConstants.ArticleResource.ARTICLE_URI;
import static com.vtanaka.blog.configs.ApplicationConstants.AuthorResource.PARAM_AUTHOR_ID;

import com.vtanaka.blog.controllers.docs.ArticleApi;
import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.controllers.responses.ArticleResponse;
import com.vtanaka.blog.services.article.ArticleService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ARTICLE_RESOURCE)
public class ArticleController implements ArticleApi {

  private final ArticleService articleService;

  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @Override
  @PostMapping
  public ArticleCreationResponse create(@RequestBody ArticleRequest request) {
    return articleService.create(request);
  }

  @Override
  @GetMapping
  public List<ArticleResponse> findAllByAuthor(
      @RequestParam(name = PARAM_AUTHOR_ID) Long authorId) {
    return articleService.findAllByAuthor(authorId);
  }

  @Override
  @GetMapping(ARTICLE_URI)
  public ArticleResponse findById(@PathVariable(ARTICLE_ID_PARAM) Long id) {
    return articleService.findById(id);
  }
}
