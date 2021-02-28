package Lesson7;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameMap extends JPanel {

    private BufferedImage image;

    GameMap(){
        setBackground(Color.BLACK);

        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("Lesson7/javaOneImage.png"));

        JLabel label = new JLabel(imageIcon);
        add(label);
    }

    void startGame(int fieldSizeX, int fieldSizeY, int winLength, int gameMode){
        System.out.println("fildSize: " + fieldSizeX + " " + fieldSizeY +  "winLength" + winLength + "mode: " + gameMode);
    }

}
