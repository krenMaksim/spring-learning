package com.kren.simplespingmvc.config1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kren.simplespingmvc.rest.Config1RestController;

@Configuration
@ComponentScan(basePackageClasses = { Config1RestController.class })
public class AppConfig {

}