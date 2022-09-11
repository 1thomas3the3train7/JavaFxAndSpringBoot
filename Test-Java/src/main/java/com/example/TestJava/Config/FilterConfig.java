package com.example.TestJava.Config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig{
    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean(){
        FilterRegistrationBean<Filter> filterRegistrationBean =
                new FilterRegistrationBean<Filter>(new Filter());
        filterRegistrationBean.addUrlPatterns("*");
        return filterRegistrationBean;
    }
}
