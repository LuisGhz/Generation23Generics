package com.exersice23generics.app;

import com.exersice23generics.model.Sum;
import com.exersice23generics.model.Substraction;
import com.exersice23generics.model.Multi;

public class GenericsApp {
	public static void main(String[] args) 
	{
		Integer myNum = 15;
		String myMsg = "Test";
		
		Sum<Integer> myInt = new Sum<Integer>(myNum);
		Sum<String> myString = new Sum<String>(myMsg);
		Substraction<Integer, Integer> mySub = new Substraction<Integer, Integer>(15,10);
		
		System.out.println("Object from myInt " + myInt.getMyObject());
		System.out.println("Object from myString " + myString.getMyObject());
		
		mySub.setKey(100);
		mySub.setValue(200);
		System.out.println("Object Sub1: "+mySub.ToString());
		
		System.out.println(Multi.ShowDataType(10));
		System.out.println(Multi.ShowDataType("Str"));
		System.out.println(Multi.ShowDataType(10.5));
		System.out.println("The result is: " + myInt.sumNumbers(10.5, 15));
	}
}
