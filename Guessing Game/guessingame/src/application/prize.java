package application;
import java.util.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javafx.scene.control.ButtonBase;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

public class prize {
	//before retrieving prize please check path thanks 
	
	File file = new File("E:\\Semester 2\\Object Oriented Programming\\lab1testfx\\Assignment\\src\\application\\prize.txt"); 
	Tab tab2;
	public prize(Tab tab) {
		this.tab2=tab;
	}
	public void open() {
		
		Button btn1 = new Button("Retrieve Prize");
		btn1.setOnAction(actionEvent ->{
			try {
				prize();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		VBox v1 = new VBox();
		VBox v2 = new VBox();
		 Label l1=new Label();
		  l1.setText("---Claim Your Prize Here---");
			
		  v1.getChildren().addAll(l1,btn1);
		
		tab2.setContent(v1);
	}
	 
		
	
	public void prize() throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
	}
}
