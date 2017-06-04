package sample.config;

import org.springframework.context.annotation.*;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "sample")
@PropertySource(value = "classpath:properties/config.properties")
public class Config {


}
