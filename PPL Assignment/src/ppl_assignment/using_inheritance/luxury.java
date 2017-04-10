/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * class of luxury gifts.
 * @author Harshit
 */
public class luxury extends gifts{
    int lux_rat,diff;

    public luxury(int lux_rat, int diff, int value, int price) {
        super(2, price, value);
        this.lux_rat = lux_rat;
        this.diff = diff;
    }
    public int getrating(){
        return lux_rat;
    }
    public int getdifficulty(){
        return diff;
    }
}
