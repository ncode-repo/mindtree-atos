package uk.co.aegon.aipdoc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"uk.co.aegon.aipdoc.controller"})
public class WebConfig extends WebMvcConfigurerAdapter{

}
