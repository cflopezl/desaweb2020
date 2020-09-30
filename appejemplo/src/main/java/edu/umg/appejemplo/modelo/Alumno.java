package edu.umg.appejemplo.modelo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="alumnos")
public class Alumno {
    @Id
    private String carne;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="carrera", nullable = false)
    private Carrera carrera;

    @Override
    public String toString() {
        return "Alumno{" +
                "carne='" + carne + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
