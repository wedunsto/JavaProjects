/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author wedun
 */
public class Lab10 extends Application {
    CirlceEvents handler = new CirlceEvents();
    AntiCirlceEvents nonhandler = new AntiCirlceEvents();
    TextField calculation = new TextField();
    @Override
    public void start(Stage primaryStage) {
        calculation.setEditable(false);
        GridPane numPad = new GridPane();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                CircleButton nums = new CircleButton((i*3)+j+1+"");
                nums.setOnMousePressed(handler);
                nums.setOnMouseReleased(nonhandler);
                numPad.add(nums,j,i);
            }
        }
        HBox controlPanel = new HBox();
        controlPanel.setAlignment(Pos.BASELINE_CENTER);
        Button square = new Button("x^2");
        square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculation.setText(Math.pow(Double.parseDouble(calculation.getText()), 2)+"");
            }
        });
        Button squareRoot = new Button("Sqrt");
        squareRoot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculation.setText(Math.sqrt(Double.parseDouble(calculation.getText()))+(""));
            }
        });
        Button clear = new Button("Clr");
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               calculation.setText("");
            }
        });
        controlPanel.getChildren().addAll(square,squareRoot,clear);
        BorderPane root = new BorderPane();
        root.setTop(calculation);
        root.setCenter(numPad);
        root.setBottom(controlPanel);
        Scene scene = new Scene(root, 450, 450);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
        private class CirlceEvents implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event) {
           CircleButton b = (CircleButton) event.getSource();
           b.setColor(Color.RED);
           calculation.appendText(b.getValue());
        }
}
        private class AntiCirlceEvents implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event) {
           CircleButton b = (CircleButton) event.getSource();
           b.setColor(Color.WHITE);
        }
}
}
