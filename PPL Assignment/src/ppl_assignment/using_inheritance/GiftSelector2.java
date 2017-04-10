/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * Class for gifting using 2nd method
 * @author Harshit
 */
public class GiftSelector2 extends question8{
    public GiftSelector2() {

    }
    @Override
    public void gifting() {
       //Gifting method 2
       System.out.println("\nGifting method 2\n");
       int couple_id = 0,j = 0;
       for (int k = 0; k < 1000; k++){
           j = 0;
           if(c[k] != null){
               //at least one gift of every type is given in the gift pack, even if it exceeds the budget
               gbk[couple_id].g[j++] = e[0];
               c[k].b.budg -= e[0].price;
               if(c[k].g.type == 1){
                   girl1_h += e[0].price;
               }
               if(c[k].g.type == 2){
                   girl2_h += e[0].price+e[0].value;
               }
               if(c[k].g.type == 3){
                   girl3_h += e[0].price;
               }
               
               gbk[couple_id].g[j++] = u[0];
               c[k].b.budg -= u[0].price;
               if(c[k].g.type == 1){
                   girl1_h += u[0].price;
               }
               if(c[k].g.type == 2){
                   girl2_h += u[0].price+u[0].value;
               }
               if(c[k].g.type == 3){
                   girl3_h += u[0].price;
               }
               
               gbk[couple_id].g[j++] = l[0];
               c[k].b.budg -= l[0].price;
               if(c[k].g.type == 1){
                   girl1_h += 2*l[0].price;
               }
               if(c[k].g.type == 2){
                   girl2_h += l[0].price+l[0].value;
               }
               if(c[k].g.type == 3){
                   girl3_h += l[0].price;
               }
               
               for (int i = 1; i < 1000; i++) {
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
           }
           couple_id++;
       }
    }
}
