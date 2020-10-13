package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CartManagerTest {
    /*private CartManager manager = new CartManager();*/

    /*@Test
    public  void shouldSetReturnCount(){
        CartManager manager1 = new CartManager(5);
        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
        PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
        PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
        PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", 1, 1);
        PurchaseItem fifth = new PurchaseItem(5, 5, "fifth", 1, 1);
        PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", 1, 1);
        PurchaseItem seventh = new PurchaseItem(7, 7, "seventh", 1, 1);
        PurchaseItem eighth = new PurchaseItem(8, 8, "eighth", 1, 1);
        PurchaseItem ninth = new PurchaseItem(9, 9, "ninth", 1, 1);
        PurchaseItem tenth = new PurchaseItem(10, 10, "tenth", 1, 1);
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
        PurchaseItem[] expected = new PurchaseItem[] {tenth, ninth, eighth, seventh, sixth};
        PurchaseItem[] actual = manager1.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addToCart(){
        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
        manager.add(first);
        PurchaseItem[] expected = new PurchaseItem[]{first};
        PurchaseItem[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public  void getLast(){
        PurchaseItem first = new PurchaseItem(1, 1, "first", 1, 1);
        PurchaseItem second = new PurchaseItem(2, 2, "second", 1, 1);
        PurchaseItem third = new PurchaseItem(3, 3, "third", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        PurchaseItem[] expected = new PurchaseItem[] {third, second, first};
        PurchaseItem[] actual = manager.getLast();
        assertArrayEquals(expected, actual);
    }*/
}