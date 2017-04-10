/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Class that represents couples and their attributes are held.
 * @author Harshit
 */
public class couple {
    boys b;
    girls g;
    double happiness_boy,happiness_girl;
    double happiness;
    double compatibility;

    public couple(boys b, girls g, double happiness_boy, double happiness_girl, double happiness, double compatibility) {
        this.b = b;
        this.g = g;
        this.happiness_boy = happiness_boy;
        this.happiness_girl = happiness_girl;
        this.happiness = happiness;
        this.compatibility = compatibility;
    }
    
}
