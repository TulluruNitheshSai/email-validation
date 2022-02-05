package source;
import java.util.regex.*;    
import java.util.*;

public class email {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();  
        emails.add("yuvaraj@gmail.co.in");  
        emails.add("sachin@gmail.com");  
        emails.add("vaali.sugreeva@gmail.com");  
        emails.add("dhoni#@gmail.co.in");  
        emails.add("hero123@gmail.com");  
        emails.add("himayat09@gmail.com");   
        emails.add("@gmail.com");  
        emails.add("gmail#gmail.com");    
        String regex = "^(.+)@(.+)$";    
        Pattern pattern = Pattern.compile(regex);    
        for(String email : emails){     
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  

	}

}
