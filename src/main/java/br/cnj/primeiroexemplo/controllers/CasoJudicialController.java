package br.cnj.primeiroexemplo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.cnj.primeiroexemplo.exception.CasoDuplicadoException;
import br.cnj.primeiroexemplo.service.CasoJudicialService;
import br.cnj.primeiroexemplo.model.CasoJudicial;

@RestController
@RequestMapping("/api/casos")
public class CasoJudicialController {

    @Autowired
    private final CasoJudicialService service;

    public CasoJudicialController(CasoJudicialService service){
        this.service = service;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/",
            produces = MediaType.APPLICATION_JSON_VALUE)
       public ResponseEntity<List<CasoJudicial>> pegarTodosOsCasos(){
        List<CasoJudicial> casos = service.pegarTodosOsCasos();
        return ResponseEntity.status(HttpStatus.OK).body(casos);
    }

    @PostMapping
    public ResponseEntity<CasoJudicial> criarCaso(@RequestBody CasoJudicial novoCaso) throws CasoDuplicadoException {
        if(service.existe(novoCaso)){
            throw new CasoDuplicadoException("Caso duplicado");
        }
        else{
            CasoJudicial caso = service.criarCaso(novoCaso);

            return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(caso);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CasoJudicial> atualizaCaso(@PathVariable Long id, 
            @RequestBody CasoJudicial casoAtualizado){
        CasoJudicial caso = service.atualizarCaso(id,casoAtualizado);

        return ResponseEntity.ok(caso);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<CasoJudicial> ajustarCaso(@PathVariable Long id, 
            @RequestBody Map<String, Object> atualacoes){
        CasoJudicial caso = service.atualizarCaso(id,atualacoes);

        return ResponseEntity.ok(caso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CasoJudicial> deletarCaso(@PathVariable Long id){
        CasoJudicial caso = service.deletarCaso(id);

        return ResponseEntity.noContent().build();
    }

}
