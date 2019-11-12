package com.petcare.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.petcare.web.interceptor.SampleInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "package com.petcare.web.controller")
public class ServletConfig implements WebMvcConfigurer {

	/*
	 * @Bean public ViewResolver viewResolver(){ return new TilesViewResolver(); }
	 */
	/*
	 * @Bean public UrlBasedViewResolver tilesViewResolver() { UrlBasedViewResolver
	 * viewResolver = new UrlBasedViewResolver();
	 * viewResolver.setViewClass(TilesView.class); viewResolver.setOrder(1); return
	 * viewResolver; }
	 */
    
    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions("/WEB-INF/tiles/tiles.xml");
        configurer.setCheckRefresh(true);
        
        return configurer;
    }
    
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	TilesViewResolver viewResolver = new TilesViewResolver();
    	registry.viewResolver(viewResolver);
    }
    
	@Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 System.out.println("addResourceHandlers 호출");
		 registry.addResourceHandler("/resources/**").addResourceLocations("/resources/"); 
	}

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SampleInterceptor());
    }
    
   
}