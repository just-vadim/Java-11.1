package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerOneMovieTest {
    private MovieManager manager = new MovieManager();
    Movie first = new Movie(1, "firstMovie", "firstGenre");

    @BeforeEach
    public void setUp() {
        manager.add(first);
    }

    @Test
    public void addToManager(){
        Movie second = new Movie(2, "secondMovie", "secondGenre");
        manager.add(second);
        Movie[] expected = new Movie[]{second, first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public  void getLast(){
        Movie second = new Movie(2, "secondMovie", "secondGenre");
        manager.add(second);
        Movie[] expected = new Movie[]{second, first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }
}