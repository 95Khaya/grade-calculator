/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codsofttask2;

import java.util.Scanner;

/**
 *
 * @author khaya
 */
public class CodSoftTask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int totalMark = 0;
        char symbol;
        int total = 3;
        int [] Mark = new int[3];
        
       for(int i = 1;i<=total;i++){
            System.out.print("Subject :");
            Mark[i] = input.nextInt();
             totalMark += Mark[i];
            
        }
       
       double average = (double) totalMark/ total;
      
        
        if (average >= 90) {
            symbol = 'A';
        } else if (average >= 80) {
            symbol = 'B';
        } else if (average >= 70) {
            symbol = 'C';
        } else if (average >= 60) {
            symbol = 'D';
        } else {
            symbol = 'F';
        }
       System.out.println("Average is :"+ average);
       System.out.println("Symbol is : "+ symbol);
       
        
        
        
    }
    
}
