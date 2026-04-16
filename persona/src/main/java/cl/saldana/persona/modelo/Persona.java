package cl.saldana.persona.modelo;

import jakarta.persistence.Entity;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Valid
public class Persona {

    private String rut;
    private String nombre;
    private int edad;
    private char genero;
}
