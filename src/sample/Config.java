package sample;

import org.springframework.context.annotation.*;
import sun.plugin.util.UserProfile;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/12 0012.
 */
@Configuration
@ComponentScan(value = "sample")
public class Config {
    @Bean
    @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS, value = "prototype")
    public UserProfile attachDocController() throws IOException {
        return new UserProfile();
    }
}
