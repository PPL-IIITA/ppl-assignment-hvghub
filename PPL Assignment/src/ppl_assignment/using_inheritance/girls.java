/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Class of girls.
 * @author Harshit
 */
public class girls extends person{
    int m_budg, status;

    public girls(int m_budg, String n, int att, int intg, int type) {
        super(n, att, intg, type);
        this.m_budg = m_budg;
        this.status = 0;
    }

    public int getbudget(){
        return m_budg;
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
