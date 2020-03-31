package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Original library");
        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(n -> library.getBooks().add(new Book("Book no. " + n, "Author no. " + n, LocalDate.now().minusMonths(n * n))));

        //making a shallow clone of object library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow cloned library.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep clone of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep cloned library.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Difference book", "Dr. Strange", LocalDate.now().minusYears(20)));

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(21, library.getBooks().size());
        Assert.assertEquals(21, shallowClonedLibrary.getBooks().size());
        Assert.assertNotEquals(21, deepClonedLibrary.getBooks().size());
    }
}
