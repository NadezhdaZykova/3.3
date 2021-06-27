package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerNonEmptyWithSetupTest {
    private MovieManager manager = new MovieManager();
    private MovieItem first = new MovieItem(1, 1, "first", 1, 1);
    private MovieItem second = new MovieItem(2, 2, "second", 1, 1);
    private MovieItem third = new MovieItem(3, 3, "third", 1, 1);
    private MovieItem fourth = new MovieItem(4, 4, "fourth", 1, 1);
    private MovieItem fifth = new MovieItem(5, 5, "fifth", 1, 1);
    private MovieItem six = new MovieItem(6, 6, "six", 1, 1);
    private MovieItem seven = new MovieItem(7, 7, "seven", 1, 1);
    private MovieItem eight = new MovieItem(8, 8, "eight", 1, 1);
    private MovieItem nine = new MovieItem(9, 9, "nine", 1, 1);
    private MovieItem ten = new MovieItem(10, 10, "ten", 1, 1);
    private MovieItem eleven = new MovieItem(11, 11, "eleven", 1, 1);


    @BeforeEach
    public void setUp() {
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
    }
}