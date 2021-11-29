package co.com.bancolombia.persona;

import co.com.bancolombia.model.persona.Persona;
import co.com.bancolombia.usecase.persona.PersonaUseCase;
import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PersonaService {

    private final PersonaUseCase useCase;

    @GetMapping("/getPersonas")
    public ResponseEntity getMovies() {
        List<Persona> responseList = useCase.getPersonas();
        return new ResponseEntity<List<Persona>>(responseList,HttpStatus.OK);
    }
}
