package mylab;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Javafx extends Application{
	@Override
	public void start(Stage primaryStage) {
		try {
			Button button = new Button();
			button.setText("Hello world");
			button.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					System.out.println("Hello World!");
				}
			});
			
			StackPane stackPane=new StackPane();
			stackPane.getChildren().add(button);
			Scene scene=new Scene(stackPane,350,200);
			primaryStage.setTitle("hello World");
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		}
	public static void main(String[] args) {
		launch(args);
	}
}
