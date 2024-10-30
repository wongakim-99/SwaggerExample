package org.zeorck.swaggertest.repository;

import org.zeorck.swaggertest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zeorck.swaggertest.model.Lend;
import org.zeorck.swaggertest.model.LendStatus;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
