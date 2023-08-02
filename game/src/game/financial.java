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
public class financial {
     public static void main(String[] args){
         Scanner myInputScanner = new Scanner(System.in);
         double amount, amount1=0, annualp, month;
         System.out.print("Enter the initial deposit amount: ");
         amount = myInputScanner.nextDouble();
         System.out.print("Enter annual percentage yield: ");
         annualp = myInputScanner.nextDouble();
         System.out.print("Enter maturity period (number of months): ");
         month = myInputScanner.nextDouble();
         System.out.println("Month  CD Value");
         for(double i=1; i<=month; i++)
         {
             amount1=amount + (amount*annualp)/1200;
             System.out.format("%.0f\t%.2f\n", i, amount1);
             amount=amount1;
         }
     }
    
}
