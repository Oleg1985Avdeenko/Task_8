package org.example.servlet;

import org.example.service.AnimalService;
import org.example.service.AnimalServiceImpl;
import org.example.servlet.ServletCommand;

import javax.servlet.http.HttpServletRequest;

import static org.example.utils.Util.ANIMAL_ID;
import static org.example.utils.Util.INDEX_JSP;

public class DeleteCommand implements ServletCommand {


    private final AnimalService animalService = new AnimalServiceImpl();
    @Override
    public String execute(HttpServletRequest request) {
        animalService.delete(Integer.parseInt(request.getParameter(ANIMAL_ID)));
        return INDEX_JSP;
    }
}
