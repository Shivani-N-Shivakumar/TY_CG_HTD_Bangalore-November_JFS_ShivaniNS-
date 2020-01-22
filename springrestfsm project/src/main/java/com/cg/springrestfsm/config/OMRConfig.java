package com.cg.springrestfsm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class OMRConfig {
      @Bean
      public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
    	  LocalEntityManagerFactoryBean bean = new  LocalEntityManagerFactoryBean();
    	  bean.setPersistenceUnitName("persistence-unit");
    	  return bean;
      }
}
