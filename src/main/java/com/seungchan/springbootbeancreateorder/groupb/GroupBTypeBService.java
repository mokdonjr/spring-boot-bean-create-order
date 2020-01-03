package com.seungchan.springbootbeancreateorder.groupb;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class GroupBTypeBService extends AbsGroupBService {

    public GroupBTypeBService() {
        logger.info("GroupBTypeBService constructor");
    }

    @PostConstruct
    public void initGroupBTypeBService() {
        logger.info("GroupBTypeBService post constructor");
        logger.info("aConfigValue:{}", aConfig.value);
    }
}
