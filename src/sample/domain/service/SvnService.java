package sample.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import sample.domain.entity.Svn;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Component
public class SvnService {

    @Autowired
    private Svn svnEntity;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void setSvnRevision(int revision) {
        svnEntity.setRevision(revision);
        applicationEventPublisher.publishEvent(svnEntity);
    }

    public void setBaseUrl(String baseUrl) {
        svnEntity.setBaseUrl(baseUrl);
        applicationEventPublisher.publishEvent(svnEntity);
    }
}
