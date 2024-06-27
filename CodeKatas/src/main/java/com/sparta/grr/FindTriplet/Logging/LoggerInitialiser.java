package com.sparta.grr.FindTriplet.Logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerInitialiser {

    public static void setupLogger(Logger logger, Level fileLevel, Level consoleLevel){
        setupConsoleHandler(logger, consoleLevel);
        try {
            setupFileHandler(logger, fileLevel,false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.setUseParentHandlers(false);
        logger.setLevel(fileLevel);
    }

    private static void setupFileHandler(Logger logger, Level level, boolean append) throws IOException {
        FileHandler fileHandler = new FileHandler("src/main/resources/logData.log",append);
        fileHandler.setLevel(level);
        fileHandler.setFormatter(new CustomFormatter());
        logger.addHandler(fileHandler);
    }

    private static void setupConsoleHandler(Logger logger, Level level){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(level);
        consoleHandler.setFormatter(new CustomFormatter());
        logger.addHandler(consoleHandler);
    }

}
