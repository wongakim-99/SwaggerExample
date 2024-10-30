package org.zeorck.swaggertest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zeorck.swaggertest.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
