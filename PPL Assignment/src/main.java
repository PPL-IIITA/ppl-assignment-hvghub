/*<h1> This is the main driver class for entire project</h1>
 * Just enter the question number which is to be executed
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import ppl_assignment.using_inheritance.*;
import ppl_assignment.without_using_inheritance.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This is the main driver class for entire project
 * @author Harshit
 */
public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the question name to be executed.......like 1, 2, 3,.....\n");
        int q = sc.nextInt();
        System.out.println();
        switch(q){
            case 1 : question1 q1 = new question1();
                     q1.execute();
                     break;
            case 2 : question2 q2 = new question2();
                     q2.execute();
                     break;
            case 3 : question3 q3 = new question3();
                     q3.execute();
                     break;
            case 4 : question4 q4 = new question4();
                     q4.execute();
                     break;
            case 5 : question5 q5 = new question5();
                     q5.execute();
                     break;
            case 6 : question6 q6 = new question6();
                     q6.execute();
                     break;
            case 7 : question7 q7 = new question7();
                     q7.execute();
                     break;
            case 8 : question8 q8 = new question8();
                     q8.execute();
                     break;
            case 9 : question9 q9 = new question9();
                     q9.execute();
                     break;
            case 10 : question10 q10 = new question10();
                      q10.execute();
                      break;
            default : System.out.println("Wrong Choice");
        }
    }
}
