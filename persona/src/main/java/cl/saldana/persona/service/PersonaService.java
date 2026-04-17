package cl.saldana.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.saldana.persona.modelo.Persona;
import cl.saldana.persona.repository.PersonaRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }   

    public Persona getPersonaByRut(String rut) {
        List<Persona> personas= personaRepository.findByRut(rut);
        if(!personas.isEmpty()){
            return personas.get(0);
        }
        return null;
    }   

    public List<Persona> getPersonasByNombre(String nombre) {
        return personaRepository.findByNombre(nombre);
    }   

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }   

    public void deletePersona(String rut) {
        personaRepository.deleteById(rut);
    }

    public Persona updatePersona(String rut, Persona persona) {
        if (personaRepository.existsById(rut)) {
            persona.setNombre(persona.getNombre());
            persona.setEdad(persona.getEdad()); 
            persona.setGenero(persona.getGenero());
            return personaRepository.save(persona);
        }
        return null;
    }
    
}
