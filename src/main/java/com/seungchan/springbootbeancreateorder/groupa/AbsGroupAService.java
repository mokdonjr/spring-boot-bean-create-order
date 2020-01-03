package com.seungchan.springbootbeancreateorder.groupa;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DependsOn;

@DependsOn("groupCTypeAService")
public abstract class AbsGroupAService/* extends LoggerBasedService*/ {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public AbsGroupAService() {
        logger.info("AbsGroupAService constructor");
    }

    @PostConstruct
    public void initAbsBeanTestService() {
        logger.info("AbsGroupAService post constructor");
    }
}
