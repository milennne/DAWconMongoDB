package com.tecsup.CRUD_SPRING_BOOT.services;

import com.tecsup.CRUD_SPRING_BOOT.model.entities.Curso;

import java.util.List;

public interface CursoService {

    public List<Curso> findAllCourse();
    public void saveCourse(Curso curso);
    public Curso findCourseById(String id);
    public void deleteCourseById(String id);
}
