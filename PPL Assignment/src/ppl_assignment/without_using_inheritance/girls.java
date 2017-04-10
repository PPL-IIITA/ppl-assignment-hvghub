/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class of girls.
 * @author Harshit
 */
public class girls{
    int m_budg, status, att, intg, type;
    String n;

    public girls(int m_budg, int status, int att, int intg, int type, String n) {
        this.m_budg = m_budg;
        this.status = status;
        this.att = att;
        this.intg = intg;
        this.type = type;
        this.n = n;
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
