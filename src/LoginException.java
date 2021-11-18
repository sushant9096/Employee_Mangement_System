import java.lang.*;
import java.util.*;

class exception extends Exception {
	String msg = "";
	exception(String msg){
		super(msg);
	}
}

class LoginException {
	public static void main(String[] args){
		String username = "sushant";
		String password = "sushant";
		Scanner userin = new Scanner(System.in);
		Scanner passwordin = new Scanner(System.in);
		System.out.println("Enter Username:"); 
		String users = userin.nextLine();
		System.out.println("Enter Password:");
		String passwords = passwordin.nextLine();
		try {
			if(username.equals(users) && password.equals(passwords)){
				System.out.println("Login Succesfull");
			}
			else if(users.length() == 7 && passwords.length() == 7){
				if(username.equals(users) && password.equals(passwords)){
					System.out.println("Login Succesfull");
				}
				else
					throw new exception("Wrong Credential");
			}
			else
				System.out.println("Invalid Length");
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}