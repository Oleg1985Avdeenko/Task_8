package org.example.servlet.commands.extractor;

import javax.servlet.http.HttpServletRequest;

public interface DTOExtractor <T>{

    T extract(HttpServletRequest request);
}
