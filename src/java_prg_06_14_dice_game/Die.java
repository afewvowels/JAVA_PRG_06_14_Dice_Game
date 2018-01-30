/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_14_dice_game;

import java.util.Random;
/**
 *
 * @author bluebackdev
 */
public class Die {
    
    Random random = new Random();
    
    public Die() {
    }
    
    public int generateDieRoll(){
        int value;
        
        value = random.nextInt(6) + 1;
        
        return value;
    }
}
