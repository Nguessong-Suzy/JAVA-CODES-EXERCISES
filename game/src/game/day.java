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
public class day {
    public static void main(String[] args){
        Scanner myInputScanner = new Scanner(System.in);
        double h, q, m, j, k, year;
        System.out.print("Enter year: (e.g., 2012): ");
        year = myInputScanner.nextDouble();
        System.out.print("Enter month: 1-12:  ");
        m = myInputScanner.nextDouble();
        System.out.print("Enter the day of the month: 1-31:  ");
        q = myInputScanner.nextDouble();
        if(m == 1){
            m = 13;
            year--;
        }
        if(m == 2)
        {
           m = 14;
           year--;
        }
        j = Math.floor(year / 100) ;
        k = Math.floor(year % 100) ;
        h = Math.floor((( q + ( 26*(m + 1) / 10) + k + (k / 4) + (j / 4) + 5*j) % 7));
        if(h == 0)
        {
            System.out.println("Day of the week is Saturday");
        }
        else if(h == 1)
        {
            System.out.println("Day of the week is Sunday");
        }
        else if(h == 2)
        {
            System.out.println("Day of the week is Monday");
        }
        else if(h == 3)
        {
            System.out.println("Day of the week is Tuesday");
        }
         else if(h == 4)
        {
            System.out.println("Day of the week is Wednesday");
        }
         else if(h == 5)
        {
            System.out.println("Day of the week is Thursday");
        }
         else if(h == 6)
        {
            System.out.println("Day of the week is Friday");
        }
    }
}
