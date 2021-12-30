package com.vtanaka.blog.repositories.author;

import com.vtanaka.blog.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {}
