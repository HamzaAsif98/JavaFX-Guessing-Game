package application;

import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.VBox;

import java.util.Random;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class guessgame {
	
	Tab tab;
	private int numberToGuess;
	private int counter;
	private int guess;
	private int countwin;
	 TextField guesstxt = new TextField();
	
	public guessgame(Tab tab) {
		this.tab=tab;
	}

	public void open() {
		  guesstxt.setPromptText("Press New Game Button!");

	        Button newgame = new Button("New Game");        
	        newgame.setOnAction(actionEvent ->{
	            gamesetup();
	        });

	        Button guess = new Button("Guess");
	        guess.setOnAction(actionEvent -> {
	            gameplay();
	        });
	        Button reset = new Button("Reset");
	        reset.setOnAction(actionEvent -> {
	            gamesetup();
	        });
	        Button Exit = new Button("Exit");
	        Exit.setOnAction(actionEvent -> {
	            Platform.exit();
	        });
	        
	        newgame.requestFocus();
		Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
		TextField tf1=new TextField();
		Label l1=new Label("---WELCOME TO GUESSING GAME---");
	
		VBox v1 = new VBox();
		v1.setSpacing(15);
		
		v1.getChildren().addAll(l1,guesstxt,newgame,reset,guess,Exit);
		
		tab.setContent(v1);

}
	public void gamesetup(){
		System.out.println(countwin);
		guesstxt.setPromptText("Enter your guess");//set guesstxt to zero
	        counter = 0; //set counter to zero

	        //set numberToGuess to a new random number
	        Random random = new Random();
	        numberToGuess = random.nextInt(50) + 1;
	        System.out.println("Number to guess: " + numberToGuess);
	}
	public void gameplay() {

        int guess = Integer.parseInt(guesstxt.getText());

        if(counter >3)//Check it counter == 5
        {
            System.out.println("Game over! You lose!");
            guesstxt.setPromptText("Game over! You lose!");
            guesstxt.setText("");
        }
        else{
            if(guess == numberToGuess)
            {	countwin++;
                System.out.println("You win");
                guesstxt.setPromptText("Your guess of " + guess + " is correct! You win!");
                guesstxt.setText("");
                System.out.println(countwin);
            }
            else if(guess < numberToGuess)
            {
                System.out.println("You guessed to low");
                guesstxt.setPromptText("You guessed to low! Try again.");
                guesstxt.setText("");
                counter++;
                
            }
            else 
            {
                System.out.println("You guessed to high! Try again.");
                guesstxt.setPromptText("You guessed to high! Try again.");
                guesstxt.setText("");
                counter++;
            }         
        }        
    }
	}

