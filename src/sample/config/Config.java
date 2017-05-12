package sample.config;

import org.springframework.context.annotation.*;
import sample.hwm.AddServer;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "sample")
public class Config {

    @Bean(name="addServer")
    @Profile(value = "netprobe")
    public AddServer netprobe(){
        return new sample.hwm.add.netprobe();
    }

    @Bean(name="addServer")
    @Profile(value = "sep")
    public AddServer sep(){
        return new sample.hwm.add.sep();
    }

}
