package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.app.web")
public class MvcConfig {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver vrr = new InternalResourceViewResolver();
		vrr.setPrefix("/views/");
		vrr.setSuffix(".jsp");
		return vrr;
	}

}
