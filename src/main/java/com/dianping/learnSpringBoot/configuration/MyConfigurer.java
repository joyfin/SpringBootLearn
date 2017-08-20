package com.dianping.learnSpringBoot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyConfigurer extends WebMvcConfigurerAdapter{


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/*").addResourceLocations("classpath:/myResources/");
        super.addResourceHandlers(registry);
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
////        registry.addResourceHandler("/myResources/**").addResourceLocations(
////                "classpath:/myResources/"
////        );
//        //覆盖默认的配置
//        // /**表示任意长度的路径，/*表示0个或1个长度的路径
//        registry.addResourceHandler("/*").addResourceLocations("classpath:/myResources/");
//
//
//        //默认是/**，所以这么写会覆盖默认的配置
////        registry.addResourceHandler("/**").addResourceLocations("classpath:/myResources/");
//        super.addResourceHandlers(registry);
//    }
}
