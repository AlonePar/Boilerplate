package net.boblog.app.config;

import net.boblog.app.external.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by dave on 16/5/19.
 */
@Configuration
public class AppConfig {
    @Autowired Environment env;

    @Bean
    public SmsSender getSmsSender() {
        return new SmsSender(env.getProperty("appKey"), env.getProperty("appSecret"),
                env.getProperty("templateId"), env.getProperty("signature"));
    }
}
