package com.vtanaka.blog.services.author;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.controllers.responses.AddressResponse;
import com.vtanaka.blog.controllers.responses.AuthorResponse;
import com.vtanaka.blog.models.Address;
import com.vtanaka.blog.models.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorFactoryImpl implements AuthorFactory {

  private final ObjectMapper mapper;

  @Override
  public Author buildModel(AuthorCreateRequest request) {
    return Author.builder()
        .name(request.getName())
        .cpf(request.getCpf())
        .rg(request.getRg())
        .email(request.getEmail())
        .address(buildAddress(request))
        .build();
  }

  @Override
  public AuthorResponse buildResponse(Author author) {
    AddressResponse addressResponse = mapper.convertValue(author.getAddress(), AddressResponse.class);
    AuthorResponse authorResponse = mapper.convertValue(author, AuthorResponse.class);
    authorResponse.setAddressResponse(addressResponse);
    return authorResponse;
  }

  private Address buildAddress(AuthorCreateRequest request) {
    return Address.builder()
        .name(request.getAddressName())
        .number(request.getAddressNumber())
        .detail(request.getAddressDetail())
        .build();
  }
}
