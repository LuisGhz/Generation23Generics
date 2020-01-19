package com.exersice23generics.model;

public class Sum <T>
{
	T myObject;
	
	public Sum (T myObject) 
	{
		this.myObject = myObject;
	}
	
	public T getMyObject() 
	{
		return myObject;
	}
	
	public static <N1 extends Number, N2 extends Number> N1 sumNumbers(N1 Obj1, N2 Obj2)
	{
		Double result = 0.0;
		result = Obj1.doubleValue() + Obj2.doubleValue();
		return (N1) result;
	}
}
