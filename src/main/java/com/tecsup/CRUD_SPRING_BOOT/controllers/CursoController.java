package com.tecsup.CRUD_SPRING_BOOT.controllers;

import com.tecsup.CRUD_SPRING_BOOT.model.daos.CursoRepository;
import com.tecsup.CRUD_SPRING_BOOT.model.entities.Curso;
import com.tecsup.CRUD_SPRING_BOOT.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@SessionAttributes("curso")
public class CursoController {

    @Autowired
    private CursoService servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String ListarCurso(Model model){
        model.addAttribute("titulo", "Listar Curso");
        model.addAttribute("cursos", servicio.findAllCourse());
        return "listarView";
    }

    @GetMapping("/nuevo")
    public String nuevoFormularioDeNuevoCurso(Model model) {
        model.addAttribute("curso", new Curso());
        return "formCursoView";
    }

    @PostMapping("/guardar")
    public String guardarCurso(@ModelAttribute("curso") Curso curso) {
        servicio.saveCourse(curso);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarCurso(@PathVariable("id") String id, Model model) {
        Curso curso = servicio.findCourseById(id);
        model.addAttribute("curso", curso);
        return "formCursoView";
    }

    @GetMapping("eliminar/{id}")
    public String eliminarCurso(@PathVariable("id") String id) {
        servicio.deleteCourseById(id);
        return "redirect:/listar";
    }
}
