package io.github.RafaGois;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    //adiciona este metodo no centexto da aplicacao
    @Bean(name = "applicationName")
    public String applicationName () {
        return "Sistema de vendas";
    }

}
