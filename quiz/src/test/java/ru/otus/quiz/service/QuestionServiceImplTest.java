package ru.otus.quiz.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.otus.quiz.dao.QuestionDao;
import ru.otus.quiz.domain.Answer;
import ru.otus.quiz.domain.Question;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@DisplayName("Сервис для работы с вопросами")
@ExtendWith(MockitoExtension.class)
public class QuestionServiceImplTest {

  @Mock
  private IOService ioService;
  @Mock
  private QuestionDao questionDao;

  @InjectMocks
  private QuestionServiceImpl questionService;

  @BeforeEach
  void setUp() {
    given(questionDao.findAll()).willReturn(List.of(
      new Question(1, "Hello world")
        .addAnswer(new Answer("Yes", true))
        .addAnswer(new Answer("No"))
    ));
  }

  @Test
  void shouldReturnListOfQuestions() {
    var questions = questionService.listAll();
    assertThat(questions).isNotEmpty().isEqualTo(List.of(
      new Question(1, "Hello world")
        .addAnswer(new Answer("Yes", true))
        .addAnswer(new Answer("No"))
    ));
  }
}
