package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerSeveralMoviesTest {
    private MovieManager manager = new MovieManager();
    Movie first = new Movie(1, "firstMovie", "firstGenre");
    Movie second = new Movie(2, "secondMovie", "secondGenre");
    Movie third = new Movie(3, "thirdMovie", "thirdGenre");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void addToManager(){
        Movie fourth = new Movie(4, "fourthMovie", "fourthGenre");
        manager.add(fourth);
        Movie[] expected = new Movie[]{fourth, third, second, first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public  void getLast(){
        Movie fourth = new Movie(4, "fourthMovie", "fourthGenre");
        manager.add(fourth);
        Movie[] expected = new Movie[]{fourth, third, second, first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }
}