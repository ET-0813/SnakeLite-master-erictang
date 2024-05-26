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
    private GLabel startLabel, colorLabel, instructionsLabel;
    private Color snakeColor;
    private Boolean showColorSelection;

    private Boolean showInstructions;

    private GTextField redLabel, greenLabel, blueLabel;
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

        startLabel = new GLabel("Press any key to start", getWidth()/2, getHeight()/2);
        startLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(startLabel);
        showInstructions = false;

    }
    private void ShowInstructions(){

    }
    public void keyPressed(KeyEvent e){
        if (!showInstructions) {
            remove(startLabel);
            showInstructions = true;
            Instructions instructions = new Instructions("Use the arrow keys to move the snake.", getWidth()/2, getHeight()/2);
            instructions.setFont(new Font("Arial", Font.BOLD, 20));
            add(instructions);


            submitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    snakeColor = Color.green;
                    // Start the game here
                    timer.start();
                    remove(startLabel);
                }
            });
        }

    }

    public void drawSnake()
    {

    }
/*
    public void keyPressed(KeyEvent keyPressed)
    {
        switch (keyPressed.getK2eyCode())
        {
            case KeyEvent.VK_UP:


            case KeyEvent.VK_DOWN:


            case KeyEvent.VK_LEFT:


            case KeyEvent.VK_RIGHT:


        }
    }

*/
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