package io.github.RafaGois;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")//deixa acessivel apenas dquado o usuario for desenvolvimento
public class MyConfiguration {

    @Bean
    public CommandLineRunner executar () {
        return args -> {
            System.out.println("RODANDO A CONGIF DE DESENVOLVIMENTO");
        };
    }

}
