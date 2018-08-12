package multithread;
import java.io.*;  

public class oddeven {
class Table {
	
	 synchronized String printTable(int n){//synchronized method  
		  
   	 String s="";
	     try{
					 for(int i=n;i<=10;i=i+2){
						 s=s+"\t"+i;
					 }  

			  
	      Thread.sleep(400);  
    }catch(Exception e){System.out.println(e);} 
	     System.out.println("Sucess...");
	     return s;
			  
	 }  
	 }  
	  
	class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
	this.t=t;  
	}  
	public void run() {  
		PrintWriter fout1;
		try {
			fout1 = new PrintWriter("F:\\Even.txt");
			t.printTable(1);
			fout1.write(t.printTable(0));
			fout1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}  
	  
	}  
	class MyThread2 extends Thread{  
Table t;  
	MyThread2(Table t){  
	this.t=t;  
	}  
	public void run(){  

		PrintWriter fout2;
		try {
			fout2 = new PrintWriter("E:\\Odd.txt");
			t.printTable(1);
			fout2.write(t.printTable(1));
			fout2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}  
	}  
	  
	public class oddoreven{ 
{  
	Table obj = new Table();//only one object  
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.start();  
	t2.start();  
}  


}

}
