package co.com.bancolombia.usecase.persona;

import co.com.bancolombia.model.persona.Persona;
import co.com.bancolombia.model.persona.gateways.PersonaRepository;
import co.com.bancolombia.model.persona.technicalogs.LoggerRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class PersonaUseCase {

    private final PersonaRepository repository;
    private final LoggerRepository logger;

    public List<Persona> getPersonas(){
        List<Persona> list = new ArrayList<>();
        try {
            list = repository.findAll();
        } catch (Exception ex) {
            logger.error("Obteniendo Peliculas", ex);
        } finally {
            return list;
        }

    }

}
