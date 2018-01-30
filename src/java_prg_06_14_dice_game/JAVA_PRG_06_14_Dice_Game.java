/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_14_dice_game;

/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_06_14_Dice_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Die die = new Die();
        
        int counterPlayer1 = 0;
        int counterPlayer2 = 0;
        
        int result1;
        int result2;
        
        for(int i = 0 ; i < 10 ; i++) {
            result1 = die.generateDieRoll();
            result2 = die.generateDieRoll();
            
            System.out.println("Round " + (i + 1) + ":");
            System.out.println("Player 1: " + result1);
            System.out.println("Player 2: " + result2 + "\n");
            
            if(result1 > result2) {
                counterPlayer1++;
            }
            else if(result2 > result1) {
                counterPlayer2++;
            }
        }
        
        System.out.println("\nPlayer 1 wins: " + counterPlayer1);
        System.out.println("Player 2 wins: " + counterPlayer2);
        
        if(counterPlayer1 > counterPlayer2) {
            System.out.println("Player 1 wins!");
        }
        else if(counterPlayer2 > counterPlayer1) {
            System.out.println("Player 2 wins!");
        }
        else if(counterPlayer1 == counterPlayer2) {
            System.out.println("There was a tie.");
        }
    }
    
}
