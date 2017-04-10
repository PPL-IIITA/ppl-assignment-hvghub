/* 
 * <h1>question 2</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import ppl_assignment.using_inheritance.question3;
/**
 * Prints beat K happiest and best K most compatible couples.
 * after allocating boyfriends to all girls in the same order as given in the input, 
 * and after performing gifting to all girls as per logic, print the best k happiest 
 * couples and the best k most compatible couples. Also print all gift details of gift 
 * exchanges between all couples. Solve the question without using inheritance.
 * @author Harshit
 */

public class question2 {
    Random rand = new Random();
    boys b[] = new boys[100];
    girls g[] = new girls[100];
    utility u[] = new utility[1000];
    luxury l[] = new luxury[1000];
    essential e[] = new essential[1000];
    couple c[] = new couple[1000];
    giftbasket gbk[] = new giftbasket[1000];
    question3 obj = new question3();
    int girl2_h=0,girl3_h=0,girl1_h=0,n = 0,couple_count;
    Scanner sc = new Scanner(System.in);
    public void execute(){
        obj.generate();
        obj.allocate();
        obj.gifting();
        obj.calc_happiness();
        obj.calc_happiness();
        obj.sort_hp(3, true);
        //Taking K = 3 here
        obj.sort_c(3);
    }
}
