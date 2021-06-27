package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

  @Test
  public void shouldReverseWhenArrayMax() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1, 1, "first", 1, 1);
    MovieItem second = new MovieItem(2, 2, "second", 1, 1);
    MovieItem third = new MovieItem(3, 3, "third", 1, 1);
    MovieItem fourth = new MovieItem(4, 4, "fourth", 1, 1);
    MovieItem fifth = new MovieItem(5, 5, "fifth", 1, 1);
    MovieItem six = new MovieItem(6, 6, "six", 1, 1);
    MovieItem seven = new MovieItem(7, 7, "seven", 1, 1);
    MovieItem eight = new MovieItem(8, 8, "eight", 1, 1);
    MovieItem nine = new MovieItem(9, 9, "nine", 1, 1);
    MovieItem ten = new MovieItem(10, 10, "ten", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(six);
    manager.add(seven);
    manager.add(eight);
    manager.add(nine);
    manager.add(ten);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{ten,nine,eight,seven,six,fifth,fourth,third, second,first};

//    assertEquals(expected, actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldReverseOverMax() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1, 1, "first", 1, 1);
    MovieItem second = new MovieItem(2, 2, "second", 1, 1);
    MovieItem third = new MovieItem(3, 3, "third", 1, 1);
    MovieItem fourth = new MovieItem(4, 4, "fourth", 1, 1);
    MovieItem fifth = new MovieItem(5, 5, "fifth", 1, 1);
    MovieItem six = new MovieItem(6, 6, "six", 1, 1);
    MovieItem seven = new MovieItem(7, 7, "seven", 1, 1);
    MovieItem eight = new MovieItem(8, 8, "eight", 1, 1);
    MovieItem nine = new MovieItem(9, 9, "nine", 1, 1);
    MovieItem ten = new MovieItem(10, 10, "ten", 1, 1);
    MovieItem eleven = new MovieItem(11, 11, "eleven", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(six);
    manager.add(seven);
    manager.add(eight);
    manager.add(nine);
    manager.add(ten);
    manager.add(eleven);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{eleven, ten,nine,eight,seven,six,fifth,fourth,third, second,first};

//    assertEquals(expected, actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldReverseWhenLowMax() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem(1, 1, "first", 1, 1);
    MovieItem second = new MovieItem(2, 2, "second", 1, 1);
    MovieItem third = new MovieItem(3, 3, "third", 1, 1);
    MovieItem fourth = new MovieItem(4, 4, "fourth", 1, 1);
    MovieItem fifth = new MovieItem(5, 5, "fifth", 1, 1);
    MovieItem six = new MovieItem(6, 6, "six", 1, 1);
    MovieItem seven = new MovieItem(7, 7, "seven", 1, 1);
    MovieItem eight = new MovieItem(8, 8, "eight", 1, 1);
    MovieItem nine = new MovieItem(9, 9, "nine", 1, 1);
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(six);
    manager.add(seven);
    manager.add(eight);
    manager.add(nine);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{nine,eight,seven,six,fifth,fourth,third, second,first};

//    assertEquals(expected, actual);
    assertArrayEquals(expected, actual);
  }

  @Test
  public void shouldReverseWhenArrayMax2() {
    MovieManager manager = new MovieManager();
    MovieItem first = new MovieItem();
    MovieItem second = new MovieItem();
    MovieItem third = new MovieItem();
    MovieItem fourth = new MovieItem();
    MovieItem fifth = new MovieItem();
    MovieItem six = new MovieItem();
    MovieItem seven = new MovieItem();
    MovieItem eight = new MovieItem();
    MovieItem nine = new MovieItem();
    MovieItem ten = new MovieItem();
    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fifth);
    manager.add(six);
    manager.add(seven);
    manager.add(eight);
    manager.add(nine);
    manager.add(ten);

    MovieItem[] actual = manager.getAll();
    MovieItem[] expected = new MovieItem[]{ten,nine,eight,seven,six,fifth,fourth,third, second,first};

//    assertEquals(expected, actual);
    assertArrayEquals(expected, actual);
  }
}