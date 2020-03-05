package com.mitocode.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.mitocode.model.Empleado;

@Mapper
public interface EmpleadoMapper {
	
	@Insert("INSERT INTO empleado(usuario,sueldo,numerohijos,nombres,fechanacimiento,documento,clave,apellidos) "
			+ "			VALUES (#{usuario},"
			+ "					#{sueldo},"
			+ "					#{numeroHijos},"
			+ "					#{nombres},"
			+ "					#{fechaNacimiento},"
			+ "					#{documento},"
			+ "					#{clave},"
			+ "					#{apellidos})")
	Integer registra(Empleado empledo);
	
	
	

}
