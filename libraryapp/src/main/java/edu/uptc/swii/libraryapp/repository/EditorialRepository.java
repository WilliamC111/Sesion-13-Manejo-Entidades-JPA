package edu.uptc.swii.libraryapp.repository;
import edu.uptc.swii.libraryapp.domain.Editorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialRepository extends JpaRepository<Editorial, Integer> {
    // No se necesita agregar métodos adicionales por ahora
    
}
