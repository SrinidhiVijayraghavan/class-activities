package multithread;
import java.io.*; 
public class wrt { 
public static void main(String args[])throws Exception{    
     PrintWriter fout=new PrintWriter("F:\\testout.txt");        
     String s="";
     int i;
     for(i=0;i<15;i=i+2){
    	 s=s+"\t"+i;
     }
        
     fout.write(s);   
     fout.close();    
     System.out.println("success");    
}    
 
}

