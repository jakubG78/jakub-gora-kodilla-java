package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static java.lang.Math.pow;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Original library");
        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(n -> library.getBooks().add(new Book("Book no. " + n, "Author no. " + n, LocalDate.now().minusMonths(n*n))));
        //When

        //Then
        library.getBooks().forEach(System.out::println);
        Assert.assertEquals(20, library.getBooks().size());
    }
}
