import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import stanford.spl.GButton;
import stanford.spl.GTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class MainClass extends GraphicsProgram implements ActionListener
{

    public GOval food;

    private ArrayList<SnakePart> snakeBody;

    private int snakeX, snakeY, snakeWidth, snakeHeight;

    public Timer timer = new Timer(200, this);

    private boolean isPlaying, isGameOver;
    private int score, previousScore;
    private GLabel scoreLabel;
    private GLabel instructions;
    private GLabel startLabel, colorLabel;
    private Color snakeColor;
    private Boolean showColorSelection;

    private GTextField colorLabel, redLabel, greenLabel, blueLabel;
    private GButton submitButton;


    public void run()
    {
        addKeyListeners();
        setUpStartScreen();

        food = new Ball (50,50,100,100);
    }


    // food changes location randomly
    public void randomFood(){

        Random random = new Random();
        int randx = random.nextInt(0, (int) getCanvasSize().getWidth());
        int randy = random.nextInt(0, (int) getCanvasSize().getHeight());
        food.setLocation(randx, randy);

    }

    // add instructions and scoreboard to screen
    private void setUpStartScreen(){

        startLabel = new GLabel("Press anything to start", getWidth()/2, getHeight()/2);
        startLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(startLabel);
        showColorSelection = false;

    }
    public void keyPressed(KeyEvent e){
        if (!showColorSelection) {
            remove(startLabel);
            showColorSelection = true;

            GLabel colorLabel = new GLabel("Enter RGB values (0-255):", getWidth()/2, getHeight()/2);
            add(colorLabel);

            GLabel redLabel = new GLabel("Red:", getWidth()/2 - 100, getHeight()/2 + 20);
            add(redLabel);
            GTextField redField = new GTextField("", 5);
            add(redField, getWidth()/2, getHeight()/2 + 20);

            GLabel greenLabel = new GLabel("Green:", getWidth()/2 - 100, getHeight()/2 + 40);
            add(greenLabel);
            GTextField greenField = new GTextField("", 5);
            add(greenField, getWidth()/2, getHeight()/2 + 40);

            GLabel blueLabel = new GLabel("Blue:", getWidth()/2 - 100, getHeight()/2 + 60);
            add(blueLabel);
            GTextField blueField = new GTextField("", 5);
            add(blueField, getWidth()/2, getHeight()/2 + 60);

            GButton submitButton = new GButton("Submit");
            add(submitButton, getWidth()/2, getHeight()/2 + 80);

            submitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int red = Integer.parseInt(redField.getText());
                    int green = Integer.parseInt(greenField.getText());
                    int blue = Integer.parseInt(blueField.getText());
                    snakeColor = new Color(red, green, blue);
                    // Start the game here
                    timer.start();
                    remove(startLabel);
                    remove(colorLabel);
                    remove(redLabel);
                    remove(redField);
                    remove(greenLabel);
                    remove(greenField);
                    remove(blueLabel);
                    remove(blueField);
                    remove(submitButton);
                }
            });
    }
    public void drawSnake()
    {

    }

    public void keyPressed(KeyEvent keyPressed)
    {
        switch (keyPressed.getKeyCode())
        {
            case KeyEvent.VK_UP:


            case KeyEvent.VK_DOWN:


            case KeyEvent.VK_LEFT:


            case KeyEvent.VK_RIGHT:


        }
    }


    private void redrawSnake()
    {
    }

    private void growSnake()
    {
    }

    private void moveUp()
    {
    }

    private void moveDown()
    {
    }

    private void moveLeft()
    {
    }

    private void moveRight()
    {
    }


    @Override
    public void actionPerformed(ActionEvent arg0)
    {

    }

    public static void main(String[] args)
    {
        new MainClass().start();


    }
}