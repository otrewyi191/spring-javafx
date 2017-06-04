package sample.domain.entity;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
@Component
public class Svn {
    public String getBaseUrl() {
        return BaseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        BaseUrl = baseUrl;
    }

    public int getRevision() {
        return Revision;
    }

    public void setRevision(int revision) {
        Revision = revision;
    }

    String BaseUrl;
    int Revision;


    @EventListener
    public void listner(Dts dts) {
        System.out.println("listener zzx xxxxxxxxx");
    }
}
