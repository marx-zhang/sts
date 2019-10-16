package com.limebike.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author bvvy
 * @date 2019/9/23
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {



    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    }


}
