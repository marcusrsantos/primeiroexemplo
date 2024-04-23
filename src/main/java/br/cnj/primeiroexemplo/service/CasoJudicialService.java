package br.cnj.primeiroexemplo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cnj.primeiroexemplo.repository.CasoJudicialRepository;
import br.cnj.primeiroexemplo.model.CasoJudicial;
import br.cnj.primeiroexemplo.util.CustoJudicial;
import br.cnj.primeiroexemplo.util.TaxaJudicial;

@Service
public class CasoJudicialService {
    
    private List<CasoJudicial> casos;
    //@Autowired
    //private final CasoJudicialRepository repository;


    public CasoJudicialService(CasoJudicialRepository repository){
        //this.repository = repository;

        this.criarCaso(new CasoJudicial("1234567890","Condenado por racismo","Caso de preconceito racial"));
        this.criarCaso(new CasoJudicial("9876543210","Condenado por abuso de poder econômico","Caso de cobrança indevida de banco privado contra consumidor"));
        this.criarCaso(new CasoJudicial("1111111111","Condenado por sonegação fiscal","Caso de empresa devedora ao erário"));
        this.criarCaso(new CasoJudicial("1029384756","Condenado por homofobia","Caso de preconceito contra grupo lgbtqia+"));
    }

    public List<CasoJudicial> pegarTodosOsCasos(){
        return casos;
    }

    public boolean existe(CasoJudicial novoCaso){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CasoJudicial criarCaso(CasoJudicial novoCaso){
        int nextId = casos.size()+1;
        novoCaso.setId(nextId);
        casos.add(nextId, novoCaso);
        return novoCaso;
    }

    public CasoJudicial atualizarCaso(Long id, CasoJudicial casoAtualizado){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CasoJudicial deletarCaso(Long id){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public CasoJudicial atualizarCaso(Long id, Map<String,Object> atualacoes){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
