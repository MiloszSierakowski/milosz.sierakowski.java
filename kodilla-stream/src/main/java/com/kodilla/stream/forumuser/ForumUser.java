package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idNumber;
    private final String nameOfUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfTotalPosts;

    public ForumUser(int idNumber, String nameOfUser, char sex, LocalDate dateOfBirth, int numberOfTotalPosts) {
        this.idNumber = idNumber;
        this.nameOfUser = nameOfUser;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfTotalPosts = numberOfTotalPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfTotalPosts() {
        return numberOfTotalPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", nameOfUser='" + nameOfUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfTotalPosts=" + numberOfTotalPosts +
                '}';
    }
}
