package org.example.servlet;

import org.example.service.AnimalService;
import org.example.service.AnimalServiceImpl;
import org.example.service.dto.AnimalDTO;
import org.example.servlet.ServletCommand;
import org.example.servlet.commands.extractor.AnimalDTOExtractor;
import org.example.servlet.commands.extractor.DTOExtractor;

import javax.servlet.http.HttpServletRequest;

import static org.example.utils.Util.*;

public class UpdateCommand implements ServletCommand {


    private final AnimalService animalService = new AnimalServiceImpl();

    private final DTOExtractor<AnimalDTO> dtoExtractor = new AnimalDTOExtractor();
    @Override
    public String execute(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter(ANIMAL_ID));
        if (GET.equals(request.getMethod())) {
          /*  AnimalDTO animalDTO = animalService.update("");
            request.setAttribute(PERSON, personDTO);*/
            return EDIT_JSP;
        }
        AnimalDTO animalDTO = dtoExtractor.extract(request);
       // animalService.update(animalDTO, a);
        return INDEX_JSP;
    }
}
