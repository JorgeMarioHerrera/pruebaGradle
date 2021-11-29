package co.com.bancolombia.jpa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Entity
@Table(name = "persona")
@NoArgsConstructor
public class PersonaData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "nombre", length = 500, nullable = false)
    private String nombre;
}
