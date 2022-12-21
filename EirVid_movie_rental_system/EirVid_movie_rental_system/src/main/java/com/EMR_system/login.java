package com.EMR_system;

import java.util.*;

public class login {
	
	String email;
	String pwd;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Email : ");
		String email=input.next();
		System.out.println("Enter Password: ");
		String pwd=input.next();
		
		System.out.println("Email :" +email);
		System.out.println("Password :" +pwd);
	
		
		

	}

}
