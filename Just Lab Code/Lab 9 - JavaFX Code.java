/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author wedun
 */
public class JavaFXApplication4 extends Application {
    private int n;
    private BorderPane root;
    @Override
    public void start(Stage primaryStage) {
        n=5;
        GridButtons mazeButtons = new GridButtons(n);
        root = new BorderPane();
        
        root.setCenter(mazeButtons);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Maze");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    //Returns the Maze character associated with the given button   
}
