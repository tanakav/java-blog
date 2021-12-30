package com.vtanaka.blog.configs;

import static lombok.AccessLevel.PRIVATE;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
public final class ApplicationConstants {

  public static final String CONTEXT_PATH = "/blog";

  @NoArgsConstructor(access = PRIVATE)
  public static final class AuthorResource {

    public static final String AUTHOR_ID_PARAM = "author_id";

    public static final String AUTHOR_RESOURCE = CONTEXT_PATH + "/author";

    public static final String AUTHOR_URI = "/author/" + AUTHOR_ID_PARAM;
  }
}
