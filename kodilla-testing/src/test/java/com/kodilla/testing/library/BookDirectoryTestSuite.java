package com.kodilla.testing.library;

import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Nested
    @DisplayName("Tests of list of books with condition")
    public class TestListBooksWithCondition {
        private List<Book> generateListOfNBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<>();
            for (int n = 0; n < booksQuantity; n++) {
                Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
        }

        @Mock
        private LibraryDatabase libraryDatabaseMock;

        @Test
        void testListBooksWithConditionsReturnList() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
            //When
            List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");
            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
            //When
            List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");
            //Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            //Given
            LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            //When
            List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");
            //Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }


    @Nested
    @DisplayName("Tests of books in hands of")
    public class TestListBooksInHandsOf {

        private List<Book> generateBooksInHands(int booksQuantity) {
            List<Book> resultList = new ArrayList<>();
            for (int n = 0; n < booksQuantity; n++) {
                Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
        }
        private List<LibraryUser> generateUsers(int booksInHands) {
            List<LibraryUser> resultBooks = new ArrayList<>();
            for (int i = 0; i < booksInHands; i++) {
                LibraryUser libraryUser = new LibraryUser("Name" + i, "lastName" +i,
                        "132414" + i);
                resultBooks.add(libraryUser);
            }
        }

        @Mock
        private LibraryDatabase libraryDatabaseMock;

        @Test
        void testListBooksInHands() {
            //Given
            LibraryUser libraryUser = new LibraryUser("Name", "Lastname", "peselId");
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultBooksInHands0 = new ArrayList<Book>();
            List<Book> resultBooksInHands1 = generateBooksInHands(1);
            List<Book> resultBooksInHands5 = generateBooksInHands(5);
            when(libraryDatabaseMock.listBooksInHandsOf()).thenReturn(resultBooksInHands0);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultBooksInHands1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultBooksInHands5);
            //When
            List<Book> theListOfBooksInHands0 = bookLibrary.listBooksInHandsOf(libraryUser);
            List<Book> theListOfBooksInHands1 = bookLibrary.listBooksInHandsOf(libraryUser);
            List<Book> theListOfBooksInHands5 = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(0, theListOfBooksInHands0.size());
            assertEquals(1, theListOfBooksInHands1.size());
            assertEquals(5, theListOfBooksInHands5.size());
        }
    }
}
