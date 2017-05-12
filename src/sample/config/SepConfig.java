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
@Profile("sep")
public class SepConfig {

    @Bean(name="addServer")
    public AddServer sep(){
        return new sample.hwm.add.sep();
    }
}
