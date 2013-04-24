package com.thoughtworks.servlet;

import com.thoughtworks.FreemarkerResolver;
import com.thoughtworks.ViewResolver;
import com.thoughtworks.module.AbstractModule;
import com.thoughtworks.module.BicycleModule;
import com.thoughtworks.module.IModule;

public class BicycleServletModule extends AbstractModule {
    @Override
    public void config() {
        createMapping(IModule.class,BicycleModule.class);
        createMapping(ViewResolver.class,FreemarkerResolver.class);
    }
}