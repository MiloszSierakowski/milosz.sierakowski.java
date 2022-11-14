package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        Book book = new Book("Wolf of the mountain", "Dylan Murphy", LocalDate.of(2003, 1, 1));
        Book book1 = new Book("Slaves of dreams", "Phoebe Pearson", LocalDate.of(2012, 1, 1));
        Book book2 = new Book("Obliteration of heaven", "Morgan Walsh", LocalDate.of(2001, 1, 1));
        Book book3 = new Book("Rejecting the night", "Aimee Murphy", LocalDate.of(2015, 1, 1));
        Book book4 = new Book("Gangsters and kings", "Ryan Talley", LocalDate.of(2007, 1, 1));
        Book book5 = new Book("Unity without duty", "Madelynn Carson", LocalDate.of(2007, 1, 1));
        Book book6 = new Book("Enemies of eternity", "Giancarlo Guerrero", LocalDate.of(2009, 1, 1));

        Library library = new Library("Warszawska Biblioteka");
        library.addBookToList(book);
        library.addBookToList(book1);
        library.addBookToList(book2);
        library.addBookToList(book3);
        library.addBookToList(book4);
        library.addBookToList(book5);
        library.addBookToList(book6);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Gdanska Biblioteka");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Gdynska Biblioteka");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.removeBookFromList(book);

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(6, library.getBooks().size());
        assertEquals(6, clonedLibrary.getBooks().size());
        assertEquals(7, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
