package cl.saldana.persona.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.saldana.persona.modelo.Persona;
@Repository 
public interface PersonaRepository extends JpaRepository<Persona, String> {

    @Query  ("SELECT p FROM Persona p WHERE p.nombre = :nombre")
    List<Persona> findByNombre(String nombre);

    @Query("SELECT p FROM Persona ")
    List<Persona> findAll();

    @Query("SELECT p FROM Persona p WHERE p.rut = :rut")
    List<Persona> findByRut(String rut);
}
