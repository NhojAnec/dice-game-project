/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author NhojAnec
 */
public class Dice {
    private int dieSide;
    private int dieRoll1;
    private int dieRoll2;

    public Dice() {
        this.dieSide = 0;
    }

    public void set2DiceRoll() {
        this.dieRoll1 = (int) (Math.random() * (this.dieSide - 1 + 1) + 1);
        this.dieRoll2 = (int) (Math.random() * (this.dieSide - 1 + 1) + 1);
    }
    
    public int getRandomDieRoll() {
        return (int) (Math.random() * (this.dieSide - 1 + 1) + 1);
    }
    
    public int getDieSide() {
        return dieSide;
    }

    public void setDieSide(int dieSide) {
        this.dieSide = dieSide;
    }

    public int getDieRoll1() {
        return dieRoll1;
    }

    public int getDieRoll2() {
        return dieRoll2;
    }
    
    
}
