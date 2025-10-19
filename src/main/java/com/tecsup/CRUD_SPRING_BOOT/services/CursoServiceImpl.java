package com.tecsup.CRUD_SPRING_BOOT.services;

import com.tecsup.CRUD_SPRING_BOOT.model.daos.CursoRepository;
import com.tecsup.CRUD_SPRING_BOOT.model.entities.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository dao;

    @Override
    public List<Curso> findAllCourse() {
        return dao.findAll();
    }

    @Override
    public void saveCourse(Curso curso) {
        dao.save(curso);
    }

    @Override
    public Curso findCourseById(String id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void deleteCourseById(String id) {
        dao.deleteById(id);
    }
}
