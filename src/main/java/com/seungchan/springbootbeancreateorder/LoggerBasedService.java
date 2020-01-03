package com.seungchan.springbootbeancreateorder;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class LoggerBasedService {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public LoggerBasedService() {
        logger.info("LoggerBasedService constructor");
    }

    @PostConstruct
    public void initLoggerBasedService() {
        logger.info("LoggerBasedService post constructor");
    }
}
