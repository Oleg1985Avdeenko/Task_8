package org.example.servlet;

import javax.servlet.http.HttpServletRequest;

public final class CommandFactory {
    private static final CommandFactory COMMAND_FACTORY = new CommandFactory();


    private CommandFactory() {
    }


    public static CommandFactory getInstance() {
        return COMMAND_FACTORY;
    }


    public ServletCommand defineCommand(final HttpServletRequest request) {
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return null;
        }
        CommandEnum commandEnum = CommandEnum.valueOf(action.toUpperCase());
        return commandEnum.getCurrentCommand();
    }
}
