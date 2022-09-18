package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(double numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(double numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(double numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public void setAverageNumberOfPostsPerUser(double averageNumberOfPostsPerUser) {
        this.averageNumberOfPostsPerUser = averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public void setAverageNumberOfCommentsPerUser(double averageNumberOfCommentsPerUser) {
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void setAverageNumberOfCommentsPerPost(double averageNumberOfCommentsPerPost) {
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        double totalPost = statistics.postsCount();
        double totalComment = statistics.commentsCount();
        double totalUsers = statistics.usersNames().size();

        setNumberOfUsers(totalUsers);
        setNumberOfPosts(totalPost);
        setNumberOfComments(totalComment);

        if (totalUsers != 0) {
            setAverageNumberOfPostsPerUser(totalPost / totalUsers);
            setAverageNumberOfCommentsPerUser(totalComment / totalUsers);
        }

        if (totalPost != 0) {
            setAverageNumberOfCommentsPerPost(totalComment / totalPost);
        }
    }

    public void showStatistics() {
        System.out.println("Liczba urzytkownikow " + getNumberOfUsers());
        System.out.println("Liczba postow " + getNumberOfPosts());
        System.out.println("liczba komentarzy " + getNumberOfComments());
        System.out.println("Srednia liczba postow na urzytkownika " + getAverageNumberOfPostsPerUser());
        System.out.println("Srednia liczba komentarzy na urzytkownika " + getAverageNumberOfCommentsPerUser());
        System.out.println("Srednia liczba komentarzy na post " + getAverageNumberOfCommentsPerPost());
    }
}
