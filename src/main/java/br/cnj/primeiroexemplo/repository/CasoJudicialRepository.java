package br.cnj.primeiroexemplo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.cnj.primeiroexemplo.util.CasoJudicial;

public class CasoJudicialRepository {

    @Autowired
    private List<CasoJudicial> casos;

    public List<CasoJudicial> findAll(){
        return casos;
    }

}
