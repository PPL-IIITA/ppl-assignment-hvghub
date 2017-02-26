package question1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshit
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import question1.*;
public class question1 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException{
        File file = new File("log.csv");
        testing_utility test = new testing_utility();
        test.generate();
        allocate all = new allocate();
        all.create_objs();
        FileReader fr = new FileReader(file); 
        char [] a = new char[50000];
        fr.read(a);   // reads the content to the array
        for(char c : a)
           System.out.print(c);   // prints the characters one by one
        fr.close();
    }
}
