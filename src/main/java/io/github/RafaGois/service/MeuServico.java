package io.github.RafaGois.service;

import io.github.RafaGois.model.Cliente;
import io.github.RafaGois.repository.MeuRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeuServico {//onde ficam as regras de negocio de um servico, validacoes, relatórios, acessodo bd

    private MeuRepositorio meuRepositorio;

//    @Autowired
//    public void setMeuRepositorio(MeuRepositorio meuRepositorio) {
//        this.meuRepositorio = meuRepositorio;
//    }

    @Autowired//busca a instancia
    public MeuServico (MeuRepositorio meuRepositorio) {
        this.meuRepositorio = meuRepositorio;
    }

    public void salvarCliente (Cliente cliente) {
        validarCliente(cliente);
        this.meuRepositorio.persistor(cliente);
    }

    public void validarCliente (Cliente cliente) {

    }
}
