package com.example.demo.dominio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ConfiguracionAplicacion {
    
    @Bean
    @Qualifier("antonio")
    @Primary
    public Saludo saludo1() {
        return new Saludo("antonio");
    }

    @Bean
    @Qualifier("juan")
    public Saludo saludo2() {
        return new Saludo("juan");
    }
}
