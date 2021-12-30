package com.vtanaka.blog.controllers;

import static com.vtanaka.blog.configs.ApplicationConstants.AuthorResource.AUTHOR_RESOURCE;
import static com.vtanaka.blog.configs.ApplicationConstants.AuthorResource.AUTHOR_URI;

import com.vtanaka.blog.controllers.docs.AuthorApi;
import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorCreationResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;
import com.vtanaka.blog.services.author.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AUTHOR_RESOURCE)
@RequiredArgsConstructor
public class AuthorController implements AuthorApi {

  private final AuthorService authorService;

  @Override
  @PostMapping
  public AuthorCreationResponse create(AuthorCreateRequest request) {
    return authorService.createAuthor(request);
  }

  @Override
  @GetMapping(AUTHOR_URI)
  public AuthorResponse getById(Long id) {
    return authorService.getAuthor(id);
  }
}
