package com.PracticaExamen.service;

import com.PracticaExamen.dao.ContactoDao;
import com.PracticaExamen.domain.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoDao contactoDao;
    
    @Override
    @Transactional
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }
    
}
