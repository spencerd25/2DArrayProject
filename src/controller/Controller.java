package controller;

import model.Giraffe;

public class Controller
{
	private Giraffe[][] myGiraffeArray;
	private int[][] myIntArray;
	private String[][] myStringArray;
	
	public Controller()
	{
		myGiraffeArray = new Giraffe[6][4];
		myIntArray = new int[5][3];
		myStringArray = new String[4][4];
	}
	
	public void start()
	{
		
	}
	
	public String[][] getMystring()
	{
		return myStringArray;
	}

	public void setMystring(String[][] mystring)
	{
		this.myStringArray = myStringArray;
	}

	public int[][] getMyint()
	{
		return myIntArray;
	}

	public void setMyint(int[][] myint)
	{
		this.myIntArray = myIntArray;
	}

	public Giraffe[][] getMygiraffe()
	{
		return myGiraffeArray;
	}

	public void setMygiraffe(Giraffe[][] mygiraffe)
	{
		this.myGiraffeArray = myGiraffeArray;
	}
}
