package com.seungchan.springbootbeancreateorder.groupc;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;

@DependsOn("aConfig")
public abstract class AbsGroupCService {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public AbsGroupCService() {
        logger.info("AbsGroupCService constructor");
    }

    @PostConstruct
    public void initAbsGroupCService() {
        logger.info("AbsGroupCService post constructor");
    }
}
