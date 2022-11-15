package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "Your task " + this.taskName + " must be completed as soon as possible. " +
                "You must buy " + whatToBuy + " in quantity " + quantity;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }


    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
