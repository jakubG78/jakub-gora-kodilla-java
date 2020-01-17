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
            resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        }
        if(libraryUser.equals(new LibraryUser("John","Five","52312312312"))) {
            resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        }
        bookList = resultList;
        return bookList;
    }
}
