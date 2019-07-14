package com.library.event;

import java.util.EventListener;

public interface LoginFormListener extends EventListener {
    void LoginFormEventOccurred(LoginFormEvent loginFormEvent);
}
