package org.example.servlet;

import org.example.service.AnimalService;
import org.example.service.AnimalServiceImpl;
import org.example.servlet.ServletCommand;

import javax.servlet.http.HttpServletRequest;

import static org.example.utils.Util.INDEX_JSP;

public class SelectCommand implements ServletCommand {

    public static final String ANIMAL = "animal";
    private final AnimalService animalService = new AnimalServiceImpl();
    @Override
    public String execute(HttpServletRequest request) {

      //  List<AnimalDTO> animalDTOS = animalService.select();
      //  request.setAttribute(ANIMAL, animalDTOS);
        return INDEX_JSP;
    }
}
