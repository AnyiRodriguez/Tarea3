package com.PracticaExamen.service;

import com.PracticaExamen.domain.Cancion;
import java.util.List;

public interface CancionService {
    public List<Cancion> getCanciones();
    public void save(Cancion cancion);
    public void delete(Cancion cancion);
    public Cancion getCancion(Cancion cancion);
}
