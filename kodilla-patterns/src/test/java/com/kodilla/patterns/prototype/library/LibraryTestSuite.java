package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        //Creating list of books
        Book book1 = new Book(
                "Paradyzja", "Janusz Zajdel", LocalDate.of(2004, 5,10));
        Book book2 = new Book(
                "Pan lodowego ogrodu", "Jarosław Grzędowicz", LocalDate.of(2005, 3,12));
        Book book3 = new Book(
                "Rok 1984", "George Orwell", LocalDate.of(1949, 10,25));
        Book book4 = new Book(
                "Rzeźnia numer pięć", "Kurt Vonnegut", LocalDate.of(1969, 12,2));
        Book book5 = new Book(
                "Nieznośna lekkość bytu", "Milan Kundera", LocalDate.of(1982, 2,12));
        Book book6 = new Book(
                "Mock: pojedynek", "Marek Krajewski", LocalDate.of(2018, 7,19));

        Library library = new Library("Books");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);

        //Making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Books 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Books 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library.getName() + "\n" + library.getBooks());
        System.out.println(clonedLibrary.getName() + "\n" + clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName() + "\n" + deepClonedLibrary.getBooks());
        assertEquals(5, library.getBooks().size());
        assertEquals(6, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks().size(), library.getBooks().size());
        assertNotEquals(library.getBooks().size(), deepClonedLibrary.getBooks().size());
    }
}
