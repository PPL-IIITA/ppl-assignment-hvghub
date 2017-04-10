/* <h1>question 8</h1>
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

import java.security.Policy.Parameters;
import java.util.Random;
/**
 * Make a new gift allocation system.
 * @author Harshit
 */

/*Make a new gift allocation system, such that at least one gift of every type is given in the gift pack, 
  even if it exceeds the budget. The logic should be implemented in the necessary library file and not in 
  the main application program. Both types of gifting strategies should be implemented in the library, 
  with a mechanism to specify the choice at the time of initialization. The default gifting type should be 
  as stated previously, when no option is specified.*/


public class question8 extends question3{
    question3 gs;
    Random rand = new Random();
    //we made two GiftSelector classes inherited from a base class and upcasting to make the code generic
    //default is GiftSelector1
    public void execute(){
        int ch = rand.nextInt(2)+1;
        //upcasting to base class
        if(ch == 1){
            gs = (question3)new GiftSelector1();
        }
        else{
            gs = (question3)new GiftSelector2();
        }
        gs.generate();
        gs.allocate();        
        gs.gifting();
        gs.calc_happiness();
        gs.calc_compatibilty();
        //Parameters of sort_hp include K=2 (no of top most happiest couples to be printed) and a boolean flag to enable printing.
        gs.sort_hp(2,true);
    }
}
