import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.cnj.primeiroexemplo.exception.CasoDuplicadoException;

@ControllerAdvice
public class TratadorExcecoes {
    @ExceptionHandler(CasoDuplicadoException.class)
    public ResponseEntity<String> tratarCasoDuplicado(CasoDuplicadoException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

}
