package com.EMR_system;

public class Movie_price {
	int num;
	
	String movie;
	int price;
	
	Movie_price(){
}
	
	Movie_price(int num ,String movie,int price){
		this.num=num;	
		this.movie=movie;
		this.price=price;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
