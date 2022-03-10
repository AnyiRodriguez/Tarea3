package com.PracticaExamen.dao;

import com.PracticaExamen.domain.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactoDao extends CrudRepository<Contacto, Long>{
    
}
