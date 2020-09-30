package edu.umg.appejemplo;

import edu.umg.appejemplo.modelo.Carrera;
import edu.umg.appejemplo.negocio.repository.CarreraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AppejemploApplicationTests {

	@Autowired
	CarreraRepository carreraRepository;

	@Test
	void ver_carreras() {
		List<Carrera> carreras = carreraRepository.findAll();
		for ( Carrera c : carreras ) {
			System.out.println("c = " + c + ", No. Alumnos: " + c.getAlumnosList().size()  );
		}
		assertEquals(3, carreras.size());
	}

	@Test
	void add_carrera(){
		Carrera carrera = new Carrera();
		carrera.setCodigo(7777);
		carrera.setNombre("Nueva carrera");
		carreraRepository.save(carrera);
		List<Carrera> carreras = carreraRepository.findAll();
		assertEquals(4, carreras.size());
	}

	@Test
	void del_carrera(){
		carreraRepository.deleteById(7777);
		List<Carrera> carreras = carreraRepository.findAll();
		assertEquals(3, carreras.size());
	}
}
