/* <h1>question 7</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

import java.util.Hashtable;
import java.util.Random;

/**
 * To find girlfriends of given list of boys.
 * You are given a list of boys. Find their girlfriend (if any). There are three implementations possible, 
 * storing committed boys in a couple as an array/linked list, sorted array (binary search) and hash table. 
 * All have their own pros and cons. Make all three implementations. The library should be such that the 
 * programmer of the main program should be able to choose any of the implementation or prefer not to choose 
 * in which case the default choice will be taken.
 * @author Harshit
 */
public class question7 extends question3{

    public void execute() {
        int ch,i,j,k;
        boolean f = false;
        generate();
        allocate();
        System.out.println("\nList of boys:\n");
        Hashtable h=new Hashtable();
        Random rand = new Random();
        ch = 3;
        for (j = 0; j < 10; j++) {
            System.out.print(b[j].n+" ");
        }
        //Simple Array Search
        if(ch == 1){
            System.out.println("\n\n\nSimple Array Search:\n");
            for (j = 0; j < 10; j++){
                f = false;
                for(i = 0; i < 100; i++){
                    if(c[i] != null && c[i].b.n == b[j].n){
                        System.out.println(c[i].b.n + " ----> " + c[i].g.n + "\n");
                        f = true;
                    }
                }
                if(f == false){
                    System.out.println("Sorry.....for boy " + b[j].n + " ....no girlfriend found\n");
                }
            }
            
        }
        //Sorted Array Search
        else if(ch == 2){
            System.out.println("\n\n\nSorted Array Search:\n");
            for (j = 0; j < 10; j++){
                f = false;
                for(i = 0; i < 100; i++){
                    if(c[i] != null && c[i].b.n == b[j].n){
                        System.out.println(c[i].b.n + " ----> " + c[i].g.n + "\n");
                        f = true;
                    }
                }
                if(f == false){
                    System.out.println("Sorry.....for boy " + b[j].n + " ....girlfriend not found\n");
                }
            }
            
        }
        //Default choice is Hash Table
        //Hash Table Search
        else{
            System.out.println("\n\n\nDefault choice is Hash Table:\n");
            System.out.println("Hash Table Search:\n");
            for (j = 0; j < 10; j++){
                for(i = 0; i < 100; i++){
                    if(c[i] != null && c[i].b.n == b[j].n){
                        h.put(c[i].b.n, c[i].g.n);
                    }
                }
                if(h.get(b[j].n) != null){
                    System.out.println(b[j].n + " ----> " + h.get(b[j].n) + "\n");
                }
                else{
                    System.out.println("Sorry.....for boy " + b[j].n + " ....girlfriend not found\n");
                }
            }
            
        }
    }
    
}
