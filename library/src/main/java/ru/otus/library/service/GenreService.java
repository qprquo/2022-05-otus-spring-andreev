package ru.otus.library.service;

import ru.otus.library.domain.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

  Optional<Genre> findById(Long id);

  void insert(Genre genre);

  boolean update(Genre genre);

  List<Genre> findAll();

  boolean delete(Long id);

}
