package eu.kijora.todoapp.controller.filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Set;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    @Autowired //all interceptors with interface HandlerInterceptor will be injected here
    private final Set<HandlerInterceptor> interceptors;

    public MvcConfiguration(Set<HandlerInterceptor> interceptors) {
        this.interceptors = interceptors;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        interceptors.forEach(registry::addInterceptor);

//        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
