package org.sample.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class SpringConfig extends WebMvcConfigurerAdapter {

    /*
     * @Bean public ch.rasc.extdirectspring.controller.Configuration edsConfig() {
     * ch.rasc.extdirectspring.controller.Configuration config = new ch.rasc.extdirectspring.controller.Configuration();
     * config.setStreamResponse(true); config.setTimeout(12000); config.setMaxRetries(10);
     * config.setEnableBuffer(false); return config; }
     */

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index.html");
    }

    @Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }

    @Bean
    @Lazy
    public ClassPathResource userdata() {
        return new ClassPathResource("/users.csv");
    }
}
