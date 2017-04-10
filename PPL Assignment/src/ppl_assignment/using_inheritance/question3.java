/*
* <h1>Question 3 is the Parent Class of most of the classes in this project</h1>
* Contains all the functions which are common among its derieved classes
* Concept of inheritence implemented from question 3 
*/
package ppl_assignment.using_inheritance;

import java.util.Random;
import java.util.Scanner;

/**
* Topmost class in the inheritance hierarchy.
* Solving q2 using inheritance.
* @author Harshit
*/
public class question3 {
    Random rand = new Random();
    boys b[] = new boys[100];
    girls g[] = new girls[100];
    utility u[] = new utility[1000];
    luxury l[] = new luxury[1000];
    essential e[] = new essential[1000];
    couple c[] = new couple[1000];
    giftbasket gbk[] = new giftbasket[1000];
    int girl2_h=0,girl3_h=0,girl1_h=0,n = 0,couple_count;
    Scanner sc = new Scanner(System.in);
    //Data generator
    public void generate(){
       int i = 0;
       for (int j = 0; j < 100; j++) {
           b[j] = new boys(rand.nextInt(500),rand.nextInt(1000),"B"+j,rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(3)+1);
       }
       for (int j = 0; j < 100; j++){
           g[j] = new girls(rand.nextInt(1000),"G"+j,rand.nextInt(1000),rand.nextInt(1000),rand.nextInt(3)+1);
       }
       for (int j = 0; j < 1000; j++) {
           u[j] = new utility(rand.nextInt(1000)+1, rand.nextInt(10)+1, rand.nextInt(10)+1, (j+1)*10);
       }
       for (int j = 0; j < 1000; j++) {
           l[j] = new luxury(rand.nextInt(10)+1, rand.nextInt(10)+1, rand.nextInt(10)+1, (j+1)*10);
       }
       for (int j = 0; j < 1000; j++) {
           e[j] = new essential(rand.nextInt(10)+1,(j+1)*10);
       }
       for (int j = 0; j < 1000; j++){
           gbk[j] = new giftbasket();
           for (int k = 0; k < 1000; k++) {
               gbk[j].g[k] = new gifts(-1,-1,-1);
           }
       }
    }
    //Girlfriend allocator
    public void allocate(){
       int i = 0;
       for(girls gs : g){
           if(gs.status == 0){
               for(boys bs : b){
                   if(bs.getreq_attraction() <= gs.getatt() && bs.getbudget() >= gs.getbudget() && bs.status == 0 && gs.status == 0){
                       bs.commit();
                       gs.commit();
                       c[i] = new couple(bs, gs, 0, 0, 0, 0);
                       gbk[i] = new giftbasket();
                       i++;
                   }
               }
           }
       }
    }

