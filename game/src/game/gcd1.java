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
public class gcd1 {
      public static void main(String[] args){
         int n1, n2, i, gcd=1;
          n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first positive number"));
          n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second positive number"));
          int d =Math.min(n1, n2);
          while(n1 % d != 0 && n2 % d != 0)
          {
             
              
          
          if(n1 % d == 0 && n2 % d == 0)
              {
                  gcd = d;
                  break;
              }
           d--;
          }
          JOptionPane.showMessageDialog(null,"The GCD of " + n1 + " and " + n2 + " is " + gcd);
     }
}
