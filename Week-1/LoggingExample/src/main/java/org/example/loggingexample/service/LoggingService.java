package org.example.loggingexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingService.class);

    public void execute() {

        logger.info("Application Started");

        logger.warn("This is a warning message");

        logger.error("This is an error message");
    }
}