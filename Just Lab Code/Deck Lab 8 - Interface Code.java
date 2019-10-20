/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.paint.Color;

/**
 *
 * @author wedun
 */
public class Deck {
    private ArrayList<Card> cards;
    Deck(){
        cards = new ArrayList<>();
        cards.add(new Card(Color.GREEN, "0"));
        cards.add(new Card(Color.RED, "0"));
        cards.add(new Card(Color.BLUE, "0"));
        cards.add(new Card(Color.YELLOW, "0"));
        for(int i=1;i<=9;i++){
            cards.add(new Card(Color.GREEN, i+""));
            cards.add(new Card(Color.GREEN, i+""));
            cards.add(new Card(Color.RED, i+""));
            cards.add(new Card(Color.RED, i+""));
            cards.add(new Card(Color.BLUE, i+""));
            cards.add(new Card(Color.BLUE, i+""));
            cards.add(new Card(Color.YELLOW, i+""));
            cards.add(new Card(Color.YELLOW, i+""));
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
        Collections.shuffle(cards);
    }
    public void sort(){
        Collections.sort(cards);
    }
    public String toString(){
        int counter = 0;
        //setColorName();
        String listName="";
        for(int i=0; i<cards.size();i++){
            if((i % 15)==0){
                listName += "\n"+cards.get(i)+" | ";
            }
            else{
                listName += cards.get(i)+" | ";
            }
        }
        return listName;
    }
}
