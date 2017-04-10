/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class of essential gifts.
 * @author Harshit
 */
public class essential{
    int type,price,value;

    public essential(int value, int price) {
        this.type = 1;
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
