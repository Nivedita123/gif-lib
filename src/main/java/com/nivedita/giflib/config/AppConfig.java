package com.nivedita.giflib.config;

import org.hashids.Hashids;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    @Autowired
    private Environment env;

    public Hashids hashids() {
        return  new Hashids(env.getProperty("giflib.hash.salt"),8);
    }
}
