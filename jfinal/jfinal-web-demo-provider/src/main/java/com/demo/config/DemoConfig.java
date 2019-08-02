package com.demo.config;

import com.jfinal.config.*;
import com.demo.controller.HelloController;


public class DemoConfig extends JFinalConfig  {

    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", HelloController.class);
    }


    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

}
