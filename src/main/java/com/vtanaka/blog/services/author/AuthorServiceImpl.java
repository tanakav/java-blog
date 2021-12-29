package com.vtanaka.blog.services.author;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AuthorResponse;
import com.vtanaka.blog.model.Address;
import com.vtanaka.blog.model.Author;
import com.vtanaka.blog.repositories.author.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

  private final AuthorRepository authorRepository;

  @Override
  public AuthorResponse createAuthor(AuthorCreateRequest request) {
    Author createdAuthor = authorRepository.save(buildModel(request));
    return AuthorResponse.builder().id(createdAuthor.getId()).build();
  }

  private Author buildModel(AuthorCreateRequest request) {
    final Address address =
        Address.builder()
            .name(request.getAddressName())
            .number(request.getAddressNumber())
            .detail(request.getAddressDetail())
            .build();

    return Author.builder()
        .name(request.getName())
        .cpf(request.getCpf())
        .rg(request.getRg())
        .email(request.getEmail())
        .address(address)
        .build();
  }
}
