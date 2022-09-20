package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProductManagerRichModelTest {
    ProductRepository repo =new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Зеленая миля", 599, "Стивен Кинг");
    Product book2 = new Book(2, "Фантазеры", 250, "Николай Носов");
    Product book3 = new Book(3, "Колыбельная", 900, "Чак Паланик");

    Product phone1 = new Smartphone(4, "iPhone", 60_000, "Apple");
    Product phone2 = new Smartphone(5, "Nokia", 10_000, "Nokia crp.");
    Product phone3 = new Smartphone(6, "Samsung", 50_000, "Android");
    Product phone4 = new Smartphone(7, "iPhone", 50_000, "Apple");

    @BeforeEach
    public void setup() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);
        manager.add(phone4);
    }


    @Test

    public void searchByExistingBook() {                     //поиск по существующей книге

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Зеленая миля");

        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }


    @Test

    public void searchByExistingLettersBook() {                     //поиск по букве в названиях книг

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("р");

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }
    @Test
    public void searchByExistingLettersBooks() {                     //поиск по буквам в названиях книг

        Product[] expected = {book1, book3};
        Product[] actual = manager.searchBy("я");

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }


    @Test

    public void searchNonByExistingBook() {                     //поиск по не существующей книге

        Product[] expected = {};
        Product[] actual = manager.searchBy("fs");

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }
    @Test

    public void searchByExistingPhone() {                     //поиск по существующей телефону

        Product[] expected = {phone1, phone4};
        Product[] actual = manager.searchBy("Apple");

        Assertions.assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }


    @Test

    public void searchByExistingLettersPhone() {                     //поиск по букве в названиях телефоне

        Product[] expected = {phone2};
        Product[] actual = manager.searchBy("c");

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }
    @Test
    public void searchByExistingLettersPhones() {                     //поиск по буквам в названиях телефоне

        Product[] expected = {phone2, phone3};
        Product[] actual = manager.searchBy("r");

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }


    @Test

    public void searchNonByExistingPhone() {                     //поиск по не существующей телефоне

        Product[] expected = {};
        Product[] actual = manager.searchBy("z");

        Assertions.assertArrayEquals(expected, actual);

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

    }

}
