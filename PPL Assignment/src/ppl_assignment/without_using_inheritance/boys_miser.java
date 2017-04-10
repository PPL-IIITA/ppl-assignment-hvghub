/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class of miser boys.
 * @author Harshit
 */
public class boys_miser {
    String Name;
    int Atr,Budget,Intelligence,Req_Attract,if_comm;
    public boys_miser(String Name, int Atr, int Budget, int Intelligence, int Req_Attract) {
        this.Name = Name;
        this.Atr = Atr;
        this.Intelligence = Intelligence;
        this.Req_Attract = Req_Attract;
        this.Budget = Budget;
        this.if_comm = 0;
    }
    public String getname(){
        return Name;
    }
    public int getatt(){
        return Atr;
    }
    public int getbudget(){
        return Budget;
    }
    public int getintelligence(){
        return Intelligence;
    }
    public int getreq_attraction(){
        return Req_Attract;
    }
    public void commit(){
        if_comm = 1;
    }
    public int status(){
        return if_comm;
    }
    
}
