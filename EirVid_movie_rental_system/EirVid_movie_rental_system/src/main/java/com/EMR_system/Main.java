/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EMR_system;



import java.util.*;

public class Main {
	
 public static	ArrayList<Movie_price> arr;
 public static login l;
public static void login() {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Email : ");
		String email=input.next();
		System.out.println("Enter Password: ");
		String pwd=input.next();
		
		l=new login();
		
		l.setEmail(email);
		l.setPwd(pwd);
		//System.out.println("Email :" +email);
		//System.out.println("Password :" +pwd);
	}
	
public static void movie() {
		Movie_price m1=new Movie_price(1,"The Avatar",100);
		Movie_price m2=new Movie_price(2,"The Avatar2",120);
		Movie_price m3=new Movie_price(3,"The Avengar",100);
		Movie_price m4=new Movie_price(4,"The Avengar-End Game",140);
		Movie_price m5=new Movie_price(5,"The Star wars",150);		
		Movie_price m6=new Movie_price(6,"Harry Potter",100);
		Movie_price m7=new Movie_price(7,"Mission Impossible",120);
		Movie_price m8=new Movie_price(8,"James bond ",100);
		Movie_price m9=new Movie_price(9,"Aliens",140);
		Movie_price m10=new Movie_price(10,"Wonderland",150);
		
		
		arr=new ArrayList<Movie_price>();
		
		arr.add(m1);
		arr.add(m2);
		arr.add(m3);
		arr.add(m4);
		arr.add(m5);
		arr.add(m6);
		arr.add(m7);
		arr.add(m8);
		arr.add(m9);
		arr.add(m10);
		
		
		for(Movie_price m : arr){
			System.out.println(m.num+"   "+m.movie +"   "+m.price);
		}
		
	}
	

	public static void main(String[] args) {
		
		login();
		//movie();
		Scanner input=new Scanner(System.in);
		
		
		int brr[]=new int[5];
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Please Select  Movie :" +(i+1));
			System.out.println(" ");
			movie();
			System.out.println(" ");
			
			System.out.println(" ");
			int n=input.nextInt();			 
			brr[i]=n;			
		}
			
		
		
		
		
		
		
		
		
		
		System.out.println(" ");
		
		System.out.println("You selected :");
		
		System.out.println(" ");
		
	
		System.out.println("Customer Email : "+l.getEmail());
		
		System.out.println(" ");
		
		System.out.println(" Rented 5 movies in last 5 minutes :");
		
		System.out.println(" ");
	
		for(Movie_price m : arr){
			
			if(m.num==1 || m.num==2 || m.num==3 || m.num==4 || m.num==5) {
				System.out.println("Selected Name :" +m.movie +"   "+"Selected Price :" +m.price);
				//System.out.println("Selected Price :" +m.price);
			}
			
			
           //System.out.println(m.num+"   "+m.movie +"   "+m.price);
		}		
		
		
	
	}

}

