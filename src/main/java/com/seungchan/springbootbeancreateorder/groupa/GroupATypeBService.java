package com.seungchan.springbootbeancreateorder.groupa;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class GroupATypeBService extends AbsGroupAService {

    public GroupATypeBService() {
        logger.info("GroupATypeBService constructor");
    }

    @PostConstruct
    public void initBBeanTestService() {
        logger.info("GroupATypeBService post constructor");
    }
}
