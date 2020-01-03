package com.seungchan.springbootbeancreateorder.groupc;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class GroupCTypeBService extends AbsGroupCService {

    public GroupCTypeBService() {
        logger.info("GroupCTypeBService constructor");
    }

    @PostConstruct
    public void initGroupCTypeBService() {
        logger.info("GroupCTypeBService post constructor");
    }
}
