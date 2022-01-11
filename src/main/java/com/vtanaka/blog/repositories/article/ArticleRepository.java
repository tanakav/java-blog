package com.vtanaka.blog.repositories.article;

import com.vtanaka.blog.models.Article;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

  List<Article> findAllByAuthorId(Long authorId);
}
