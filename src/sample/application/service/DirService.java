package sample.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import sample.application.entity.Dir;
import sample.domain.entity.Dts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Component
public class DirService {

    @Autowired
    private Dir dirEntity;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @EventListener
    public void setDirName(Dts dts) {
        String dtsName = dts.getDts();
        dirEntity.setDtsDirName(dtsName);
        System.out.println("dir created");
        applicationEventPublisher.publishEvent(dirEntity);
    }

}
