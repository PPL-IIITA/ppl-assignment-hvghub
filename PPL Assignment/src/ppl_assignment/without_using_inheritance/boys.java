/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class for all kinds of boys.
 * @author Harshit
 */
public class boys{
    int budg, status, req_attr, att, intg, type;
    String n;

    public boys(int budg, int status, int req_attr, int att, int intg, int type, String n) {
        this.budg = budg;
        this.status = status;
        this.req_attr = req_attr;
        this.att = att;
        this.intg = intg;
        this.type = type;
        this.n = n;
    }

    
    public int getbudget(){
        return budg;
    }
    public int getreq_attraction(){
        return req_attr;
    }
    public void commit(){
        status = 1;
    }
    public void breakup(){
        status = 0;
    }
    public int status(){
        return status;
    }
}
