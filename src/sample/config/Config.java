package sample.config;

import org.springframework.context.annotation.*;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "sample")
@PropertySource(value = "classpath:properties/config.properties")
@ImportResource("classpath:springContext-test.xml")
public class Config {


}
