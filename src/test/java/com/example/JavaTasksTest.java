package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaTasksTest {

    JavaTasks tasks = new JavaTasks();

    // Zadanie 1: Operacje arytmetyczne
    @Test
    void testPerformOperations() {
        int[] result = tasks.performOperations(10, 2);
        assertArrayEquals(new int[]{12, 8, 20, 5}, result);
    }

    // Zadanie 2: Sumowanie liczb
    @Test
    void testSumNumbers() {
        int sum = tasks.sumNumbers(1, 2, 3, 4, 5);
        assertEquals(15, sum);
    }

    // Zadanie 3: Liczby pierwsze
    @Test
    void testIsPrime() {
        assertTrue(tasks.isPrime(7));
        assertFalse(tasks.isPrime(4));
    }

    // Zadanie 5: Liczby parzyste i nieparzyste
    @Test
    void testSplitEvenOdd() {
        int[][] result = tasks.splitEvenOdd(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{2, 4}, result[0]); // Parzyste
        assertArrayEquals(new int[]{1, 3, 5}, result[1]); // Nieparzyste
    }

    // Zadanie 6: Znajdowanie minimum i maksimum
    @Test
    void testFindMinMax() {
        int[] result = tasks.findMinMax(1, 2, 3, 4, 5);
        assertArrayEquals(new int[]{1, 5}, result);
    }

    // Zadanie 7: Testy dla klas dziedziczących po Vehicle
    @Test
    void testCarMovement() {
        Vehicle car = new Car();
        assertEquals("Car is driving to Berlin", car.move("Berlin"));
    }

    @Test
    void testBicycleMovement() {
        Vehicle bicycle = new Bicycle();
        assertEquals("Bicycle is cycling to Warsaw", bicycle.move("Warsaw"));
    }

    // Zadanie 8: Testy klasy Rectangle
    @Test
    void testRectangleMethods() {
        Rectangle rectangle = new Rectangle();
        assertEquals(20.0, rectangle.calculateArea(4, 5));
        assertEquals(18.0, rectangle.calculatePerimeter(4, 5));
    }

    // Zadanie 9: Suma wierszy w macierzy
    @Test
    void testSumRows() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result = tasks.sumRows(matrix);
        assertArrayEquals(new int[]{6, 15, 24}, result);
    }

    // Zadanie 10: Test klasy Square
    @Test
    void testSquare() {
        Shape square = new Square(4);
        assertEquals(16, square.calculateArea());
        assertEquals(16, square.calculatePerimeter());
    }

    // Zadanie 11: Testowanie zapisu do pliku i odczytu z pliku
    @Test
    void testWriteAndReadFromFile() {

        FileHandler fileHandler = new FileHandler();;
        // Tekst do zapisania
        String text = "To jest przykładowy tekst do zapisania.";

        // Zapisz tekst do pliku
        fileHandler.writeToFile(text);

        // Odczytaj zawartość z pliku
        String fileContent = fileHandler.readFromFile();

        // Sprawdź, czy zapisany i odczytany tekst są zgodne
        assertEquals(text + "\n", fileContent);

    }

    @Nested
    class PersonSorterTest {

        private PersonSorter sorter;
        private List<Person> people;

        @BeforeEach
        void setUp() {
            sorter = new PersonSorter();
            people = Arrays.asList(
                    new Person("Anna", 28, 5000),
                    new Person("Jan", 34, 5500),
                    new Person("Marek", 22, 4500),
                    new Person("Kasia", 28, 6000),
                    new Person("Tomasz", 40, 7000)
            );
        }

        // Testowanie sortowania po nazwisku
        @Test
        void testSortByName() {
            List<Person> sortedPeople = sorter.sortByName(people);

            assertEquals("Anna", sortedPeople.get(0).getName());
            assertEquals("Jan", sortedPeople.get(1).getName());
            assertEquals("Kasia", sortedPeople.get(2).getName());
            assertEquals("Marek", sortedPeople.get(3).getName());
            assertEquals("Tomasz", sortedPeople.get(4).getName());
        }

        // Testowanie sortowania po wieku
        @Test
        void testSortByAge() {
            List<Person> sortedPeople = sorter.sortByAge(people);

            assertEquals(22, sortedPeople.get(0).getAge());
            assertEquals(28, sortedPeople.get(1).getAge());
            assertEquals(28, sortedPeople.get(2).getAge());
            assertEquals(34, sortedPeople.get(3).getAge());
            assertEquals(40, sortedPeople.get(4).getAge());
        }

        // Testowanie sortowania po wynagrodzeniu (malejąco)
        @Test
        void testSortBySalary() {
            List<Person> sortedPeople = sorter.sortBySalary(people);

            assertEquals(7000.0, sortedPeople.get(0).getSalary());
            assertEquals(6000.0, sortedPeople.get(1).getSalary());
            assertEquals(5500.0, sortedPeople.get(2).getSalary());
            assertEquals(5000.0, sortedPeople.get(3).getSalary());
            assertEquals(4500.0, sortedPeople.get(4).getSalary());
        }

        // Testowanie, czy oryginalna lista nie została zmodyfikowana po sortowaniu po nazwisku
        @Test
        void testOriginalListNotModifiedBySortByName() {
            List<Person> originalList = new ArrayList<>(people);
            sorter.sortByName(people);
            assertEquals(originalList, people);  // Sprawdzenie, czy oryginalna lista pozostała niezmieniona

            testSortByName();
        }

        // Testowanie, czy oryginalna lista nie została zmodyfikowana po sortowaniu po wieku
        @Test
        void testOriginalListNotModifiedBySortByAge() {
            List<Person> originalList = new ArrayList<>(people);
            sorter.sortByAge(people);
            assertEquals(originalList, people);  // Sprawdzenie, czy oryginalna lista pozostała niezmieniona

            testSortByAge();
        }

        // Testowanie, czy oryginalna lista nie została zmodyfikowana po sortowaniu po wynagrodzeniu
        @Test
        void testOriginalListNotModifiedBySortBySalary() {
            List<Person> originalList = new ArrayList<>(people);
            sorter.sortBySalary(people);
            assertEquals(originalList, people);  // Sprawdzenie, czy oryginalna lista pozostała niezmieniona

            testSortBySalary();
        }
    }
}

