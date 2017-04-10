/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * class of utility gifts.
 * @author Harshit
 */
public class utility extends gifts{
    int util_val,util_class;

    public utility(int util_val, int util_class, int value, int price) {
        super(3, price, value);
        this.util_val = util_val;
        this.util_class = util_class;
    }
    public int getclass(){
        return util_class;
    }
    public int getutilvalue(){
        return util_val;
    }
}
