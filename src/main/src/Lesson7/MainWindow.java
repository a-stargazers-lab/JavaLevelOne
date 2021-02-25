package Lesson7;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Полностью разобраться с кодом (попробовать полностью самостоятельно переписать одно из окон)
 * Составить список вопросов и приложить в виде комментария к домашней работе
 */

public class MainWindow extends JFrame {

    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 500;
    private static final int WINDOW_POS_X = 800;
    private static final int WINDOW_POS_Y = 300;

    private SettingsWindow settingsWindow;
    private GameMap gameMap;

    MainWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setTitle("Our game (MainWindow)");
        setResizable(true);

        settingsWindow = new SettingsWindow(this);
        gameMap = new GameMap();

        JButton btnStart = new JButton("Start New Game");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });
        JButton btnExit = new JButton("Exit Game");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));

        buttonPanel.add(btnStart);
        buttonPanel.add(btnExit);
        add(buttonPanel, BorderLayout.NORTH);
        add(gameMap);


        setVisible(true);
    }

    private void startGame(int fieldSizeX, int fieldSizeY, int winLength, int gameMode){
        gameMap.startGame(fieldSizeX, fieldSizeY, winLength, gameMode);

    }

}
