/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author BOSS
 */
public class positivenegative {
      public static void main(String[] args){
          double total=0, average=0;
          int i, positive=0, negative=0;
          Scanner myInputScanner = new Scanner(System.in);
          int numbers[] = new int[100];
          System.out.print("Enter an integer, the input ends if it is 0: ");
          for(i=0; i<numbers.length; i++)
          {
              numbers[i] = myInputScanner.nextInt();
              if(numbers[i] == 0)
              {
                  break;
              }
              if(Integer.signum(numbers[i]) == 1)
              {
                  positive++;
              }
              if(Integer.signum(numbers[i]) == -1)
              {
                  negative++;
              }
              
              total += numbers[i];
              average = total / (i+1);
          }
          
          System.out.println("The number of positives is " + positive);
          System.out.println("The number of negatives is " + negative);
          System.out.println("The total is " + total);
          System.out.println("The average is " + average);
      }
}
