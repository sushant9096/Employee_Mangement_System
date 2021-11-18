import java.lang.*;

class userexception extends Exception {
	String msg = " ";
	userexception(String msg){
		super(msg);
	}
}

class ClassException {
	public static void main(String[] args){
		String s1 = "Hello";
		String s2 = "Hello";
		
		try {
			if(s1.equals(s2)){
				System.out.println("strings are equal");
			}
			else {
				throw new userexception("String missmatch");
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}