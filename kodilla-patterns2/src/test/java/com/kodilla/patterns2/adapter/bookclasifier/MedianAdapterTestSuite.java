package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Test1", "test1", 1999, "test1");
        Book book2 = new Book("Test2", "test2", 1986, "test2");
        Book book3 = new Book("Test3", "test3", 1964, "test3");
        Book book4 = new Book("Test4", "test4", 1996, "test4");
        Book book5 = new Book("Test5", "test5", 2000, "test5");
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1996, median, 0);

    }
}
