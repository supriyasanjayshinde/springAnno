package com.kgisl.springAnno;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherClass extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("11111111111111111111111111111111");
        return new Class[]{PersistenceJPAConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        System.out.println("2222222222222222222222222222222222222");
        return new Class[0];
    }

    protected String[] getServletMappings() {
        System.out.println("3333333333333333333333333333333333333");
        return new String[]{"/"};
    }
}