package com.mitocode;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

import com.mitocode.mapper.EmpleadoMapper;
import com.mitocode.model.Empleado;

@SpringBootTest
@ContextConfiguration
class TestEmpleadoMapper {
	
	@Autowired
	private EmpleadoMapper empMap;
		
	@Test
	public void insert(){
		
		Empleado emp2= new Empleado();
		emp2.setUsuario("admin");
		emp2.setSueldo(800);
		emp2.setNumeroHijos(5);
		emp2.setFechaNacimiento(LocalDate.now());
		emp2.setNombres("Renzo");
		emp2.setDocumento("98987745");
		emp2.setClave("admin");
		emp2.setApellidos("Montalvo");

		
		int status = empMap.registra(emp2);
		
		Assert.state(status == 1, "Insert fallo");
				
	}
}
