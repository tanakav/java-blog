package com.vtanaka.blog.configs;

public final class ApplicationConstants {

  public static final String CONTEXT_PATH = "/blog";

  private ApplicationConstants() {}

  public static final class AuthorResource {

    public static final String AUTHOR_ID_PARAM = "author_id";

    public static final String AUTHOR_RESOURCE = CONTEXT_PATH + "/author";

    public static final String AUTHOR_URI = "/{" + AUTHOR_ID_PARAM + "}";

    private AuthorResource() {}
  }
}
