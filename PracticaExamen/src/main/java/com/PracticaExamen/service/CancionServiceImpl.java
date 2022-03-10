package com.PracticaExamen.service;

import com.PracticaExamen.domain.Cancion;
import com.PracticaExamen.dao.CancionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CancionServiceImpl implements CancionService {
    
    @Autowired
    private CancionDao cancionDao;

    @Override
    @Transactional (readOnly = true)
    public List<Cancion> getCanciones() {
        return (List<Cancion>) cancionDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cancion cancion) {
        cancionDao.save(cancion);
    }

    @Override
    @Transactional
    public void delete(Cancion cancion) {
        cancionDao.delete(cancion);
    }

    @Override
    @Transactional (readOnly = true)
    public Cancion getCancion(Cancion cancion) {
        return cancionDao.findById(cancion.getIdcancion()).orElse(null);
    }
}