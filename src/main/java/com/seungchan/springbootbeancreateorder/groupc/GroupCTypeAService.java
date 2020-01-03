package com.seungchan.springbootbeancreateorder.groupc;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service("groupCTypeAService")
public class GroupCTypeAService extends AbsGroupCService {

    public GroupCTypeAService() {
        logger.info("GroupCTypeAService constructor");
    }

    @PostConstruct
    public void initGroupCTypeAService() {
        logger.info("GroupCTypeAService post constructor");
    }
}
