package com.upskill.java_3;

import java.util.HashMap;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age = 25;
      int[] ageHulk = new int[]{25, 35, 38, 43, 28};
      
      System.outprintln("Student Age : " + ageHulk[3]);
      System.outprintln("Total Student : " + ageHulk.length);
      
      
      
      int [][] ageHulk2D = {{25, 30, 35, 38, 43, 28,},
    		  {23, 32, 38, 27}};
      
      System.out.println("Student Age 2D : " + ageHulk2D[0][3]);
      
      HashMap<String, Integer> Student = new HashMap<String, Integer>();
      
      Student.put("Redwan", 27);
      Student.put("Sana", 31);
      Student.put("Sanam", 38);
      Student.put("Muazzem", 24);
      
      System.out.println("Hashmap Student Age : "+ Student.get("Sana"));
      
      
      
      
      }
	}


