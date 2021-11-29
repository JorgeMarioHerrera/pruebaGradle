package co.com.bancolombia.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<PersonaData, Integer>, QueryByExampleExecutor<PersonaData> {
}
