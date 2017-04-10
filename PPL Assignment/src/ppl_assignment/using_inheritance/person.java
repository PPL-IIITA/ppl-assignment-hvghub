/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * denotes common attributes of a person boy or girl.
 * @author Harshit
 */
public class person {
    String n;
    int att, intg, type;

    public person(String n, int att, int intg, int type) {
        this.n = n;
        this.att = att;
        this.intg = intg;
        this.type = type;
    }
    public String getname(){
        return n;
    }
    public int getatt(){
        return att;
    }
    public int getintelligence(){
        return intg;
    }
}
