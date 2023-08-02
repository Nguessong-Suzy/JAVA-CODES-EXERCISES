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
public class numbers {
     public static void main(String[] args){
         int i, x=0;
         StringBuilder sb= new StringBuilder();
         for(i=100 ; i<=1000 ; i++)
         {
             if((i%5==0)&&(i%6==0))
             {
                  System.out.print(i+" "); 
                 
                  x++;
                  if(x==10)
                  {
                       System.out.print("\n");
                       x=0;
                  }
             }
         }
     }
}
