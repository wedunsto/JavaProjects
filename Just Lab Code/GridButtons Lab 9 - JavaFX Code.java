/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author wedun
 */
public class GridButtons extends GridPane {
    MyHandler buttonFunctions;
    public GridButtons(int size){
        buttonFunctions = new MyHandler();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Button gridButton = new Button();
                gridButton.setStyle("-fx-background-color: blue");
                this.add(gridButton, j, i);
                gridButton.setOnAction(buttonFunctions);
            }
        }
    }
    public BorderPane test(){
        BorderPane teste = new BorderPane();
        
        return teste;
    }
    private char getColorChar(Button b )
    {
         if (b.getStyle().indexOf("blue") > -1) {
                    return '0';
                }
                else if (b.getStyle().indexOf("white") > -1) {
                    return '1';
                }
                else if (b.getStyle().indexOf("green") > -1) {
                    return 'S';
                }
                else {
                    return 'E';
                }
    }
    //Inner class handler for buttons
    private class MyHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e)
        {
            Button b = (Button) e.getSource();
            char val = getColorChar(b);
                if (val == '0') {  //the button is currently blue so change it to white
                    b.setStyle("-fx-background-color: white;");
                }
                else if (val == '1') {
                    b.setStyle("-fx-background-color: green;");
                   //TODO: Set background color to green
                }
                else if (val == 'S') {
                    b.setStyle("-fx-background-color: red;");
                   //TODO: Set background color to red
                }
                else {
                    b.setStyle("-fx-background-color: blue;");
                   //TODO: Set background color back to blue
                }
                
            
            }
        }
}