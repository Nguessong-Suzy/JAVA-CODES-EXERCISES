/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author BOSS
 */
public class lottery {
    public static void main(String[] args){
        int lottery_number;
        Random rand = new Random();
        lottery_number = rand.nextInt(900) + 100;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a lottery number"));
        JOptionPane.showMessageDialog(null, "Lottery number: " + lottery_number);
        int n3 = (int) Math.floor(number / 100);
        int n2 = ((int) Math.floor(number / 10)) % 10;
        int n1 = number % 10;
        int Ln3 = (int) Math.floor(lottery_number / 100);
        int Ln2 = ((int) Math.floor(lottery_number / 10)) % 10;
        int Ln1 = lottery_number % 10;
        
        if(lottery_number == number)
        {
             JOptionPane.showMessageDialog(null,"You win $10000!");  
        }
        else if((n3==Ln3 && n2==Ln1 && n1==Ln2)||(n3==Ln2 && n2==Ln3 && n1==Ln1)||(n3==Ln2 && n2==Ln1 && n1==Ln3)||(n3==Ln1 && n2==Ln2 && n1==Ln3)||(n3==Ln1 && n2==Ln3 && n1==Ln2))
        {
             JOptionPane.showMessageDialog(null,"You win $3000!");  
        }
        else if((n3==Ln3 && ((n2==Ln2 && n1!=Ln1)||(n2!=Ln2 && n1==Ln1)))||(n3==Ln3 && ((n2==Ln1 && n1!=Ln2)||(n2!=Ln1 && n1==Ln2)))||(n3==Ln2 && ((n2==Ln3 && n1!=Ln1)||(n2!=Ln3 && n1==Ln1)))||(n3==Ln2 && ((n2==Ln1 && n1!=Ln3)||(n2!=Ln1 && n1==Ln3)))||(n3==Ln1 && ((n2==Ln2 && n1!=Ln3)||(n2!=Ln2 && n1==Ln3)))||(n3==Ln1 && ((n2==Ln3 && n1!=Ln2)||(n2!=Ln3 && n1==Ln2)))||(n3!=Ln3 && ((n2==Ln2 && n1==Ln1)||(n2==Ln1 && n1==Ln2)))||(n3!=Ln2 && ((n2==Ln3 && n1==Ln1)||(n2==Ln1 && n1==Ln3)))||(n3!=Ln1 && ((n2==Ln2 && n1==Ln3)||(n2==Ln3 && n1==Ln2))))
        {
             JOptionPane.showMessageDialog(null,"You win $2000!");  
        }
        else if((n3==Ln3 && ((n2!=Ln2 && n1!=Ln1)||(n2!=Ln1 && n1!=Ln2)))||(n3==Ln2 && ((n2!=Ln1 && n1!=Ln3)||(n2!=Ln3 && n1!=Ln1)))||(n3==Ln1 && ((n2!=Ln3 && n1!=Ln2)||(n2!=Ln2 && n1!=Ln3)))||(n2==Ln3 && ((n3!=Ln1 && n1!=Ln2)||(n3!=Ln2 && n1!=Ln1)))||(n2==Ln2 && ((n3!=Ln1 && n1!=Ln3)||(n3!=Ln3 && n1!=Ln1)))||(n2==Ln1 && ((n3!=Ln3 && n1!=Ln2)||(n3!=Ln2 && n1!=Ln3)))||(n1==Ln3 && ((n2!=Ln2 && n3!=Ln1)||(n2!=Ln1 && n3!=Ln2)))||(n1==Ln2 && ((n2!=Ln3 && n3!=Ln1)||(n2!=Ln1 && n3!=Ln3)))||(n1==Ln1 && ((n2!=Ln2 && n3!=Ln3)||(n2!=Ln3 && n3!=Ln2))))
        {
             JOptionPane.showMessageDialog(null,"You win $1000!");  
        }
        else
        {
             JOptionPane.showMessageDialog(null,"You loose!");  
        }
    }
  
}
