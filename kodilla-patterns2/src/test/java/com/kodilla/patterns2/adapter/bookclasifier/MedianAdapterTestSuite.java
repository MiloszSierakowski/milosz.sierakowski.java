package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Autor1","Tytul1",1991,"Podpis1"));
        bookSet.add(new Book("Autor2","Tytul2",1992,"Podpis2"));
        bookSet.add(new Book("Autor3","Tytul3",1993,"Podpis3"));
        bookSet.add(new Book("Autor4","Tytul4",1994,"Podpis4"));
        bookSet.add(new Book("Autor5","Tytul5",1995,"Podpis5"));
        bookSet.add(new Book("Autor6","Tytul6",1996,"Podpis6"));
        bookSet.add(new Book("Autor7","Tytul7",1997,"Podpis7"));
        bookSet.add(new Book("Autor8","Tytul8",1998,"Podpis8"));
        bookSet.add(new Book("Autor9","Tytul9",1999,"Podpis9"));
        bookSet.add(new Book("Autor10","Tytul10",2000,"Podpis10"));

        MedianAdapter medianAdapter = new MedianAdapter();

        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(medianPublicationYear);

        assertEquals(medianPublicationYear, 1996);
    }
}