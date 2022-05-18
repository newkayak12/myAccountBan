package com.server.base.common.configurations;

import com.server.base.common.authorizations.AuthInterceptor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Configurations /*implements WebMvcConfigurer*/ {
//    @Autowired
//    private AuthInterceptor authInterceptor;
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){return new BCryptPasswordEncoder();}
    @Bean
    public ModelMapper modelMapper(){return new ModelMapper();}
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authInterceptor).excludePathPatterns("/api/user/**");
//    }
}
