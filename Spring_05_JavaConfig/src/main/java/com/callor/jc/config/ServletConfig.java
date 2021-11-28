package com.callor.jc.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * servlet-context.xml 파일을 대신할 java Config 클래스
 *
 * @Configuration : 이 파일은 context.xml을 대신할 파일이다
 * @EnableWebMvc : 이제 Spring MVC 프로젝트의 servlet 이 시작된
 *      servlet-context.xml, dispatcher-servlet.xml 등을 대신한 파일일
*/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.callor.jc.controller",
                                "com.callor.jc.service"})
public class ServletConfig implements WebMvcConfigurer {
}
