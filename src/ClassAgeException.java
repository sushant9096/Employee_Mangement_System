import java.lang.*;

class ageexception extends Exception {
	String msg = " ";
	ageexception(String msg){
		super(msg);
	}
}

class ClassAgeException {
	public static void main(String[] args){
		int age = 19;
		
		try {
			if(age > 18){
				System.out.println("Your are eligible for voting");
			}
			else {
				throw new userexception("Age is not valid for voting");
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}