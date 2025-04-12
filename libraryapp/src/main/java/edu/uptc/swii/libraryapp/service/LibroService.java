package edu.uptc.swii.libraryapp.service;

import edu.uptc.swii.libraryapp.domain.Libro;
import edu.uptc.swii.libraryapp.repository.LibroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> buscarDestacados() {
        return libroRepository.buscarTodos();
    }

    public List<Libro> buscar(String consulta) {
        return libroRepository.buscar(consulta);
    }

    public void guardar(Libro libro) {
        libroRepository.save(libro);
    }

    public List<Libro> buscarPorEditorial(int editorialId) {
        return libroRepository.buscarPorEditorial(editorialId);  // Usa el método del repositorio
    }
}