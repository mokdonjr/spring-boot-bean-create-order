package com.seungchan.springbootbeancreateorder;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@DependsOn({"groupCTypeAService", "testBean1"})
@Configuration("aConfig")
public class AConfig {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    public String value;

    public AConfig() {
        logger.info("AConfig constructor");
    }

    @PostConstruct
    public void initAConfig() {
        logger.info("AConfig post constructor");
    }

    @Bean("testBean1")
    public String testBean1() {
        logger.info("AConfig testBean");
        value = "testBeanValue";
        return "testBeanValue";
    }
}
