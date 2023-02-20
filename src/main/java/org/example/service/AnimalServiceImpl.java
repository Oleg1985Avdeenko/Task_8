package org.example.service;

import org.example.bean.Animal;
import org.example.dao.DAOImpl;
import org.example.dao.Dao;
import org.example.service.dto.AnimalDTO;
import org.example.service.mapper.AnimalMappingService;
import org.example.service.mapper.MappingService;

public class AnimalServiceImpl implements AnimalService<AnimalDTO> {

    Dao serviceDao = new DAOImpl();
    private final MappingService<Animal, AnimalDTO> animalMappingService =
            new AnimalMappingService();
    @Override
    public void create(AnimalDTO animalDTO) {
        Animal animal = animalMappingService.convertToEntity(animalDTO);
       serviceDao.insert(animal);
    }

    @Override
    public Object select(AnimalDTO animalDTO) {
        Animal animal = (Animal) serviceDao.select(animalMappingService.convertToEntity(animalDTO));
        return animalMappingService.convertToDTO(animal);
    }

    @Override
    public void update(AnimalDTO animalDTO, AnimalDTO animalDTO1) {
        serviceDao.update(animalMappingService.convertToEntity(animalDTO)
                ,animalMappingService.convertToEntity(animalDTO1));
    }

    @Override
    public void delete(AnimalDTO animalDTO) {
        serviceDao.delete(animalMappingService.convertToEntity(animalDTO));
    }
}
