package com.vtanaka.blog.configs;

public final class ApplicationConstants {

  public static final String CONTEXT_PATH = "/blog";

  private ApplicationConstants() {}

  public static final class AuthorResource {

    public static final String AUTHOR_ID_PARAM = "author_id";

    public static final String AUTHOR_RESOURCE = CONTEXT_PATH + "/authors";

    public static final String AUTHOR_URI = "/{" + AUTHOR_ID_PARAM + "}";

    private AuthorResource() {}
  }

  public static final class ArticleResource {

    public static final String ARTICLE_ID_PARAM = "article_id";

    public static final String ARTICLE_RESOURCE = CONTEXT_PATH + "/articles";

    public static final String ARTICLE_URI = "/{" + ARTICLE_ID_PARAM + "}";

    private ArticleResource() {}
  }
}
