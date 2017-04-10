/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl_assignment.using_inheritance;

/**
 * implements the data structure returning a random item out of best n items.
 * @author Harshit
 */
public class random_K_data extends question3{
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
        for (int i = 0; i < 10;) {
            boys by = getRandom(b,k);
            girls gl = getRandom(g,k);
            if(by.status == 0 && gl.status == 0){
                by.commit();
                gl.commit();
                c[i] = new couple(by, gl, 0, 0, 0, 0);
                gbk[i] = new giftbasket();
                i++;
            }
        }
    }

    private <Tp> Tp getRandom(Tp[] tp, int k) {
        int ch = rand.nextInt(k);
        return tp[ch];
    }
    
    public void gifting_by_value(int n){
        //Gifting by value criterion
        int couple_id = 0,j = 0, ch;
        for (int k = 0; k < 1000; k++){
            j = 0;
            if(c[k] != null)
                for (int i = 0; i < 1000;) {
                   essential ess = getRandom(e, n);
                   if(ess.getvalue() <= c[k].b.getbudget()){
                       gbk[couple_id].g[j++] = ess;
                       c[k].b.budg -= ess.price;
                       if(c[k].g.type == 1){
                           girl1_h += ess.price;
                       }
                       if(c[k].g.type == 2){
                           girl2_h += ess.price+e[i].value;
                       }
                       if(c[k].g.type == 3){
                           girl3_h += ess.price;
                       }
                   }
                   utility ut = getRandom(u, n);
                   if(ut.getvalue() <= c[k].b.getbudget()){
                       gbk[couple_id].g[j++] = ut;
                       c[k].b.budg -= ut.price;
                       if(c[k].g.type == 1){
                           girl1_h += ut.price;
                       }
                       if(c[k].g.type == 2){
                           girl2_h += ut.price+u[i].value;
                       }
                       if(c[k].g.type == 3){
                           girl3_h += ut.price;
                       }
                   }
                   luxury lx = getRandom(l, n);
                   if(lx.getvalue() <= c[k].b.getbudget()){
                       gbk[couple_id].g[j++] = lx;
                       c[k].b.budg -= lx.price;
                       if(c[k].g.type == 1){
                           girl1_h += 2*lx.price;
                       }
                       if(c[k].g.type == 2){
                           girl2_h += lx.price+lx.value;
                       }
                       if(c[k].g.type == 3){
                           girl3_h += lx.price;
                       }
                   }
                   i++;
               }
               couple_id++;
          }
     }
}
