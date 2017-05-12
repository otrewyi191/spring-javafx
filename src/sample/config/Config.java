package sample.config;

import org.springframework.context.annotation.*;
import sample.hwm.AddServer;
import sample.hwm.servertype.netprobe;
import sample.hwm.servertype.sep;


/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
@ComponentScan(value = "sample")
public class Config {

    @Bean(name="addServer")
    @Conditional(netprobe.class)
    public AddServer netprobe(){
        return new sample.hwm.add.netprobe();
    }

    @Bean(name="addServer")
    @Conditional(sep.class)
    public AddServer sep(){
        return new sample.hwm.add.sep();
    }
}
