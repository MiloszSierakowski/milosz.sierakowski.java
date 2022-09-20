package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUsers = new ArrayList<>();

    public Forum() {
        theForumUsers.add(new ForumUser(1, "Milosz",
                'M', LocalDate.of(2018,4,29),79));
        theForumUsers.add(new ForumUser(2, "Artur",
                'M', LocalDate.of(1999,1,5),10));
        theForumUsers.add(new ForumUser(3, "Bartosz",
                'M', LocalDate.of(1989,4,23),0));
        theForumUsers.add(new ForumUser(4, "Karol",
                'M', LocalDate.of(2000,5,15),56));
        theForumUsers.add(new ForumUser(5, "Piotr",
                'M', LocalDate.of(2001,10,3),84));
        theForumUsers.add(new ForumUser(6, "Monika",
                'F', LocalDate.of(2012,11,12),23));
        theForumUsers.add(new ForumUser(7, "Alicja",
                'F', LocalDate.of(1991,2,25),8));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsers);
    }

}
