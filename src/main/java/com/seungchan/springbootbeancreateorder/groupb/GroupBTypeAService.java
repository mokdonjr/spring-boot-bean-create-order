package com.seungchan.springbootbeancreateorder.groupb;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class GroupBTypeAService extends AbsGroupBService {

    public GroupBTypeAService() {
        logger.info("GroupBTypeAService constructor");
    }

    @PostConstruct
    public void initGroupBTypeAService() {
        logger.info("GroupBTypeAService post constructor");
        logger.info("aConfigValue:{}", aConfig.value);
    }
}
