package edu.umg.appejemplo.negocio.repository;

import edu.umg.appejemplo.modelo.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno,String> {
}
