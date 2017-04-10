/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class of utility gifts.
 * @author Harshit
 */
public class utility{
    int util_val,util_class;
    int type,price,value;

    public utility(int util_val, int util_class, int value, int price) {
        this.util_val = util_val;
        this.util_class = util_class;
        this.type = 3;
        this.price = price;
        this.value = value;
    }
    
    public int getclass(){
        return util_class;
    }
    public int getutilvalue(){
        return util_val;
    }
}
