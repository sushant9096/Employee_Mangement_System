import java.util.*;

class evendemo extends Thread {
	public void run (){
		
		int no;
		try{
		for(int i = 1; i <= 100; i++){
			
			no = i % 2;
			if(no == 0){
				System.out.print("\nEven Number between "+i+" to 100 is " +i);
			}
			Thread.sleep(50);
		}}catch(Exception e){
			System.out.println(e);
		}
	}
}

class odddemo extends Thread {
	public void run (){
		
		int [] nopr2 = new int[101];
		try{
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){
				System.out.print("\nodd Number between "+i+" to 100 is " +i);
			}
			Thread.sleep(50);
		}}catch(Exception e){
			System.out.println(e);
		}
	}
}

class Threadevenodd{
	
	public static void main (String[] args){
	odddemo o1 = new odddemo();
	evendemo e1 = new evendemo();
	o1.start();
	e1.start();
	}
}