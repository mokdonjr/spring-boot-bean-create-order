package com.seungchan.springbootbeancreateorder.groupa;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class GroupATypeCService extends AbsGroupAService {

    public GroupATypeCService() {
        logger.info("GroupATypeCService constructor");
    }

    @PostConstruct
    public void initCBeanTestService() {
        logger.info("GroupATypeCService post constructor");
    }
}
