/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class of luxury gifts.
 * @author Harshit
 */
public class luxury{
    int lux_rat,diff;
    int type,price,value;

    public luxury(int lux_rat, int diff, int value, int price) {
        this.lux_rat = lux_rat;
        this.diff = diff;
        this.type = 2;
        this.price = price;
        this.value = value;
    }
    
    public int getrating(){
        return lux_rat;
    }
    public int getdifficulty(){
        return diff;
    }
}
