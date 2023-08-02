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
public class roots {
     public static void main(String[] args){
         Scanner myInputScanner = new Scanner(System.in);
        double root1, root2, a, b, c, discriminant;
        System.out.print("Enter the value of a, b, c: ");
        a = myInputScanner.nextDouble();
        b = myInputScanner.nextDouble();
        c = myInputScanner.nextDouble();
        discriminant = b*b - 4*a*c;
        if(discriminant > 0){
            root1 = (-b + Math.pow(discriminant, 0.5)) / (2*a);
            root2 = (-b - Math.pow(discriminant, 0.5)) / (2*a);
            System.out.format("The equation has two roots %.6f and %.5f\n", root1, root2);
        }
        else if(discriminant == 0){
            root1 = root2 = -b / (2*a);
            System.out.format("The equation has one root %.0f\n", root1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
     }
}
