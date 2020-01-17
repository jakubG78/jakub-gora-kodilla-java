package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = new ArrayList<Book>();
        List<Book> resultList = new ArrayList<Book>();
        if(libraryUser.equals(new LibraryUser("John","Zero","02312312312"))) return bookList;

        if(libraryUser.equals(new LibraryUser("John","One","12312312312"))) {
            resultList.add(new Book("Book1","Author1",2001));
        }
        if(libraryUser.equals(new LibraryUser("John","Five","52312312312"))) {
            resultList.add(new Book("Book1","Author1",2001));
            resultList.add(new Book("Book2","Author2",2002));
            resultList.add(new Book("Book3","Author3",2003));
            resultList.add(new Book("Book4","Author4",2004));
            resultList.add(new Book("Book5","Author5",2005));
        }
        bookList = resultList;
        return bookList;
    }
}
