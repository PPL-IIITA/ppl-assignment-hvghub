/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Class for gifting using 1st method
 * @author Harshit
 */
public class GiftSelector1 extends question8{

    public GiftSelector1() {

    }
    
   @Override
   public void gifting(){
       //Gifting method 1
       System.out.println("\nGifting method 1\n");
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

}
