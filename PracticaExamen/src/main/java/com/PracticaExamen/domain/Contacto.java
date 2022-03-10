package com.PracticaExamen.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="contactenos")
public class Contacto implements Serializable {
    private static final long serialVersionUID = 2L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcontacto;
    
    String nombre;
    String correo;
    String cedula;
    String telefono;
    
    public Contacto(){}

    public Contacto(String nombre, String correo, String cedula, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
    }
}
