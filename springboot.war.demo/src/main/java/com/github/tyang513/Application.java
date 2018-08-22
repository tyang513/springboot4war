package com.github.tyang513;

import com.github.tyang513.logger.ChangleLoggerLevelProcessUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author tao.yang
 * @date 2018-08-17
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {



    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        logger.info("=========== Application.main =============");
        ChangleLoggerLevelProcessUnit changleLoggerLevelProcessUnit = new ChangleLoggerLevelProcessUnit();
        changleLoggerLevelProcessUnit.initLoggerFramework();
        changleLoggerLevelProcessUnit.getLoggerList();
    }

    /**
     * Configure the application. Normally all you would need to do is to add sources
     * (e.g. config classes) because other settings have sensible defaults. You might
     * choose (for instance) to add default command line arguments, or set an active
     * Spring profile.
     *
     * @param builder a builder for the application context
     * @return the application builder
     * @see SpringApplicationBuilder
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        logger.info("=========== Application.configure =============");
        return builder.sources(Application.class);
    }
}
