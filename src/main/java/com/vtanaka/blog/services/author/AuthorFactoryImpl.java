package com.vtanaka.blog.services.author;

import com.vtanaka.blog.controllers.requests.AuthorCreateRequest;
import com.vtanaka.blog.models.Address;
import com.vtanaka.blog.models.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorFactoryImpl implements AuthorFactory {

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

  private Address buildAddress(AuthorCreateRequest request) {
    return Address.builder()
        .name(request.getAddressName())
        .number(request.getAddressNumber())
        .detail(request.getAddressDetail())
        .build();
  }
}
