package com.test2;
import com.test1.*;

public class sample2 extends sample1{
	public void getName1(){
		sample1 sample1 = new sample1();
		System.out.println("getName1");
		System.out.println(sample1);
		System.out.println();
	}

	public static void main(String[] args) {
		sample2 sample2 = new sample2();
		sample2.getName();
		sample2.getName1();
		sample2.getCountry();
		

	}

}
