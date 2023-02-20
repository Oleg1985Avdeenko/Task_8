package org.example.servlet;

import org.example.servlet.ServletCommand;

public enum CommandEnum {
    CREATE(new CreateCommand()),

    READ(new SelectCommand()),

    UPDATE(new UpdateCommand()),

    DELETE(new DeleteCommand());

    private final ServletCommand servletCommand;


    CommandEnum(final ServletCommand newServletCommand) {
        servletCommand = newServletCommand;
    }


    public ServletCommand getCurrentCommand() {
        return servletCommand;
    }
}
