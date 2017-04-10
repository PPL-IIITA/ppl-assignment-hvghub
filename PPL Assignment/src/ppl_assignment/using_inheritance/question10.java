/* <h1>question 10</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Make a data structure called as Randomk.
 * @author Harshit
 */

/*Make a data structure called as Randomk. The data structure instead of returning the highest 
  value item, returns a random item out of best n items. This data structure should be used in 
  q3 to make couples and select gifts. Use templates to avoid creating different implementations 
  for girls, boys and gifts.
 */
public class question10 extends random_K_data{
    // We set value of N = 10
    public void execute(){
        int n = 10;
        int[] a = new int[1000];
        generate();
        makeArrBoy(n,a);
        findBestK(b,a,n);
        makeArrGirl(n,a);
        findBestK(g,a,n);
        findCouples(n);
        // N = 1000 for gifts
        n = 1000;
        makeArrGifts1(a,n);
        findBestK(e,a,n);
        makeArrGifts2(a,n);
        findBestK(l,a,n);
        makeArrGifts3(a,n);
        findBestK(u,a,n);
        gifting_by_value(n);
        calc_happiness();
        calc_compatibilty();
        //Printing Top three most happy couples
        sort_hp(3, true);
    }
}
