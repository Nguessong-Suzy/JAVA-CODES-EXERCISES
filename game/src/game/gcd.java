/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import javax.swing.JOptionPane;

/**
 *
 * @author BOSS
 */
public class gcd {
     public static void main(String[] args){
         int num1, num2, i, gcd=1;
          num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first positive number"));
          num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second positive number"));
          for(i=1; i<=num1 && i<=num2; i++)
          {
              if(num1 % i == 0 && num2 % i == 0)
              {
                  gcd = i;
              }
          }
          JOptionPane.showMessageDialog(null,"The GCD of " + num1 + " and " + num2 + " is " + gcd);
     }
}
