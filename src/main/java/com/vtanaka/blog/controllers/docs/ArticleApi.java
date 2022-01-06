package com.vtanaka.blog.controllers.docs;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import com.vtanaka.blog.controllers.requests.ArticleRequest;
import com.vtanaka.blog.controllers.responses.ArticleCreationResponse;
import com.vtanaka.blog.controllers.responses.ArticleResponse;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ArticleApi {

  @ResponseStatus(CREATED)
  ArticleCreationResponse create(ArticleRequest request);

  @ResponseStatus(OK)
  List<ArticleResponse> findAllByAuthor(Long authorId);

  @ResponseStatus(OK)
  ArticleResponse findById(Long id);

}
