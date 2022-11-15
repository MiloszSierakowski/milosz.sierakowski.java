package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Your task " + this.taskName + " must be completed as soon as possible. " +
                "You have to go to " + where + " using " + using;
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
