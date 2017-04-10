/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.without_using_inheritance;

/**
 * Class of normal girls.
 * @author Harshit
 */
public class girls_normal {
    String Name;
    int Attractiveness,Maint_Budget,Intelligence,if_comm;
    public girls_normal(String Name, int Attractiveness, int Maint_Budget, int Intelligence) {
        this.Name = Name;
        this.Attractiveness = Attractiveness;
        this.Intelligence = Intelligence;
        this.Maint_Budget = Maint_Budget;
        this.if_comm = 0;
    }
    public String getname(){
        return Name;
    }
    public int getatt(){
        return Attractiveness;
    }
    public int getbudget(){
        return Maint_Budget;
    }
    public int getintelligence(){
        return Intelligence;
    }
    public void commit(){
        if_comm = 1;
    }
    public int status(){
        return if_comm;
    }
}
