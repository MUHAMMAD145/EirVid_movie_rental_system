package com.EMR_system;

import java.util.*;
public class movie {

	public static void main(String[] args) {
		
		
		Movie_price m1=new Movie_price(1,"The Avatar",100);
		Movie_price m2=new Movie_price(2,"The Avatar2",120);
		Movie_price m3=new Movie_price(3,"The Avengar",100);
		Movie_price m4=new Movie_price(4,"The Avengar-End Game",140);
		Movie_price m5=new Movie_price(5,"The Star wars",150);
		
		
		ArrayList<Movie_price> arr=new ArrayList<Movie_price>();
		arr.add(m1);
		arr.add(m2);
		arr.add(m3);
		arr.add(m4);
		arr.add(m5);
		
		for(Movie_price m : arr){
			System.out.println(m.num+"   "+m.movie +"   "+m.price);
		}
		

	}

}
