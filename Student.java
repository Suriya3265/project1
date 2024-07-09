package phase1.java;

import java.util.Scanner;

public class Student {
	String Student_name;
	int Regno;
	String department;
	
	Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter reg number");
    	int id=sc.nextInt();

 		System.out.println("Enter student name");
 		String name=sc.next();

    	System.out.println("Enter department");
		String dpt=sc.next();
		
		
		Student_name=name;
		Regno=id;
		department=dpt;
		
		
	}
	 void display() {
		
		System.out.print("Stuent name : "+Student_name+"  Register no: "+Regno+"   dept: "+department);
		System.out.println();
	}
	

}
