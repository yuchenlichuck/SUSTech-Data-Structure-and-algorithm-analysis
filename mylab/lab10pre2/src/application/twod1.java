package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class twod1 extends Application {
    @Override
    public void start(Stage stage) {
        Group root =new Group();
        Scene scene = new Scene(root, 300, 300);
        Rectangle rect = new Rectangle(100,100,50,50); 
        Circle circle =new Circle(125,175,25);
        StackPane pane = new StackPane();
        ((Group)scene.getRoot()).getChildren().add(rect);
        ((Group)scene.getRoot()).getChildren().add(circle);
        
        stage.setScene(scene);
        stage.show();
     }
    public static void main(String[] args) {
        launch(args);
    }
}
