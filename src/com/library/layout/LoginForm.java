package com.library.layout;

import com.library.event.LoginFormEvent;
import com.library.event.LoginFormListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LoginForm extends JPanel {

    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private LoginFormListener loginFormListener;

    public LoginForm(){
        super();

        this.usernameLabel = new JLabel("Username: ");
        this.passwordLabel = new JLabel("Password: ");

        this.usernameField = new JTextField(10);
        this.passwordField = new JPasswordField(10);

        this.loginButton = new JButton("Login");
        this.loginButton.addActionListener(e -> {
            String username = this.usernameField.getText();
            String password = this.passwordField.getText();
            if (username.length() < 4){
                System.out.println("Username is invalid");
                return;
            }else if (password.length() < 4){
                System.out.println("Password is invalid");
                return;
            }
            LoginFormEvent loginFormEvent = new LoginFormEvent(this, username, password);
            if (this.loginFormListener != null)
                this.loginFormListener.LoginFormEventOccurred(loginFormEvent);
        });

        Dimension dimension =  getPreferredSize();
        dimension.width = 400;

        Border inner = BorderFactory.createTitledBorder("Login form");
        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        this.setPreferredSize(dimension);

        GridBagConstraints gConstraints = new GridBagConstraints();
        gConstraints.fill = GridBagConstraints.NONE;

        Insets rInsects5 = new Insets(0,0,0, 5);
        Insets emptyInsects = new Insets(0,0,0, 0);

        /////////////////// Row 0 ////////////////////////
        gConstraints.weightx = 1;
        gConstraints.weighty = 0.1;

        gConstraints.gridx = 0;
        gConstraints.gridy = 0;
        gConstraints.anchor = GridBagConstraints.LINE_END;
        gConstraints.insets = rInsects5;
        this.add(usernameLabel, gConstraints);

        gConstraints.gridx = 1;
        gConstraints.gridy = 0;
        gConstraints.anchor = GridBagConstraints.LINE_START;
        gConstraints.insets = emptyInsects;
        this.add(usernameField, gConstraints);

        /////////////////// Row 1 ////////////////////////
        gConstraints.weightx = 1;
        gConstraints.weighty = 0.1;
        gConstraints.gridx = 0;
        gConstraints.gridy = 1;
        gConstraints.anchor = GridBagConstraints.LINE_END;
        gConstraints.insets = rInsects5;
        this.add(passwordLabel, gConstraints);

        gConstraints.gridx = 1;
        gConstraints.gridy = 1;
        gConstraints.anchor = GridBagConstraints.LINE_START;
        gConstraints.insets = emptyInsects;
        this.add(passwordField, gConstraints);

        /////////////////// Row 2 ////////////////////////
        gConstraints.weightx = 1;
        gConstraints.weighty = 2.0;
        gConstraints.gridx = 1;
        gConstraints.gridy = 2;
        gConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        gConstraints.insets = emptyInsects;
        this.add(this.loginButton, gConstraints);

    }

    public void setLoginFormListener(LoginFormListener loginFormListener){
        this.loginFormListener = loginFormListener;
    }
}
