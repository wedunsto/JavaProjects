/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author wedun
 */
public class PlayerStats {
    private static void readData(String[] names, int[] scores, String filename){
        try{
            Scanner scnr = new Scanner(new File(filename));
            int count = 0;
            while(scnr.hasNext() && count < names.length) {
                String[] line = scnr.nextLine().split(" ");
                names[count] = line[0].trim();
                scores[count] = Integer.parseInt(line[1].trim());
                count++;
            }
        }
        catch (java.io.FileNotFoundException ex){
            //Logger.getLogger(ArraysLab.class.getName())
            System.err.println("Player Data not found");
        }
    }
    private static void printData(String[] names, int[] scores, int ARRAY_SIZE){
        for(int i=0;i<ARRAY_SIZE;i++){
            System.out.printf("%-15s%15s%n", names[i], scores[i]);
        }
    }
    private static double findAvg(int[] scores, int ARRAY_SIZE){
        int i;
        double sum = 0;
        for(i=0; i<ARRAY_SIZE;i++){
            sum += scores[i];
        }
        double average = sum / ARRAY_SIZE;
        return average;
    }
    private static void selectionSort(String[] names, int[] scores, int ARRAY_SIZE){
       int i;
       int j;
       int tempScores;
       String tempNames;
       
       for(i=0;i<ARRAY_SIZE;i++){
           for(j=i+1;j<ARRAY_SIZE;j++){
               if(scores[i] < scores[j]){
                   tempScores = scores[i];
                   tempNames = names[i];
                   scores[i] = scores[j];
                   names[i] = names[j];
                   scores[j] = tempScores;
                   names [j] = tempNames;
               }
           }
       }
       for(i=0;i<ARRAY_SIZE;i++){
           System.out.printf("%-15s%15s%n",names[i],scores[i]);
       }
    }
    private static void topResults(String[] names, int[] scores, int TOPX, int ARRAY_SIZE){
        int i;
        selectionSort(names,scores,ARRAY_SIZE);
        for(i=0; i< ARRAY_SIZE && i < TOPX; i++){
            System.out.printf("%-15s%15s%n", names[i], scores[i]);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ARRAY_SIZE = 80;
        final int TOPX = 10;
        String[] playerNames = new String[80];
        int[] scores = new int[80];
        
        readData(playerNames, scores, "playerData2.txt");
        printData(playerNames, scores, ARRAY_SIZE);
        System.out.println("The average of the high scores is: "+findAvg(scores, ARRAY_SIZE));
        selectionSort(playerNames,scores,ARRAY_SIZE);
        topResults(playerNames,scores,TOPX,ARRAY_SIZE);
        //TODO code application logic here
    }
    
}
