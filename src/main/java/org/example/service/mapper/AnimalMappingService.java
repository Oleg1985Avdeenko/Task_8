package org.example.service.mapper;

import org.example.bean.Animal;
import org.example.service.dto.AnimalDTO;

public final class AnimalMappingService implements MappingService<Animal, AnimalDTO> {

    @Override
    public Animal convertToEntity(AnimalDTO dto) {
        return Animal.builder().weight(dto.getWeight()).name(dto.getName())
                .type(dto.getType()).build();
    }

    @Override
    public AnimalDTO convertToDTO(Animal entity) {
        return AnimalDTO.builder().weight(entity.getWeight()).name(entity.getName())
                .type(entity.getType()).build();
    }
}
