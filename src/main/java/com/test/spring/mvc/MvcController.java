package com.test.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

@Controller
public class MvcController extends AbstractAnnotationConfigDispatcherServletInitializer {

    // @Override
    // protected WebApplicationContext createServletApplicationContext() {
    //     XmlWebApplicationContext xml = new XmlWebApplicationContext();
    //     xml.setConfigLocation("/WEB-INF/spring-config.xml");
    //     return xml;
    // }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    // @Override
    // protected WebApplicationContext createRootApplicationContext() {
    //     return null;
    // }

    @RequestMapping("/")
    String hello() {
        return "hello";
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { App.class };
    }

}