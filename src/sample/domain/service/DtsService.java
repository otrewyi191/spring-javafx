package sample.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import sample.domain.entity.Dts;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Component
public class DtsService {
    @Autowired
    private Dts dtsEntity;

    @Autowired
    private ApplicationEventPublisher applicationContext;

    public void setDtsNum(String dts) {
        dtsEntity.setDts(dts);
        applicationContext.publishEvent(dtsEntity);
    }



}
