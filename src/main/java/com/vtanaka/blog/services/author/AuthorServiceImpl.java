package com.vtanaka.blog.services.author;

import static com.vtanaka.blog.exceptions.ErrorCode.USER_NOT_FOUND;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorCreationResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;
import com.vtanaka.blog.exceptions.ServiceException;
import com.vtanaka.blog.models.Author;
import com.vtanaka.blog.repositories.author.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository authorRepository;

  private final AuthorFactory authorFactory;

  private final ObjectMapper mapper;

  public AuthorServiceImpl(
      AuthorRepository authorRepository,
      AuthorFactory authorFactory,
      ObjectMapper mapper) {
    this.authorRepository = authorRepository;
    this.authorFactory = authorFactory;
    this.mapper = mapper;
  }

  @Override
  public AuthorCreationResponse createAuthor(AuthorCreateRequest request) {
    Author author = authorFactory.buildModel(request);
    Author createdAuthor = authorRepository.save(author);
    return new AuthorCreationResponse(createdAuthor.getId());
  }

  @Override
  public AuthorResponse getAuthor(Long id) {
    Author author =
        authorRepository.findById(id).orElseThrow(() -> new ServiceException(USER_NOT_FOUND, id));

    return authorFactory.buildResponse(author);
  }
}
