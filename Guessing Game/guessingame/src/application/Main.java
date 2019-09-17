package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Adding Tabs
			
			TabPane tp=new TabPane();
			
			
			//add tabs in tabpane
			
			Tab tb=new Tab("Guessing Game");
			Tab tb1=new Tab("Lotto Cure");
			Tab tb2=new Tab("Prize");
			tp.getTabs().addAll(tb);
			tp.getTabs().addAll(tb1);
			tp.getTabs().addAll(tb2);
			new guessgame(tb).open();
			new lotto (tb1).open();
			new prize(tb2).open();
			VBox v1=new VBox();
			v1.getChildren().addAll(tp);
			AnchorPane root = new AnchorPane();
			root.getChildren().addAll(v1);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

