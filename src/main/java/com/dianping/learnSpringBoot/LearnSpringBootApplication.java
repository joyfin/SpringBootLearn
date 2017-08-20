package com.dianping.learnSpringBoot;

import com.dianping.learnSpringBoot.servlet.FirstServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@ServletComponentScan//扫描自定义的Servlet、Filter、Listener
@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

//	/**
//	 * 修改DispatcherServlet的默认配置
//	 * @param dispatcherServlet
//	 * @return
//	 */
//	@Bean
//	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//		//将dispatcher转化为bean
//		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet);
//
//		//清除目前的urlmappings
//		servletRegistrationBean.getUrlMappings().clear();
//
//		//增加json后缀的urlmapping
//		servletRegistrationBean.addUrlMappings("*.json");
//
//		return servletRegistrationBean;
//	}
//
//	/**
//	 * 代码注册Servlet（不需要@ServletComponentScan）
//	 */
//	@Bean
//	public ServletRegistrationBean servletRegistrationBean(){
//		return new ServletRegistrationBean(new FirstServlet());
//	}
}
