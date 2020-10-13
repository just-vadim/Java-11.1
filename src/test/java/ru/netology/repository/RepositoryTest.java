package ru.netology.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RepositoryTest {
    private Repository repository = new Repository();
    PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
    PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
    PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);

    @BeforeEach
    public void setUp(){
        repository.save(first);
        repository.save(second);
        repository.save(third);
    }

    @Test
    public void shouldFindAll() {
        PurchaseItem[] expected = new PurchaseItem[]{first, second, third};
        PurchaseItem[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        PurchaseItem[] expected = new PurchaseItem[]{second};
        PurchaseItem[] actual = repository.findById(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindById() {
        PurchaseItem[] expected = null;
        PurchaseItem[] actual = repository.findById(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        PurchaseItem[] expected = new PurchaseItem[]{first, second};
        repository.removeById(3);
        PurchaseItem[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveById() {
        PurchaseItem[] expected = new PurchaseItem[]{first, second, third};
        repository.removeById(5);
        PurchaseItem[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        PurchaseItem[] expected = new PurchaseItem[]{};
        repository.removeAll();
        PurchaseItem[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
}