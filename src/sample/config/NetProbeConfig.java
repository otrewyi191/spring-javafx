package sample.config;

import org.springframework.context.annotation.*;
import sample.hwm.AddServer;
import sample.hwm.servertype.netprobe;
import sample.hwm.servertype.sep;


/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
//@ComponentScan(value = "sample")
@Profile("netprobe")
public class NetProbeConfig {

    //Contitional注解只能用在Config里面，profile可以用在Component
    @Bean(name="addServer")
    public AddServer netprobe(){
        return new sample.hwm.add.netprobe();
    }

}
