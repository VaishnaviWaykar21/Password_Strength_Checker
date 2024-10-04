//Task: Password Strength Checker

package Level_2;

import java.util.Scanner;

public class Task_2 {
	
    private static String check(String password) {
        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
    
	    for(int i=0; i<length; i++) {
	        char ch = password.charAt(i);
	
	        if(Character.isUpperCase(ch)) 
	        {
	            hasUpper = true;
	        } 
	        else if(Character.isLowerCase(ch)) 
	        {
	            hasLower = true;
	        } 
	        else if(Character.isDigit(ch)) 
	        {
	            hasDigit = true;
	        } 
	        else if(!Character.isLetterOrDigit(ch)) {
	            hasSpecialChar = true;
	        }
	    }
    
	    if(length >= 8 && hasUpper && hasLower && hasDigit && hasSpecialChar) 
	    {
	        return "Strong";
	    } 
	    else if(length >= 6 && ((hasUpper && hasLower) || (hasDigit && hasSpecialChar))) 
	    {
	        return "Medium";
	    } 
	    else{
	        return "Weak";
	    }
    }
    
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        String strength = check(password);
        System.out.println("Password Strength: " + strength);
        
        sc.close();
	}
}


