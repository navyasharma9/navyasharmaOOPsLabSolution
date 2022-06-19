package com.gl.lab;
import java.util.Scanner;
import com.gl.lab.Employee;
import com.gl.lab.Credential;
public class Drive {
	public static void main(String[] args) {
		String firstName,lastName,department=null;
		String company="greatelearing.com";
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Your First Name");
		firstName=sc.next();
		System.out.println("Enter Your Last Name");
		lastName=sc.next();
		System.out.println("Plese Select Your Department:\n 1.Technical\n 2.Admin\n 3.Human Resourse\n 4.Legal\n");
		int dept=sc.nextInt();
		switch(dept) {
		case 1:
			department="Technical";
			break;
		case 2:
			department="Admin";
			break;
		case 3:
			department="Hr";
			break;
		case 4:
			department="legal";
			break;
		}
		String email=firstName+lastName+department+"@"+company;
		Employee emp=new Employee(firstName,lastName,department);
		System.out.println(email);
		Credential cred=new Credential();
		System.out.println("Password--->"+String.valueOf(cred.generatePassword(8)));
		
	}
	
}
