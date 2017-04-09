/* 
 * <h1>question 1</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package ppl_assignment.without_using_inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Formation of couples.
 * Allocate boyfriends to all girls in the same order as given in the input, 
 * and print the couples so formed without using inheritance
 * @author Harshit
 */

public class question1 {
    public void execute() throws FileNotFoundException, IOException{
        File file = new File("log.csv");
        testing_utility test = new testing_utility();
        test.generate();
        allocate all = new allocate();
        all.create_objs();
        FileReader fr = new FileReader(file); 
        char [] a = new char[5000];
        fr.read(a);
        for(char c : a)
           System.out.print(c);
        fr.close();
        System.out.println();
    }
}
