package com.yang;

import com.yang.interceptor.RequestLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author dalaoyang
 */
@SpringBootApplication
//@EnableScheduling
//@EnableCaching
public class DalaoyangApplication extends WebMvcConfigurerAdapter {

    @Autowired
    RequestLog requestLog;

    /***
     * @Description
     * @author dalaoyang
     * @date 2018/11/15
     * @param registry :
     * @return : void
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestLog);
    }

    /***
     * @Description
     * @author dalaoyang
     * @return : void
     */
    public static void main(String[] args) {
        SpringApplication.run(DalaoyangApplication.class, args);
    }
}
