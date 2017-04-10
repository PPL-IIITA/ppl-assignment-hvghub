/* <h1>question 5</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Another implementation of making couples.
 * Rather than making couples by taking girls one by one as in question 1, we create a different mechanism. 
 * First one girl chooses a boy, then one boy echoes a girl, and so on. The girl list is ordered by maintenance 
 * cost, while the boy list is ordered by attractiveness. The boys always chose the most attractive available 
 * girl. Print the happiest k couples.
 * @author Harshit
 */
public class question5 extends question3{
    public void execute(){
       generate();
       modified_allocate();
       gifting();
       calc_happiness();
       calc_compatibilty();
       //Assuming K = 3
       int k = 3;
       System.out.println("Top "+k+" happiest couples are:\n");
       sort_hp(k,true);
       System.out.println("Top "+k+" compatible couples are:\n");
       sort_c(k);
   }

    public void modified_allocate() {
       int i = 0;
        for (int j = 0; j < 100; j++) {
            girls gs = g[j];
            for(boys bs : b){
                   if(bs.getreq_attraction() <= gs.getatt() && bs.getbudget() >= gs.getbudget() && bs.status == 0 && gs.status == 0){
                       bs.commit();
                       gs.commit();
                       c[i] = new couple(bs, gs, 0, 0, 0, 0);
                       gbk[i] = new giftbasket();
                       i++;
                       break;
                   }
            }
            boys bs = b[j];
            for(girls gls : g){
                   if(bs.getreq_attraction() <= gls.getatt() && bs.getbudget() >= gls.getbudget() && bs.status == 0 && gls.status == 0){
                       bs.commit();
                       gs.commit();
                       c[i] = new couple(bs, gls, 0, 0, 0, 0);
                       gbk[i] = new giftbasket();
                       i++;
                       break;
                   }
            }
        }
    }
}
