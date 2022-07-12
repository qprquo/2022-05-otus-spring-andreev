package ru.otus.library.service.converters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import ru.otus.library.domain.Author;

@Component
class AuthorConverterImpl implements AuthorConverter {

  @Override
  public String convert(Author author) {
    return "Author(id=" + author.getId() + ", name=" + author.getName() + ")";
  }

  @Override
  public String convert(List<Author> authors) {
    return authors.stream().map((author) -> convert(author)).collect(Collectors.joining("\n"));
  }

}
