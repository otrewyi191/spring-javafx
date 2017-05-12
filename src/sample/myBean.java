package sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Component
public class myBean {
    @Value("#{'${server.name}'.split(',')}")
    private List<String> servers;

    public String getText() {
        return servers.get(1);
    }
}
