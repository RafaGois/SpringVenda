package io.github.RafaGois.repository;

import io.github.RafaGois.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository//espécie de instancia, injeta onde precisa
public class MeuRepositorio {
    public void persistor(Cliente cliente) {//acessa base e salva cliente
    }
}
