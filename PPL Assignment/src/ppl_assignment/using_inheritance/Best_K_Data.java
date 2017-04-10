/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * A data structure that returns the best k valued items instead of the best valued item.
 * @author Harshit
 */
public class Best_K_Data extends question3{
    public void makeArrBoy(int k, int a[]){
        for (int i = 0; i < k; i++) {
            a[i] = b[i].budg;
        }
    }

    public  void makeArrGirl(int k, int a[]) {
        for (int i = 0; i < k; i++) {
            a[i] = g[i].m_budg;
        }
    }
     
    public  void makeArrGifts1(int[] a, int k) {
        for (int i = 0; i < k; i++) {
            a[i] = e[i].value;
        }
    }
    public void makeArrGifts2(int[] a, int k) {
        for (int i = 0; i < k; i++) {
            a[i] = l[i].value;
        }
    }
    public  void makeArrGifts3(int[] a, int k) {
        for (int i = 0; i < k; i++) {
            a[i] = u[i].value;
        }
    }

    public <Tp> void findBestK(Tp[] arr,int criterion[],int k) {
        //Template which finds best K valued items
        Tp tmp;
        for(int i = 0; i < k-1; i++) {
            for(int j = i+1; j < k ; j++) {
                if(criterion[i] < criterion[j]) {
                    int t = criterion[i];
                    criterion[i] = criterion[j];
                    criterion[j] = t;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    
    public void findCouples(int k) {
        for (int i = 0; i < 10; i++) {
            b[i].commit();
            g[i].commit();
            c[i] = new couple(b[i], g[i], 0, 0, 0, 0);
            gbk[i] = new giftbasket();
        }
    }
    public void gifting_by_value(){
        //Gifting by value criterion
        int couple_id = 0,j = 0;
        for (int k = 0; k < 1000; k++){
            j = 0;
            if(c[k] != null)
                for (int i = 0; i < 1000; i++) {
                   if(e[i].getvalue() <= c[k].b.getbudget()){
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
                   if(u[i].getvalue() <= c[k].b.getbudget()){
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
                   if(l[i].getvalue() <= c[k].b.getbudget()){
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
