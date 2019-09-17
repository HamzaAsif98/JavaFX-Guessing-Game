package application;

import java.util.Random;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class lotto {
	Tab tab1;
	private int guess;
	private int numberToGuess;
	private int counter=0;
	final int numTextFields =5 ;
	TextField[] textFields = new TextField[numTextFields];
	Random random = new Random();
	int [] randomnum=new int [5];
	int i;
	int win=0;


	public lotto(Tab tb1) {
		this.tab1=tb1;

	}

	public void open() {

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
			gamereset();
		});
		Button Exit = new Button("Exit");
		Exit.setOnAction(actionEvent -> {
			Platform.exit();
		});

		newgame.requestFocus();

		TextField tf1=new TextField();
		Label l1=new Label("---WELCOME TO GUESSING Lottery---");

		VBox root = new VBox(5);
		for (int i = 1; i <= numTextFields; i++) {
			TextField tf = new TextField();
			String name = "Text field "+i ;
			tf.setOnAction(e -> {
				System.out.println("Action on "+name+": text is "+tf.getText());
			});
			root.getChildren().add(tf);
			textFields[i-1] = tf ;
		}
		VBox v1 = new VBox();
		HBox h1 = new HBox();
		HBox h2 = new HBox();
		HBox h3 = new HBox();
		HBox h4 = new HBox();
		HBox h5 = new HBox();
		for(int i=1; i<21; i++){
			Button btnNumber = new Button();
			btnNumber.setText(String.valueOf(i));
			btnNumber.setOnAction((ActionEvent)->{
				textFields[counter++].setText(btnNumber.getText());
			});
			h1.getChildren().add(btnNumber);}
	
		for(int i1=21; i1<39; i1++){
			Button btn = new Button();
			
			btn.setText(String.valueOf(i1));
			btn.setOnAction((ActionEvent)->{
				textFields[counter++].setText(btn.getText());	
				
			}); 
		

			h2.getChildren().add(btn);
		}
		for(int i11=39; i11<51; i11++){
			Button btn1 = new Button();
			btn1.setText(String.valueOf(i11));
			btn1.setOnAction((ActionEvent)->{
				textFields[counter++].setText(btn1.getText());
			});  

			h3.getChildren().add(btn1);
		}
		
		h4.getChildren().addAll(newgame,guess);
		h5.getChildren().addAll(reset,Exit);
		h4.setSpacing(50);
		h5.setSpacing(50);
		v1.setSpacing(15);

		v1.getChildren().addAll(l1,root,h1,h2,h3,h4,h5);


		tab1.setContent(v1);

	}
	public void gamereset() {
		counter=0;
		gamesetup();
	}

		/* for( i = 0; i < textFields.length; i++ ){
			 textFields[i].clear();
			 textFields[i].setPromptText("Enter your guess"); 
		 }
	        
		
		 for( i = 0; i < randomnum.length; i++ ){
	            int random = new Random().nextInt(49)+1;
	            randomnum[i] =  random;   
	            System.out.print(" " +randomnum[i]);}
			System.out.println("\n"); }	
*/
	
	public void gamesetup(){

		 for( i = 0; i < textFields.length; i++ ){
		textFields[i].clear();
			 textFields[i].setPromptText("Enter your guess"); 
		 
		 }
	        
		 for( i = 0; i < randomnum.length; i++ ){
	            int random = new Random().nextInt(49)+1;
	            randomnum[i] =  random;   
	            System.out.print(" " +randomnum[i]);}
	System.out.println("\n");

	}
	
	public void gameplay() {
		int guess = Integer.parseInt(textFields[0].getText());
		int guess1 = Integer.parseInt(textFields[1].getText());
		int guess2 = Integer.parseInt(textFields[2].getText());
		int guess3 = Integer.parseInt(textFields[3].getText());
		int guess4 = Integer.parseInt(textFields[4].getText());
		
		Alert alert = new Alert(AlertType.INFORMATION);

	
		if(guess ==randomnum[0]||guess1 ==randomnum[0]||guess2 ==randomnum[0]||guess3 ==randomnum[0] ) {
		if(guess ==randomnum[1]||guess1 ==randomnum[1]||guess2 ==randomnum[1]||guess3 ==randomnum[1] ) {
			if(guess ==randomnum[2]||guess1 ==randomnum[2]||guess2 ==randomnum[2]||guess3 ==randomnum[2] ) {
				if(guess ==randomnum[3]||guess1 ==randomnum[3]||guess2 ==randomnum[3]||guess3 ==randomnum[3] ) {
					if(guess ==randomnum[4]||guess1 ==randomnum[4]||guess2 ==randomnum[4]||guess3 ==randomnum[4] ) {
						alert.setContentText("Congratulation you won 4 Stars");
						alert.showAndWait();
						win=4;
					
						
				}
			}
		}
		}
		else if(guess1 ==randomnum[0]||guess2 ==randomnum[0]||guess3 ==randomnum[0]||guess4 ==randomnum[0] ) {
			if(guess1 ==randomnum[1]||guess2 ==randomnum[1]||guess3==randomnum[1]||guess4 ==randomnum[1] ) {
				if(guess1 ==randomnum[2]||guess2 ==randomnum[2]||guess3 ==randomnum[2]||guess4 ==randomnum[2] ) {
					if(guess1 ==randomnum[3]||guess2 ==randomnum[3]||guess3==randomnum[3]||guess4 ==randomnum[3] ) {
						if(guess1 ==randomnum[4]||guess2 ==randomnum[4]||guess3 ==randomnum[4]||guess4==randomnum[4] ) {
							alert.setContentText("Congratulation you won 4 Stars");
							alert.showAndWait();
							win=4;
							}
					}
				}
			}
			}
		else if(guess ==randomnum[0]||guess2 ==randomnum[0]||guess3 ==randomnum[0]||guess4 ==randomnum[0] ) {
			if(guess ==randomnum[1]||guess2 ==randomnum[1]||guess3 ==randomnum[1]||guess4 ==randomnum[1] ) {
				if(guess ==randomnum[2]||guess2 ==randomnum[2]||guess3==randomnum[2]||guess4 ==randomnum[2] ) {
					if(guess ==randomnum[3]||guess2 ==randomnum[3]||guess3 ==randomnum[3]||guess4 ==randomnum[3] ) {
						if(guess ==randomnum[4]||guess2 ==randomnum[4]||guess3 ==randomnum[4]||guess4==randomnum[4] ) {
							alert.setContentText("Congratulation you won 4 Stars");
							alert.showAndWait();
							win=4;
							}
					}
				}
			}
			}
		else if(guess ==randomnum[0]||guess1 ==randomnum[0]||guess3 ==randomnum[0]||guess4 ==randomnum[0] ) {
			if(guess ==randomnum[1]||guess1 ==randomnum[1]||guess3 ==randomnum[1]||guess4 ==randomnum[1] ) {
				if(guess ==randomnum[2]||guess1 ==randomnum[2]||guess3 ==randomnum[2]||guess4 ==randomnum[2] ) {
					if(guess ==randomnum[3]||guess1 ==randomnum[3]||guess3 ==randomnum[3]||guess4 ==randomnum[3] ) {
						if(guess ==randomnum[4]||guess1 ==randomnum[4]||guess3 ==randomnum[4]||guess4==randomnum[4] ) {
			
							alert.setContentText("Congratulation you won 4 Stars");
							alert.showAndWait();
							win=4;
							}
					}
				}
			}
			}
		else if(guess ==randomnum[0]||guess1 ==randomnum[0]||guess2 ==randomnum[0]||guess4 ==randomnum[0] ) {
			if(guess ==randomnum[1]||guess1 ==randomnum[1]||guess2 ==randomnum[1]||guess4 ==randomnum[1] ) {
				if(guess ==randomnum[2]||guess1 ==randomnum[2]||guess2 ==randomnum[2]||guess4 ==randomnum[2] ) {
					if(guess ==randomnum[3]||guess1 ==randomnum[3]||guess2 ==randomnum[3]||guess4 ==randomnum[3] ) {
						if(guess ==randomnum[4]||guess1 ==randomnum[4]||guess2 ==randomnum[4]||guess4==randomnum[4] ) {
							alert.setContentText("Congratulation you won 4 Stars");
							alert.showAndWait();
							win=4;
							}
					}
				}
			}
			}
		else if(guess ==randomnum[0]&& guess1 ==randomnum[0]&&guess2 ==randomnum[0]&&guess3 ==randomnum[0]&&guess4==randomnum[0] ) {
			if(guess ==randomnum[1]&&guess1 ==randomnum[1]&&guess2 ==randomnum[1]&&guess3 ==randomnum[1] &&guess4==randomnum[1]) {
				if(guess ==randomnum[2]&&guess1 ==randomnum[2]&&guess2 ==randomnum[2]&&guess3 ==randomnum[2] &&guess4==randomnum[2]) {
					if(guess ==randomnum[3]&&guess1 ==randomnum[3]&&guess2 ==randomnum[3]&&guess3 ==randomnum[3]&&guess4==randomnum[3] ) {
						if(guess ==randomnum[4]&&guess1 ==randomnum[4]&&guess2 ==randomnum[4]&&guess3 ==randomnum[4]&&guess4==randomnum[4] ) {
						alert.setContentText("Congratulation you won 5 Stars");
						alert.showAndWait();
						win=5;
						}
					}
				}
			}
			}
		else
			alert.setContentText("Sorry You loose ...Press reset to get new number");
		alert.showAndWait();

		
		
		

	}}
}