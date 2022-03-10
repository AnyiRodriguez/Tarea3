package com.PracticaExamen.dao;

import com.PracticaExamen.domain.Cancion;
import org.springframework.data.repository.CrudRepository;

public interface CancionDao extends CrudRepository<Cancion, Long>{
    
}