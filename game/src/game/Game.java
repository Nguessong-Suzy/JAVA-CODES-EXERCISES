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
public class Game {
    public static void main(String[] args){
        int random_number;
        Random rand = new Random();
        random_number = rand.nextInt(3);
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog("scissor (0), rock (1), paper (2)"));
        if(number == 0){
            if(random_number == 0){
              JOptionPane.showMessageDialog(null,"The computer is scissor. You are scissor. It is a draw");  
            }
            else if(random_number == 1){
              JOptionPane.showMessageDialog(null,"The computer is rock. You are scissor. You loose");  
            }
             else if(random_number == 2){
              JOptionPane.showMessageDialog(null,"The computer is paper. You are scissor. You won");  
            }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid input");  
             }
        }
         if(number == 1){
            if(random_number == 0){
              JOptionPane.showMessageDialog(null,"The computer is scissor. You are rock. You won");  
            }
            else if(random_number == 1){
              JOptionPane.showMessageDialog(null,"The computer is rock. You are rock. It is a draw");  
            }
             else if(random_number == 2){
              JOptionPane.showMessageDialog(null,"The computer is paper. You are rock. You loose");  
            }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid input");  
             }
        }
          if(number == 2){
            if(random_number == 0){
              JOptionPane.showMessageDialog(null,"The computer is scissor. You are paper. You loose");  
            }
            else if(random_number == 1){
              JOptionPane.showMessageDialog(null,"The computer is rock. You are paper. You won");  
            }
             else if(random_number == 2){
              JOptionPane.showMessageDialog(null,"The computer is paper. You are paper. It is a draw");  
            }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid input");  
             }
        }
          
    }
}

