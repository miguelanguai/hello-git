package formacion.ejerciciosHerencia.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RepositorioDePersonas {
    private List<Persona> repo = new ArrayList<Persona>();

    public List<Persona> getRepo() {
        return repo;
    }

    public void setRepo(List<Persona> repo) {
        this.repo = repo;
    }

    public void agregarPersona(Persona persona) {
        repo.add(persona);
    }

    public void retirarPersona(Long id) {
        this.repo = repo.stream().filter(persona -> !Objects.equals(persona.getId(), id)).collect(Collectors.toList());
    }

    public void listarPersonas() {
        for (Persona persona : repo) {
            System.out.println(persona.getName());
        }
    }
}
