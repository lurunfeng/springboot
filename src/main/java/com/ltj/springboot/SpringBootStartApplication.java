//package com.ltj.springboot;
//
//import java.util.Collections;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.SessionCookieConfig;
//import javax.servlet.SessionTrackingMode;
//
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//
//public class SpringBootStartApplication extends SpringBootServletInitializer {
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		// 注意这里指向原先用main方法执行的Application启动类
//		// new AppConfig();
//		return builder.sources(WebApplication.class);
//	}
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		super.onStartup(servletContext);
//		// this will set to use cookie only
//		servletContext.setSessionTrackingModes(Collections.singleton(SessionTrackingMode.COOKIE));
//
//		// this till prevent any Js on the page from accessing the cookie - it will only
//		// be used/accessed by http transport mechanism in use
//		SessionCookieConfig sessionCookieConfig = servletContext.getSessionCookieConfig();
//		sessionCookieConfig.setHttpOnly(true);
//	}
//}
