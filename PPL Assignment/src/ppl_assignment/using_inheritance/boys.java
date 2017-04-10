/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Class of Boys.
 * @author Harshit
 */
public class boys extends person{
    int budg, status, req_attr;

    public boys(int budg, int req_attr, String n, int att, int intg, int type) {
        super(n, att, intg, type);
        this.budg = budg;
        this.status = 0;
        this.req_attr = req_attr;
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
