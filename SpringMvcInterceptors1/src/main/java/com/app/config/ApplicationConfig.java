package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.spring.interceptors.AuditInterceptor;
import com.spring.interceptors.LoginInterceptor;
import com.spring.interceptors.TransactionInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan("com.spring")
public class ApplicationConfig extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF//views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor());
		registry.addInterceptor(new AuditInterceptor());
		registry.addInterceptor(new TransactionInterceptor()).addPathPatterns(
				"/person/save/*");
	}
}