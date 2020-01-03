package com.seungchan.springbootbeancreateorder.groupb;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;

import com.seungchan.springbootbeancreateorder.AConfig;

@DependsOn("aConfig")
public abstract class AbsGroupBService /*extends LoggerBasedService */{
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected AConfig aConfig;

    public AbsGroupBService() {
        logger.info("AbsGroupBService constructor");
    }

    @PostConstruct
    public void initAbsGroupBService() {
        logger.info("AbsGroupBService post constructor");
        logger.info("aConfigValue:{}", aConfig.value);
    }
}
