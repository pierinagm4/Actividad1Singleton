package com.singleton.config;

import com.singleton.entities.Persona;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean("Persona")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Persona getPersona() {
        return new Persona();
    }
}
