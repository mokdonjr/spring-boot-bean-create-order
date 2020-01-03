package com.seungchan.springbootbeancreateorder.groupa;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@DependsOn({"groupCTypeAService", "aConfig"})
@Service
public class GroupATypeAService extends AbsGroupAService {

    public GroupATypeAService() {
        logger.info("GroupATypeAService constructor");
    }

    @PostConstruct
    public void initABeanTestService() {
        logger.info("GroupATypeAService post constructor");
    }
}
