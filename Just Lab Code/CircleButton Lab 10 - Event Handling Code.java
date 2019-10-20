/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author wedun
 */
public class CircleButton extends StackPane{
    private Label lblValue;
    private Circle circle;

    public CircleButton(){
        lblValue = new Label(" ");
        circle = new Circle();
        circle.setFill(Color.WHITE);
        this.setPrefSize(100, 100);
        circle.setRadius(45);
        this.getChildren().addAll(circle,lblValue);
    }
    public CircleButton(String labelProperty){
        lblValue = new Label(" ");
        circle = new Circle();
        circle.setFill(Color.WHITE);
        lblValue = new Label(labelProperty);
        this.setPrefSize(100, 100);
        circle.setRadius(45);
        this.getChildren().addAll(circle,lblValue);
    }
    public void setColor(Paint color){
        circle.setFill(color);
    }
    public Paint getColor(){
        return circle.getFill();
    }
    public String getValue(){
        return lblValue.getText();
    }
}
