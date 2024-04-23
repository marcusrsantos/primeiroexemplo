package br.cnj.primeiroexemplo.util;

import org.springframework.stereotype.Component;

@Component
public class TaxaJudicial {

    public double adicionarTaxa(String estado){
        if("SE".equals(estado)){
            return -5;
        }

        return 50;
    }

}
