/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Harshit
 */
public class allocate {
    public void create_objs() throws FileNotFoundException,IOException{
        String n="",s1="",s2="",s3,s4,s5;
        int att=0,k=0,intel=0,budg=0,type=0;
        Vector Ch = new Vector(100);
        Vector Ds = new Vector(100);
        Vector Nr = new Vector(100);
        Scanner scanner = new Scanner(new File("girls.csv"));
        scanner.useDelimiter("\n");
        while(scanner.hasNext()){
            s1 = scanner.next();
            if(s1.charAt(0) =='T')  continue;
            //System.out.println(s1);
            k=0;
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    type=Integer.parseInt(s2);
                    //System.out.print(type);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    n=s2;
                    //System.out.print(n);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    att=Integer.parseInt(s2);
                    //System.out.print(att);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    budg=Integer.parseInt(s2);
                    //System.out.print(budg);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(k==s1.length()-1){
                    intel=Integer.parseInt(s2);
                    //System.out.println(intel);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            if(type == 1) {
                girls_choosy m = new girls_choosy(n,att,budg,intel);
                Ch.add(m);
            }
            else if (type == 3) {
                girls_desperate m = new girls_desperate(n,att,budg,intel);
                Ds.addElement(m);
            }
            else {
                girls_normal m = new girls_normal(n,att,budg,intel);
                Nr.addElement(m);
            }
        }
        scanner.close();
        
        n="";s1="";s2="";
        att=0;k=0;intel=0;int budb=0,m_req=0;type=0;
        Vector Mi = new Vector(100);
        Vector Gk = new Vector(100);
        Vector Gn = new Vector(100);
        Scanner scanner1 = new Scanner(new File("boys.csv"));
        scanner1.useDelimiter("\n");
        while(scanner1.hasNext()){
            s1 = scanner1.next();
            if(s1.charAt(0) =='T')  continue;
            //System.out.println(s1);
            k=0;
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    type=Integer.parseInt(s2);
                    //System.out.print(type);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    n=s2;
                    //System.out.print(n);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    att=Integer.parseInt(s2);
                    //System.out.print(att);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    budb=Integer.parseInt(s2);
                    //System.out.print(budb);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(s1.charAt(k)==','){
                    intel=Integer.parseInt(s2);
                    //System.out.print(intel);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            while(k<s1.length()){
                if(k==s1.length()-1){
                    m_req=Integer.parseInt(s2);
                    //System.out.println(m_req);
                    s2="";
                    k++;
                    break;
                }
                s2+=s1.charAt(k);
                k++;
            }
            if(type == 1) {
                boys_miser m = new boys_miser(n, att, budb, intel, m_req);
                Mi.addElement(m);
            }
            else if (type == 2) {
                boys_generous m = new boys_generous(n, att, budb, intel, m_req);
                Gn.addElement(m);
            }
            else {
                boys_geeks m = new boys_geeks(n, att, budb, intel, m_req);
                Gk.addElement(m);
            }
        }
        scanner1.close();
        
        File file = new File("log.csv");
        
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        n="";s1="";s2="";
        att=0;k=0;intel=0;budg=0;budb=0;m_req=0;type=0;
        FileWriter fw = new FileWriter(file);

        try{
                fw.write("Type_of_Event,BoyFriend,GirlFriend,Date_Time_Stamp"+System.lineSeparator());
        }
        catch(FileNotFoundException e){
                e.printStackTrace();
        }catch(IOException e){
                e.printStackTrace();
        }
        Iterator g = Ch.iterator();
      
        while(g.hasNext()) {
           girls_choosy gch = (girls_choosy)g.next();
           Iterator b = Mi.iterator();
           while(b.hasNext()&&gch.status()==0) {
               boys_miser bmi = (boys_miser)b.next();
               if(bmi.status()==0&&bmi.getbudget()>=gch.getbudget()){
                   bmi.commit();
                   gch.commit();
                   try{
                            fw.write("Commited"+","+bmi.getname()+","+gch.getname()+","+df.format(calobj.getTime())+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
           Iterator bb = Gn.iterator();
           while(bb.hasNext()&&gch.status()==0) {
               boys_generous gnr = (boys_generous)bb.next();
               if(gnr.status()==0&&gnr.getbudget()>=gch.getbudget()){
                   gnr.commit();
                   gch.commit();
                   try{
                            fw.write("Commited"+","+(gnr.getname()+","+gch.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
           Iterator bbb = Gk.iterator();
           while(bbb.hasNext()&&gch.status()==0) {
               boys_geeks gks = (boys_geeks)bbb.next();
               if(gks.status()==0&&gks.getbudget()>=gch.getbudget()){
                   gks.commit();
                   gch.commit();
                   try{
                            fw.write("Commited"+","+(gks.getname()+","+gch.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
        }
        Iterator gg = Nr.iterator();
      
        while(gg.hasNext()) {
           girls_normal gnr = (girls_normal)gg.next();
           Iterator b = Mi.iterator();
           while(b.hasNext()&&gnr.status()==0) {
               boys_miser bmi = (boys_miser)b.next();
               if(bmi.status()==0&&bmi.getbudget()>=gnr.getbudget()){
                   bmi.commit();
                   gnr.commit();
                   try{
                            fw.write("Commited"+","+(bmi.getname()+","+gnr.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
           Iterator bb = Gn.iterator();
           while(bb.hasNext()&&gnr.status()==0) {
               boys_generous gn = (boys_generous)bb.next();
               if(gn.status()==0&&gn.getbudget()>=gnr.getbudget()){
                   gn.commit();
                   gnr.commit();
                   try{
                            fw.write("Commited"+","+(gn.getname()+","+gnr.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
           Iterator bbb = Gk.iterator();
           while(bbb.hasNext()&&gnr.status()==0) {
               boys_geeks gks = (boys_geeks)bbb.next();
               if(gks.status()==0&&gks.getbudget()>=gnr.getbudget()){
                   gks.commit();
                   gnr.commit();
                   try{
                            fw.write("Commited"+","+(gks.getname()+","+gnr.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
        }
        Iterator ggg = Ds.iterator();
      
        while(ggg.hasNext()) {
           girls_desperate gds = (girls_desperate)ggg.next();
           Iterator b = Mi.iterator();
           while(b.hasNext()&&gds.status()==0) {
               boys_miser bmi = (boys_miser)b.next();
               if(bmi.status()==0&&bmi.getbudget()>=gds.getbudget()){
                   bmi.commit();
                   gds.commit();
                   try{
                            fw.write("Commited"+","+(bmi.getname()+","+gds.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
           Iterator bb = Gn.iterator();
           while(bb.hasNext()&&gds.status()==0) {
               boys_generous gnr = (boys_generous)bb.next();
               if(gnr.status()==0&&gnr.getbudget()>=gds.getbudget()){
                   gnr.commit();
                   gds.commit();
                   try{
                            fw.write("Commited"+","+(gnr.getname()+","+gds.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
           Iterator bbb = Gk.iterator();
           while(bbb.hasNext()&&gds.status()==0) {
               boys_geeks gks = (boys_geeks)bbb.next();
               if(gks.status()==0&&gks.getbudget()>=gds.getbudget()){
                   gks.commit();
                   gds.commit();
                   try{
                            fw.write("Commited"+","+(gks.getname()+","+gds.getname()+","+df.format(calobj.getTime()))+System.lineSeparator());
                    }
                    catch(FileNotFoundException e){
                            e.printStackTrace();
                    }catch(IOException e){
                            e.printStackTrace();
                    }
                   break;
               }
           }
        }
        fw.close();
    }   
}