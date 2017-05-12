package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sample.hwm.AddServer;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
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
