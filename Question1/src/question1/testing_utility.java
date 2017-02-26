/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Harshit
 */
public class testing_utility {
    public void generate(){
                Random rand = new Random();
                File file = new File("girls.csv");
		try{
			FileWriter fw = new FileWriter(file);
                        fw.write("Type,Name,Attractiveness,Maintainence_budget,Intelligence"+System.lineSeparator());
                        for (int i = 0; i < 100; i++) {
                            fw.write((rand.nextInt(3)+1)+",G"+(i+1)+","+(rand.nextInt(10)+1)+","+(rand.nextInt(1000)+1)+","+(rand.nextInt(100)+1)+System.lineSeparator());
                        }
                        fw.close();
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                
                File file1 = new File("boys.csv");
                try{
			FileWriter fw = new FileWriter(file1);
                        fw.write("Type,Name,Attractiveness,budget,Intelligence,Minimum_attractiveness_required"+System.lineSeparator());
                        for (int i = 0; i < 1000; i++) {
                            fw.write((rand.nextInt(3)+1)+",B"+(i+1)+","+(rand.nextInt(10)+1)+","+(rand.nextInt(1000)+1)+","+(rand.nextInt(100)+1)+","+(rand.nextInt(10)+1)+System.lineSeparator());
                        }
                        fw.close();
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                
                File file2 = new File("gifts.csv");
                try{
			FileWriter fw = new FileWriter(file2);
                        
                        fw.write("Type,Price,Value\n");
                        for (int i = 0; i < 100; i++) {
                            fw.write("Essential"+","+(rand.nextInt(250)+1)+","+(rand.nextInt(1000)+1)+System.lineSeparator());
                        }
                        fw.write(System.lineSeparator()+System.lineSeparator()+System.lineSeparator());
                        
                        fw.write("Type,Price,Value,Luxury_rating,Difficulty_to_obtain"+System.lineSeparator());
                        for (int i = 0; i < 100; i++) {
                            fw.write("Luxury"+","+(rand.nextInt(250)+1)+","+(rand.nextInt(1000)+1)+","+(rand.nextInt(1000)+1)+","+(rand.nextInt(10)+1)+System.lineSeparator());
                        }
                        fw.write(System.lineSeparator()+System.lineSeparator()+System.lineSeparator());;
                        
                        fw.write("Type,Price,Value,Utility_value,Utility_class"+System.lineSeparator());
                        for (int i = 0; i < 100; i++) {
                            fw.write("Utility"+","+(rand.nextInt(250)+1)+","+(rand.nextInt(1000)+1)+","+(rand.nextInt(1000)+1)+","+(rand.nextInt(10)+1)+System.lineSeparator());
                        }
                        fw.write(System.lineSeparator()+System.lineSeparator()+System.lineSeparator());
                        fw.close();
                        
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
    }
}
