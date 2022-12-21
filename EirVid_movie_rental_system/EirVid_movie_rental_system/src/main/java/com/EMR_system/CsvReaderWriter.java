/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EMR_system;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderWriter {
 
 public static void main(String[] args) {
  String filePath = "src\\com.EMR_system\\user.csv";
  
  System.out.println("starting write user.csv file: " + filePath);
  writeCsv(filePath);
  
  System.out.println("starting read user.csv file");
  readCsv(filePath);
 }
 
 public static void writeCsv(String filePath) {
  List<Movie_price> users = new ArrayList<Movie_price>();
  
  
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
	
	
	
	
	users.add(m1);
	users.add(m2);
	users.add(m3);
	users.add(m4);
	users.add(m5);
	users.add(m6);
	users.add(m7);
	users.add(m8);
	users.add(m9);
	users.add(m10);
	
	
	
	
	
	
	
	
 
  FileWriter fileWriter = null;
  try {
   fileWriter = new FileWriter(filePath);
   
   fileWriter.append("Number, Movie Name, Price\n");
   for(Movie_price u: users) {
    fileWriter.append(String.valueOf(u.getNum()));
    fileWriter.append(",");
    fileWriter.append(u.getMovie());
    fileWriter.append(",");
    fileWriter.append(String.valueOf(u.getPrice()));
    fileWriter.append("\n");
   }
  } catch (Exception ex) {
   ex.printStackTrace();
  } finally {
   try {
    fileWriter.flush();
    fileWriter.close();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
 }
 
 public static void readCsv(String filePath) {
  BufferedReader reader = null;
  
  try {
   List<Movie_price> users = new ArrayList<Movie_price>();
   String line = "";
   reader = new BufferedReader(new FileReader(filePath));
   reader.readLine();
   
   while((line = reader.readLine()) != null) {
    String[] fields = line.split(",");
    
    if(fields.length > 0) {
     Movie_price user = new Movie_price();
     user.setNum(Integer.parseInt(fields[0]));
     user.setMovie(fields[1]);
     user.setPrice(Integer.parseInt(fields[2]));
     users.add(user);
    }
   }
   
   for(Movie_price u: users) {
    System.out.printf("[userId=%d, firstName=%s, lastName=%s]\n", u.getNum(), u.getMovie(), u.getPrice());
   }
   
  } catch (Exception ex) {
   ex.printStackTrace();
  } finally {
   try {
    reader.close();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
  
 }
}
