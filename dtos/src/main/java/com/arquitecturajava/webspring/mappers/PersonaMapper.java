package com.arquitecturajava.webspring.mappers;

import com.arquitecturajava.webspring.dtos.PersonaDto;
import com.arquitecturajava.webspring.models.Persona;

public class PersonaMapper {

	public static PersonaDto toDto(Persona persona) {
		return new PersonaDto(persona.getNombre());
	}	
	
	//To business object
	public static Persona toModel(PersonaDto personaDto) {
		return new Persona(personaDto.getNombre());
	}
}
