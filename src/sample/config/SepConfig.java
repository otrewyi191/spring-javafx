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
//@ComponentScan(value = "sample")
@Profile("sep")
public class SepConfig {

    //Contitional注解只能用在Config里面，profile可以用在Component
    @Bean(name="addServer")
    public AddServer netprobe(){
        return new sample.hwm.add.netprobe();
    }

}
