package com.produtos.api.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.produtos.api.modelos.ProdutoModelo;
import com.produtos.api.modelos.RespostaModelo;
import com.produtos.api.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
    @Autowired
    private ProdutoRepositorio pr;

    ProdutoModelo pm = new ProdutoModelo();

    @Autowired
    private RespostaModelo rm;

    public Iterable<ProdutoModelo> listar() {
        return pr.findAll();
    }

    public ResponseEntity<?> cadastrar(ProdutoModelo pm) {
        if ("".equals(pm.getNome())) {
            rm.setMensagem("O nome do produto é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if ("".equals(pm.getMarca())) {
            rm.setMensagem("A marca do produto é obrigatória!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else {

            if (acao.equals("cadastrar")) {

            }
            return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED);
        }
    }
}
