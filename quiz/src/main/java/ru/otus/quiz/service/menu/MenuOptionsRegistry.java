package ru.otus.quiz.service.menu;

import java.util.List;
import java.util.Optional;

public interface MenuOptionsRegistry {
  List<MenuOption> getAvailableMenuOptions();

  Optional<MenuOption> getMenuOptionById(int id);
}