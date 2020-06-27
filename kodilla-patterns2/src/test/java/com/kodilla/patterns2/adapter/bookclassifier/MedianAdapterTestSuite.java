package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<Book>();
        for (int n = 0; n < 10; n++) {
            bookSet.add(new Book("Autor", "Title", 1978 + n, "TestSig#1"));
        }
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int booksMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1983, booksMedian);

    }
}
