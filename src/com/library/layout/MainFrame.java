package com.library.layout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private LoginForm loginForm;
    private DefaultPanel defaultPanel;

    public MainFrame(){
        super();
        this.setLayout(new BorderLayout());

        /////////////// Initializing Components /////////////////////
        this.defaultPanel = new DefaultPanel();
        this.loginForm = new LoginForm();
        this.loginForm.setLoginFormListener(loginFormEvent -> {
            String username = loginFormEvent.getUsername();
            System.out.println(username);
        });

        ///////////////// Adding Components /////////////////////
        this.add(this.loginForm, BorderLayout.WEST);
        this.add(this.defaultPanel, BorderLayout.CENTER);

        //////////////// Setting JFrame /////////////////////////
        this.setTitle("Home");
        this.setResizable(false);
        this.setSize(1300, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title + " | Library Management System");
    }
}
