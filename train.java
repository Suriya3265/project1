package phase1.java;

import java.sql.SQLException;
import java.util.*;

public class train {


	public static void main(String[] args) throws SQLException {
		
		
	
		
		Scanner sc=new Scanner(System.in);
		int a=1;
		
		while(a==1) {
			System.out.println("enter 1 to continue");
		    a=sc.nextInt();
		    if(a==1) {
		         
		
		
		  
		       Student Student=new Student();
		       studentJDBC sd=new studentJDBC();
		       sd.getConnection(Student);
		       
		       
		    
		
		}
		}}}
	