    //Gift allocator
    public void gifting(){
       int couple_id = 0,j = 0;
       for (int k = 0; k < 1000; k++){
           j = 0;
           if(c[k] != null)
           for (int i = 0; i < 1000; i++) {
               if(e[i].getprice() <= c[k].b.getbudget()){
                   gbk[couple_id].g[j++] = e[i];
                   c[k].b.budg -= e[i].price;
                   if(c[k].g.type == 1){
                       girl1_h += e[i].price;
                   }
                   if(c[k].g.type == 2){
                       girl2_h += e[i].price+e[i].value;
                   }
                   if(c[k].g.type == 3){
                       girl3_h += e[i].price;
                   }
               }
               if(u[i].getprice() <= c[k].b.getbudget()){
                   gbk[couple_id].g[j++] = u[i];
                   c[k].b.budg -= u[i].price;
                   if(c[k].g.type == 1){
                       girl1_h += u[i].price;
                   }
                   if(c[k].g.type == 2){
                       girl2_h += u[i].price+u[i].value;
                   }
                   if(c[k].g.type == 3){
                       girl3_h += u[i].price;
                   }
               }
               if(l[i].getprice() <= c[k].b.getbudget()){
                   gbk[couple_id].g[j++] = l[i];
                   c[k].b.budg -= l[i].price;
                   if(c[k].g.type == 1){
                       girl1_h += 2*l[i].price;
                   }
                   if(c[k].g.type == 2){
                       girl2_h += l[i].price+l[i].value;
                   }
                   if(c[k].g.type == 3){
                       girl3_h += l[i].price;
                   }
               }
           }

           couple_id++;
       }
    }
    //Happiness calculator
    public void calc_happiness(){
       for(couple cp : c){
           if(cp != null){
               if(cp.g.type == 1){
                   if(girl1_h-cp.g.m_budg >= 1)
                        cp.happiness_girl = Math.log((double)(girl1_h-cp.g.m_budg));
                   else
                        cp.happiness_girl = 0;
               }
               if(cp.g.type == 2){
                   cp.happiness_girl = girl2_h-cp.g.m_budg;
               }
               if(cp.g.type == 3){
                   cp.happiness_girl = Math.exp((double)(girl3_h-cp.g.m_budg));
                   if(cp.happiness_girl == Double.POSITIVE_INFINITY || cp.happiness_girl >= Math.exp((double)(16)))
                       cp.happiness_girl = girl3_h-cp.g.m_budg;
               }
               if(cp.b.type == 1){
                   cp.happiness_boy = cp.b.getbudget();
               }
               if(cp.b.type == 2){
                   cp.happiness_boy = cp.happiness_girl;
               }
               if(cp.b.type == 3){
                   cp.happiness_boy = cp.g.getintelligence();
               }
               cp.happiness = cp.happiness_boy + cp.happiness_girl;
               }
       }
    }

    //compatibility calculator
    public void calc_compatibilty(){
       for(couple cp : c){
           if(cp != null)
                cp.compatibility = Math.abs((cp.b.getbudget() - cp.g.getbudget())) + Math.abs(cp.b.getatt() - cp.g.getatt()) + Math.abs(cp.b.getintelligence() - cp.g.getintelligence());
       }
    }
    public void print(){
       System.out.println("boy    girl    happiness    compatibility\n");
       for(couple cp : c){
           if(cp != null){
               System.out.print(cp.b.n + "    " + cp.g.n + "    ");
               System.out.printf("%.2f    ", cp.happiness);
               System.out.println("    " + cp.compatibility);
               System.out.println("");
           }
       }
    }

    //execution starts here
    public void execute(){
       question3 q3 = new question3();
       q3.generate();
       q3.allocate();
       q3.gifting();
       q3.calc_happiness();
       q3.calc_compatibilty();
       //Assuming K = 3
       int k = 3;
       //Assume K = 3
       System.out.println("Top "+k+" happiest couples are:\n");
       q3.sort_hp(k,true);
       System.out.println("Top "+k+" compatible couples are:\n");
       q3.sort_c(k);
    }

