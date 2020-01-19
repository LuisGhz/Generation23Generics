package com.exersice23generics.model;

public class Substraction <K, V> {
	K key;
	V value;
	
	public Substraction()
	{
		
	}
	
	public Substraction(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public K getKey () 
	{
		return key;
	}
	
	public void setKey (K key)
	{
		this.key = key;
	}
	
	public V getValue()
	{
		return value;
	}
	
	public void setValue(V value)
	{
		this.value = value;
	}
	
	
	public String ToString()
	{
		return "Key: " + key + " Value: " + value;
	}
}
