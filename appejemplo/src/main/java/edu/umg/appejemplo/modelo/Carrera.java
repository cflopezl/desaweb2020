package edu.umg.appejemplo.modelo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="carreras")
public class Carrera {
    @Id
    private int codigo;
    private String nombre;
    @Column(name="fecha_creacion")
    private Date fechaCreacion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrera", fetch = FetchType.EAGER)
    private List<Alumno> alumnosList;

    @Override
    public String toString() {
        return "Carrera{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
