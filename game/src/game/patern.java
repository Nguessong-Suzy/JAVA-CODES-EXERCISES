/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author BOSS
 */
public class patern {
    
    public static void displayPattern(int n){
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
     public static void main(String[] args){
         displayPattern(8);
     }
}
