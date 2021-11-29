package co.com.bancolombia.config;

import co.com.bancolombia.model.persona.gateways.PersonaRepository;
import co.com.bancolombia.model.persona.technicalogs.LoggerRepository;
import co.com.bancolombia.usecase.persona.PersonaUseCase;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public LoggerRepository createLogger(){
        return new LoggerRepository() {
            @Override
            public void debug(String message) {

            }

            @Override
            public void error(String message, Exception ex) {

            }

            @Override
            public void error(String message) {

            }

            @Override
            public void info(String message) {

            }

            @Override
            public void warn(String message, Exception ex) {

            }

            @Override
            public void warn(String message) {

            }

            @Override
            public void fatal(String message) {

            }

            @Override
            public void fatal(String message, Exception ex) {

            }
        };
    }

    @Bean
    public PersonaUseCase createMoviesUseCase(PersonaRepository repository, LoggerRepository logger) {
        return new PersonaUseCase(repository, logger);
    }

    @Bean
    public ObjectMapperImp createObjectMapper() {
        return new ObjectMapperImp();
    }

}
