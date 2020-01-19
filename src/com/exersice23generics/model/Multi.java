package com.exersice23generics.model;

public class Multi  
{
	public static <T> String ShowDataType(T Object)
	{
		return "The data type is: " + Object.getClass() + "\nParameter Name: " + Object.getClass().getName() + "\nValue of the element: " + Object;
	}
}
