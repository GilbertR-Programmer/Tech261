package com.sparta.grr;

import java.io.IOException;

import java.util.logging.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logData.log",true);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //both these set levels are independent
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());

        logger.info("This is an info message");
        logger.warning("RUh DUh");
        logger.fine("tis all good");

    }
}
