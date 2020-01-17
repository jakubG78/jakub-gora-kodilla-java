package com.kodilla.testing.library;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListBooksInHandsOfTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTest(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+testCounter);
    }
    @Test
    public void testListBooksInHandsOf() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf1Book = generateListOfNBooks(1);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        LibraryUser userWith0Books = new LibraryUser("John","Zero","02312312312");
        LibraryUser userWith1Book = new LibraryUser("John","One","12312312312");
        LibraryUser userWith5Books = new LibraryUser("John","Five","52312312312");
        when(libraryDatabaseMock.listBooksInHandsOf(userWith0Books))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksInHandsOf(userWith1Book))
                .thenReturn(resultListOf1Book);
        when(libraryDatabaseMock.listBooksInHandsOf(userWith5Books))
                .thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(userWith0Books);
        List<Book> theListOfBook1 = bookLibrary.listBooksInHandsOf(userWith1Book);
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(userWith5Books);
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(1, theListOfBook1.size());
        assertEquals(5, theListOfBooks5.size());
    }
}
