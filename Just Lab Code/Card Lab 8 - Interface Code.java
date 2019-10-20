/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import javafx.scene.paint.Color;


/**
 *
 * @author wedun
 */
public class Card implements Comparable<Card>{
    private Color color;
    private String value;
    private char colorName;
    
    public Card(){
        color = Color.BLUE;
        value = "";   
    }
    public Card(Color color, String value){
        this.color = color;
        this.value = value;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    public void setColorName(){
            if(color.equals(Color.GREEN)){
                colorName = 'G';
            }
            if(color.equals(Color.RED)){
                colorName = 'R';
            }
            if(color.equals(Color.BLUE)){
                colorName = 'B';
            }
            else if(color.equals(Color.YELLOW)){
                colorName= 'Y';
            }
        }
    public char getColorChar(){
        if(color.equals(Color.BLUE)) return 'b';
         if(color.equals(Color.GREEN)) return 'g';
        if(color.equals(Color.RED)) return 'r';
        else{
            return 'y';
        }
    }
    
    public String toString(){
        setColorName();
        String listName = colorName+" , ";
        listName += value;
        return listName;
    }
    
    public int compareTo(Card o){
        if(this.getColor().equals(o.getColor())){
            if(Integer.parseInt(this.getValue()) > Integer.parseInt(o.getValue())){
                return 1;
            }
            else if(Integer.parseInt(this.getValue()) < Integer.parseInt(o.getValue())){
                return -1;
            }
            else{
                return 0;
            }
        }
        switch (this.getColorChar()){
            case 'b':
                return -1;
            case 'g': if(o.getColorChar() == 'b') return 1;
                return -1;
            case 'r': if(o.getColorChar() == 'y') return -1;
                return 1;
            default:
                return 1;
        }
    }
}