    //Happiness sorter
    couple[] cc = new couple[1000];
    public void sort_hp(int k, boolean flag) {
        int i,j,l;
        n=0;
        for(couple cp : c){
            if(cp != null){
                cc[n] = cp;
                n++;
            }
        }
        couple_count = n;
        for(i = 0; i < n; i++){
            for (j = 0; j < n-i-1; j++) {
                if(cc[j].happiness < cc[j+1].happiness){
                    couple tmp = cc[j];
                    cc[j] = cc[j+1];
                    cc[j+1] = tmp;
                    giftbasket gb = gbk[j];
                    gbk[j] = gbk[j+1];
                    gbk[j+1] = gb;
                }
            }
        }
        if(flag == true){
            if(k>0) System.out.println("Boy    Girl    Happiness    Compatibility\n");
            i = 0;
            for(couple cp : cc){
               if(cp != null && i < k){
                   System.out.println();
                   System.out.print(cp.b.n + "    " + cp.g.n + "    ");
                   System.out.printf("%.2f    ", cp.happiness);
                   System.out.println("    " + cp.compatibility);
                   System.out.println("");
                   System.out.println("\nGifts for this couple include:\n");
                   for (int m = 0; m < 1000; m++) {
                       if(gbk[i].g[m] != null && gbk[i].g[m].type != -1){
                           if(gbk[i].g[m].type == 1){
                               System.out.println("Essential :");
                               System.out.println("\tPrice\t"+gbk[i].g[m].price);
                               System.out.println("\tValue\t"+gbk[i].g[m].value);
                           }
                           if(gbk[i].g[m].type == 2){
                               System.out.println("Luxury :");
                               System.out.println("\tPrice\t"+gbk[i].g[m].price);
                               System.out.println("\tValue\t"+gbk[i].g[m].value);
                               System.out.println("\tLuxury Rating\t"+((luxury)(gbk[i].g[m])).lux_rat);
                               System.out.println("\tDifficulty to obtain it\t"+((luxury)(gbk[i].g[m])).diff);
                           }
                           if(gbk[i].g[m].type == 3){
                               System.out.println("Utility :");
                               System.out.println("\tPrice\t"+gbk[i].g[m].price);
                               System.out.println("\tValue\t"+gbk[i].g[m].value);
                               System.out.println("\tUtility value\t"+((utility)(gbk[i].g[m])).util_val);
                               System.out.println("\tUtility class\t"+((utility)(gbk[i].g[m])).util_class);
                           }
                           System.out.println("");
                       }
                   }
                   i++;
               }
            }
        }
    }

    //compatibility sorter
    couple[] ch = new couple[1000];
    public void sort_c(int k){
        int i,j,l;
        n = 0;
        for(couple cp : c){
            if(cp != null){
                ch[n] = cp;
                n++;
            }
        }
        for(i = 0; i < n; i++){
            for (j = 0; j < n-i-1; j++) {
                if(ch[j].compatibility < ch[j+1].compatibility){
                    couple tmp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = tmp;
                    giftbasket gb = gbk[j];
                    gbk[j] = gbk[j+1];
                    gbk[j+1] = gb;
                }
            }
        }
        System.out.println("Boy    Girl    Happiness    Compatibility\n");
         i = 0;
         for(couple cp : ch){
               if(cp != null && i < k){
                   System.out.print(cp.b.n + "    " + cp.g.n + "    ");
                   System.out.printf("%.2f    ", cp.happiness);
                   System.out.println("    " + cp.compatibility);
                   System.out.println("");
                   System.out.println("\nGifts for this couple include:\n");
                   for (int m = 0; m < 1000; m++) {
                       if(gbk[i].g[m] != null && gbk[i].g[m].type != -1){
                           if(gbk[i].g[m].type == 1){
                               System.out.println("Essential :");
                               System.out.println("\tPrice\t"+gbk[i].g[m].price);
                               System.out.println("\tValue\t"+gbk[i].g[m].value);
                           }
                           if(gbk[i].g[m].type == 2){
                               System.out.println("Luxury :");
                               System.out.println("\tPrice\t"+gbk[i].g[m].price);
                               System.out.println("\tValue\t"+gbk[i].g[m].value);
                               System.out.println("\tLuxury Rating\t"+((luxury)(gbk[i].g[m])).lux_rat);
                               System.out.println("\tDifficulty to obtain it\t"+((luxury)(gbk[i].g[m])).diff);
                           }
                           if(gbk[i].g[m].type == 3){
                               System.out.println("Utility :");
                               System.out.println("\tPrice\t"+gbk[i].g[m].price);
                               System.out.println("\tValue\t"+gbk[i].g[m].value);
                               System.out.println("\tUtility value\t"+((utility)(gbk[i].g[m])).util_val);
                               System.out.println("\tUtility class\t"+((utility)(gbk[i].g[m])).util_class);
                           }
                           System.out.println("");
                       }
                   }
                   i++;
               }
        }
    }
}
