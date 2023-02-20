package org.example.service.mapper;

public interface MappingService <T, V> {

    T convertToEntity(V dto);

    V convertToDTO(T entity);
}
