/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author wedun
 */
public class Lab8 /*extends Application*/{
    /*protected Pane pane = new Pane();
    protected Scene scene = new Scene(pane);
    protected Stage applicationStage = new Stage();
    public void start(Stage primaryStage) throws Exception{
        applicationStage.setScene(scene);
        applicationStage.setTitle("Uno Stage");
        applicationStage.show();
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Application.launch();
        
        // TODO code application logic here
        Deck uno = new Deck();//instantiate a new deck
        uno.shuffle();
        String output = uno.toString();//save toString() method to String variable
        JOptionPane.showMessageDialog(null, output);//outputs toString() to pane
        uno.sort(); 
        String output1 = uno.toString();//save toString() method to String variable
        JOptionPane.showMessageDialog(null, output1);//outputs toString() to pane
        
    }
    
}
