package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTestNonEmpty {

  @Test
  public void shouldRemoveIfExists() {
    MovieManager manager = new MovieManager();
    int idToRemove = 1;
    MovieItem first = new MovieItem(1, 1, "first", 1, 1);
    MovieItem second = new MovieItem(2, 2, "second", 1, 1);
    MovieItem third = new MovieItem(3, 3, "third", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{third, second};

//    assertEquals(expected, actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldNotRemoveIfNotExists() {
    MovieManager manager = new MovieManager();
    int idToRemove = 4;
    MovieItem first = new MovieItem(1, 1, "first", 1, 1);
    MovieItem second = new MovieItem(2, 2, "second", 1, 1);
    MovieItem third = new MovieItem(3, 3, "third", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);


    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{third, second, first};

    assertArrayEquals(expected, actual);
  }
}