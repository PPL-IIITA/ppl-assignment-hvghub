/* <h1>question 4</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

import java.util.Scanner;

/**
 * Perform a breakup after Valentines day of the least k happy couples. 
 * Assign new (different) boyfriends to the girls who broke up.
 * @author Harshit
 */
public class question4 extends question3{
   boys bb[] = new boys[100];
   girls gg[] = new girls[100];
   int n;
   public void execute(){
       //Assuming value of K = 20
       int k = 20;
       workout(k);
       System.out.println("\n\n");
       breakup(k);
   }
   public void workout(int t){
       generate();
       allocate();
       gifting();
       calc_happiness();
       calc_compatibilty();
       sort_hp(0,true);
       System.out.println("Breakup happening of " + t + " least happy couples");
       int k = t;
   }
    //Breakup of least K happy Couples
    public void breakup(int k) {
        for (int i = couple_count,j = 0; j < k && i >= 0; i--,j++) {
            if(cc[i] != null){
                cc[i].b.status = 0;
                cc[i].g.status = 0;
                bb[j] = cc[i].b;
                gg[j] = cc[i].g;
                cc[i] = null;
            }
        }
        formNewCouples(k);
    }
    //New couples maker
    public void formNewCouples(int k){
       int i = 0;
       System.out.println("New Couples Possible are:\n");
       for (int j = 0; j < Math.min(couple_count, k); j++) {
           bb[j] = new boys(rand.nextInt(500),rand.nextInt(1000),"B"+rand.nextInt(100),rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(3)+1);
       }
       for (int j = 0; j < Math.min(couple_count, k); j++){
           gg[j] = new girls(rand.nextInt(1000),"G"+rand.nextInt(100),rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(3)+1);
       }
       for(girls gs : gg){
           if(gs != null && gs.status == 0){
               for(boys bs : bb){
                   if(bs != null && bs.getreq_attraction() <= gs.getatt() && bs.getbudget() >= gs.getbudget() && bs.status == 0 && gs.status == 0){
                       bs.commit();
                       gs.commit();
                       System.out.println(bs.n+"\t"+gs.n);
                       i++;
                   }
               }
           }
       }
       if(i == 0)   System.out.println("No couples possible after breakup in current season");
    }
    
}
