package edu.uptc.swii.libraryapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.uptc.swii.libraryapp.domain.Editorial;
import edu.uptc.swii.libraryapp.domain.Libro;
import edu.uptc.swii.libraryapp.service.EditorialService;
import edu.uptc.swii.libraryapp.service.LibroService;

@Controller
@RequestMapping("/libros") // Añade esta anotación a nivel de clase
public class LibroCrudController {
   
    private final LibroService libroService;
    private final EditorialService editorialService;

    public LibroCrudController(LibroService libroService, EditorialService editorialService) {
        this.libroService = libroService;
        this.editorialService = editorialService;
    }

    @GetMapping("/crear") // Cambia a GetMapping y usa la ruta plural
    public String mostrarFormAlta(Model model) {
        model.addAttribute("libro", new Libro());
        model.addAttribute("editoriales", editorialService.buscarTodos());
        return "formLibro";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Libro libro, @RequestParam("editorial.id") Integer editorialId) {
        Editorial editorial = editorialService.buscarPorId(editorialId);
        libro.setEditorial(editorial);
        libroService.guardar(libro);
        return "redirect:/";
    }
}
