package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLoggerInstance(){
        logger = Logger.INSTANCE;
        logger.log("Milosz");
    }

    @Test
    void TestGetLastLog() {
        assertEquals("Milosz",logger.getLastLog());
    }

    @Test
    void TestGetLastLogIsNotEmpty(){
        assertNotEquals("",logger.getLastLog());
    }

}
