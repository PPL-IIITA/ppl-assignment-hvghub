/* <h1>question 6</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Assumes that gifting occurs T days in a calender month.
 * Suppose that gifting is not limited to Valentines day alone, but t days in a calendar month, 
 * well-marked. After every such day, couples with happiness less than t break up and form new couples.
 * @author Harshit
 */

/*Objective : Suppose that gifting is not limited to Valentines day alone, but t days in a calendar month, well-marked. 
  After every such day, couples with happiness less than t break up and form new couples.*/

public class question6 extends question4{
    public void execute(){
        System.out.println("\nSuppose gifting happens for t = 5 days in a calender month\n");
        int t = 5;
        question4 qn = new question4();
        //Formation of couples initially
        qn.workout(t);
        //Suppose gifting happens for t days in a calender month
        //Then we loop for t seasons in a calender year and perform breakups and formation of new couples.
        for (int i = 0; i < t; i++) {
            System.out.println("\n\n\nBreakup Season: " + (i+1) + "\n");
            qn.breakup(t);
        }
    }
}
