package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerZeroMoviesTest {
    private MovieManager manager = new MovieManager();
    Movie first = new Movie(1, "firstMovie", "firstGenre");

    @Test
    public void addToManager(){
        manager.add(first);
        Movie[] expected = new Movie[]{first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public  void getLast(){
        manager.add(first);
        Movie[] expected = new Movie[] {first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }
}