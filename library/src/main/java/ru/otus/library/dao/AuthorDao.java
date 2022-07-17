package ru.otus.library.dao;

import ru.otus.library.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {

  List<Author> findAll();

  Optional<Author> findById(Long id);

  void insert(Author author);

  boolean update(Author author);

  boolean delete(Long id);

}
