package com.vtanaka.blog.controllers;

import static com.vtanaka.blog.configs.ApplicationConstants.AuthorResource.PARAM_AUTHOR_ID;
import static com.vtanaka.blog.configs.ApplicationConstants.AuthorResource.AUTHOR_RESOURCE;
import static com.vtanaka.blog.configs.ApplicationConstants.AuthorResource.AUTHOR_URI;

import com.vtanaka.blog.controllers.docs.AuthorApi;
import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorCreationResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;
import com.vtanaka.blog.services.author.AuthorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping(AUTHOR_RESOURCE)
public class AuthorController implements AuthorApi {

  private final AuthorService authorService;

  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @Override
  @PostMapping
  public AuthorCreationResponse create(@RequestBody AuthorCreateRequest request) {
    return authorService.createAuthor(request);
  }

  @Override
  @GetMapping(AUTHOR_URI)
  public AuthorResponse getById(@PathVariable(PARAM_AUTHOR_ID) Long id) {
    return authorService.getAuthor(id);
  }
}
