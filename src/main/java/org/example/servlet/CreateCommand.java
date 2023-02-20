package org.example.servlet;

import org.example.service.AnimalService;
import org.example.service.AnimalServiceImpl;
import org.example.service.dto.AnimalDTO;
import org.example.servlet.ServletCommand;
import org.example.servlet.commands.extractor.AnimalDTOExtractor;
import org.example.servlet.commands.extractor.DTOExtractor;


import javax.servlet.http.HttpServletRequest;

import static org.example.utils.Util.*;

public class CreateCommand implements ServletCommand {


    private final AnimalService animalService = new AnimalServiceImpl();
    private final DTOExtractor<AnimalDTO> dtoExtractor = new AnimalDTOExtractor();




    @Override
    public String execute(HttpServletRequest request) {
        if (GET.equals(request.getMethod())) {
            return NEW_JSP;
        }
        animalService.create(dtoExtractor.extract(request));
        return INDEX_JSP;
    }
}
