package com.test.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * App
 */
@EnableWebMvc
@Configuration
public class App {

    @Bean
    InternalResourceViewResolver gViewResolver() {
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setPrefix("/WEB-INF/");
        view.setSuffix(".jsp");
        return view;
    }

}