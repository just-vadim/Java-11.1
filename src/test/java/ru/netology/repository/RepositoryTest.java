package ru.netology.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RepositoryTest {
    private Repository repository = new Repository();
    Movie first = new Movie(1, "firstMovie", "firstGenre");
    Movie second = new Movie(2, "secondMovie", "secondGenre");
    Movie third = new Movie(3, "thirdMovie", "thirdGenre");

    @BeforeEach
    public void setUp(){
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    public void shouldFindAll() {
        Movie[] expected = new Movie[]{first, second, third};
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        Movie[] expected = new Movie[]{second};
        Movie[] actual = repository.findById(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindById() {
        Movie[] expected = null;
        Movie[] actual = repository.findById(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        Movie[] expected = new Movie[]{first, second};
        repository.removeById(3);
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveById() {
        Movie[] expected = new Movie[]{first, second, third};
        repository.removeById(5);
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        Movie[] expected = new Movie[]{};
        repository.removeAll();
        Movie[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}