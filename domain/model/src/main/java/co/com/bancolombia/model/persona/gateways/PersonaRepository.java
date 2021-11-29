package co.com.bancolombia.model.persona.gateways;

import co.com.bancolombia.model.persona.Persona;

import java.util.List;

public interface PersonaRepository {

    Persona save(Persona movie);
    void saveAll(List<Persona> movies);
    Persona findById(Integer id);
    List<Persona> findAll();

}
