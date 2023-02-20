package org.example.servlet.commands.extractor;

import org.example.service.dto.AnimalDTO;
import static org.example.utils.Util.WEIGHT;
import static org.example.utils.Util.NAME;
import static org.example.utils.Util.TYPE;

import javax.servlet.http.HttpServletRequest;

public class AnimalDTOExtractor implements DTOExtractor<AnimalDTO> {
    @Override
    public AnimalDTO extract(HttpServletRequest request) {
        return AnimalDTO.builder().weight(Integer.parseInt(request.getParameter(WEIGHT)))
                .type(request.getParameter(TYPE))
                .name(request.getParameter(NAME)).build();
    }
}
