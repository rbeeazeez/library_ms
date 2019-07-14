package com.library.event;

import java.util.EventObject;

public class LoginFormEvent extends EventObject {

    private String username, password;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public LoginFormEvent(Object source) {
        super(source);
    }

    public LoginFormEvent(Object source, String username, String password) {
        super(source);

        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
