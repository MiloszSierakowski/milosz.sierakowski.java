package com.kodilla.good.patterns.food2door;

public class OrderDto {
    private final String userName;
    private boolean isOrdered;

    public OrderDto(String userName, boolean isOrdered) {
        this.userName = userName;
        this.isOrdered = isOrdered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "userName='" + userName + '\'' +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
