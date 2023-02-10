package com.example.API_InterceptorMiddleware01.configurations;

import com.example.API_InterceptorMiddleware01.interceptor.APILoggingInterceptor;
import com.example.API_InterceptorMiddleware01.interceptor.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {

    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
         interceptorRegistry.addInterceptor(apiLoggingInterceptor);
         interceptorRegistry.addInterceptor(legacyInterceptor);
     }
}