package org.example.servlet;

import org.example.bean.Animal;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "AnimalServlet", urlPatterns = {"/"})
public class AnimalServlet extends HttpServlet {

    @Override
    protected void doGet(final HttpServletRequest request,
                         final HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(final HttpServletRequest request,
                          final HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(final HttpServletRequest req,
                                final HttpServletResponse resp)
            throws ServletException, IOException {
        String page;
        ServletCommand servletCommand = CommandFactory.getInstance()
                .defineCommand(req);
        page = Objects.requireNonNull(servletCommand).execute(req);
        getServletContext().getRequestDispatcher(page).forward(req, resp);
    }
}
