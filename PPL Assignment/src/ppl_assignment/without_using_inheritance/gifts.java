/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Collection of all types of gifts.
 * @author Harshit
 */
public class gifts {
    int type,price,value;

    public gifts(int type, int price, int value) {
        this.type = type;
        this.price = price;
        this.value = value;
    }
    public int gettype(){
        return type;
    }
    public int getprice(){
        return price;
    }
    public int getvalue(){
        return value;
    }
}
