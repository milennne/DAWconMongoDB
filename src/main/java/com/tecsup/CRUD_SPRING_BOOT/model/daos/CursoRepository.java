package com.tecsup.CRUD_SPRING_BOOT.model.daos;

import com.tecsup.CRUD_SPRING_BOOT.model.entities.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CursoRepository extends MongoRepository<Curso, String> {

}
