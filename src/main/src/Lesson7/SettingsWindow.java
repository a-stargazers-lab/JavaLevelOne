package Lesson7;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SettingsWindow extends JFrame{

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 350;

    BufferedImage image;

    private MainWindow mainWindow;

    SettingsWindow(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Our game. New game settings.");

        Rectangle rectangle = mainWindow.getBounds();
        int posx = (int) (rectangle.getCenterX()- WINDOW_WIDTH / 2);
        int posy = (int) (rectangle.getCenterY()- WINDOW_HEIGHT / 2);

        setLocation(posx, posy);
        setResizable(false);

        setLayout(new GridLayout(9,1));
    }

}
