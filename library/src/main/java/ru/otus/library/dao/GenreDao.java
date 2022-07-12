package ru.otus.library.dao;

import ru.otus.library.domain.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreDao {

  List<Genre> findAll();

  Optional<Genre> findById(long id);

  void insert(Genre genre);

  boolean update(Genre genre);

  boolean delete(long id);

}
