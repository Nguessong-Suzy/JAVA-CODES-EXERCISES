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
public class palindrome {
    
    public static int reverse(int number){
        int rev=0;
        int n3 = (int) Math.floor(number / 100);
        int n2 = ((int) Math.floor(number / 10)) % 10;
        int n1 = number % 10;
        rev = (n1*100) + (n2*10) + n3;
        System.out.print("The reverse of " + number + " is " + rev + "\n");
        return rev;
    } 

    public static boolean isPalindrome(int number){
        if(reverse(number)== number){
            System.out.print("The number is a palindrome\n");
            return true;
        }
        else{
             System.out.print("The number is not a palindrome\n");
            return false;
        }       
    }
    
    public static void main(String[] args){
             int num;
             Scanner myInputScanner = new Scanner(System.in);
             System.out.print("Enter an integer:  ");
             num = myInputScanner.nextInt();
             isPalindrome(num);
         }
}
