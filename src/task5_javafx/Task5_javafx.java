/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package task5_javafx;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 *
 * @author wak
 */
public class Task5_javafx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Circle circle =new Circle(200);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(250);
        circle.setCenterY(250);
       StackPane pane = new StackPane();
       pane.getChildren().add(circle);
        
         BorderPane borderpane =new BorderPane();
         borderpane.setPadding(new Insets(40));
         
        Ellipse ellipes1 =new Ellipse(30,20);
        Ellipse ellipes2 =new Ellipse(30,20);
         ellipes1.setFill(Color.BLACK);
         ellipes1.setFill(Color.BLACK);
         
        FlowPane flowpane = new FlowPane(Orientation.HORIZONTAL, 60, 15);
         flowpane.setAlignment(Pos.TOP_CENTER);
         flowpane.setPadding(new Insets(60));
         
        flowpane.getChildren().add(ellipes1);
         flowpane.getChildren().add(ellipes2);
       
          
          
          Arc arc = new Arc(200, 200, 100, 80, 260, 20);
          arc.setType(ArcType.ROUND);
          arc.setFill(Color.BLACK);
        borderpane.setCenter(arc);
            borderpane.setAlignment(arc,Pos.CENTER);
            
          Arc arc2 = new Arc(200, 500, 90, 30, 180, 180);
          arc2.setType(ArcType.ROUND);
          arc2.setFill(Color.BLACK);
 
          borderpane.setBottom(arc2);
           borderpane.setAlignment(arc2,Pos.CENTER);
          
          
         
         pane.getChildren().add(borderpane);
       pane.getChildren().add(flowpane);
         Scene scene =new Scene(pane ,400,400);
         
       primaryStage.setTitle("face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
