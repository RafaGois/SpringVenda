package io.github.RafaGois;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {""})
@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/mensagem")
    public String mensagem () {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}
