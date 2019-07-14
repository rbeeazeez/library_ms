package com.library.layout;

import com.library.MainUtilities;

import javax.swing.*;

public class DefaultPanel extends JLabel {

    private ImageIcon backgroundImage;

    public DefaultPanel(){
        super();
        this.backgroundImage = new ImageIcon(MainUtilities.getRootDirectory()+"/assets/background.jpg");
        setIcon(backgroundImage);
    }
}
