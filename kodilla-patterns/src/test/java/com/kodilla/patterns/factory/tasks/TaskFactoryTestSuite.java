package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private final TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryShopping() {
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);

        System.out.println(shoppingTask.executeTask());

        assertAll(
                () -> assertEquals("Your task Quick shopping must be completed as soon as possible. " +
                        "You must buy Sugar in quantity 1.5", shoppingTask.executeTask()),
                () -> assertEquals("Quick shopping", shoppingTask.getTaskName()),
                () -> assertTrue(shoppingTask.isTaskExecuted())
        );
    }

    @Test
    void testFactoryPainting() {
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);

        System.out.println(paintingTask.executeTask());

        assertAll(
                () -> assertEquals("Your task Wall painting must be completed as soon as possible. You need to use " +
                        "Green paint and paint Living room", paintingTask.executeTask()),
                () -> assertEquals("Wall painting", paintingTask.getTaskName()),
                () -> assertTrue(paintingTask.isTaskExecuted())
        );
    }

    @Test
    void testFactoryDriving() {
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);

        System.out.println(drivingTask.executeTask());

        assertAll(
                () -> assertEquals("Your task Travel to Poland must be completed as soon" +
                        " as possible. You have to go to Poland using Plane", drivingTask.executeTask()),
                () -> assertEquals("Travel to Poland", drivingTask.getTaskName()),
                () -> assertTrue(drivingTask.isTaskExecuted())
        );
    }

}
