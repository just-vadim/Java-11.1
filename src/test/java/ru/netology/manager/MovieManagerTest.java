package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    private MovieManager manager = new MovieManager();

    @Test
    public  void shouldSetReturnCount(){
        MovieManager manager1 = new MovieManager(5);
        Movie first = new Movie(1, "firstMovie", "firstGenre");
        Movie second = new Movie(2, "secondMovie", "secondGenre");
        Movie third = new Movie(3, "thirdMovie", "thirdGenre");
        Movie fourth = new Movie(4, "fourthMovie", "fourthGenre");
        Movie fifth = new Movie(5, "fifthMovie", "fifthGenre");
        Movie sixth = new Movie(6, "sixth", "sixthGenre");
        Movie seventh = new Movie(7, "seventhMovie", "sixthGenre");
        Movie eighth = new Movie(8, "eighthMovie", "eightGenre");
        Movie ninth = new Movie(9, "ninthMovie", "ninthGenre");
        Movie tenth = new Movie(10, "tenthMovie", "tenthGenre");
        manager1.add(first);
        manager1.add(second);
        manager1.add(third);
        manager1.add(fourth);
        manager1.add(fifth);
        manager1.add(sixth);
        manager1.add(seventh);
        manager1.add(eighth);
        manager1.add(ninth);
        manager1.add(tenth);
        Movie[] expected = new Movie[] {tenth, ninth, eighth, seventh, sixth};
        Movie[] actual = manager1.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addToManager(){
        Movie first = new Movie(1, "firstMovie", "firstGenre");
        manager.add(first);
        Movie[] expected = new Movie[]{first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public  void getLast(){
        Movie first = new Movie(1, "firstMovie", "firstGenre");
        Movie second = new Movie(2, "secondMovie", "secondGenre");
        Movie third = new Movie(3, "thirdMovie", "thirdMovie");
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Movie[] expected = new Movie[] {third, second, first};
        Movie[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }
}