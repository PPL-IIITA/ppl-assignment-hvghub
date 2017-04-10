/* <h1>question 9</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Makes a data structure that returns the best k valued items instead of the best valued item. 
 * @author Harshit
 */

/*Make a data structure that returns the best k valued items instead of the best valued item. 
  Using this data structure make couples in q3 such that the boy picks up the girl by the 
  secondary criterion (maintenance) instead of the primary criterion (attractiveness) from 
  the top k alternatives. Similarly the girl picks up the secondary criterion instead of the
  primary (as per type) from the top k alternatives. Similarly the boy picks up a gift as per 
  secondary criterion (value), instead of the primary criterion (cost) from the top k alternatives. 
  Use templates to avoid creating different implementations for girls, boys and gifts.*/

public class question9 extends Best_K_Data{
    public void execute(){
        //Value of K assumed to be 10
        int k = 10;
        int[] a = new int[1000];
        generate();
        makeArrBoy(k,a);
        findBestK(b,a,k);
        makeArrGirl(k,a);
        findBestK(g,a,k);
        findCouples(k);
        k = 1000;
        // K = 1000 for gifts
        makeArrGifts1(a,k);
        findBestK(e,a,k);
        makeArrGifts2(a,k);
        findBestK(l,a,k);
        makeArrGifts3(a,k);
        findBestK(u,a,k);
        gifting_by_value();
        calc_happiness();
        calc_compatibilty();
        //Printing Top three most happy couples
        sort_hp(3, true);
    }
}
