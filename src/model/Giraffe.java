package model;

public class Giraffe
{
	private int eyes;
	private int legs;
	private double necklength;
	private String name;
	private int spots;

	public Giraffe()
	{
		eyes = 2;
		legs = 4;
		necklength = 7.0;
		name = "melman";
		spots = 200;
	}

	public Giraffe(int eyes, int legs, double necklength, String name, int spots)
	{
		this.eyes = eyes;
		this.legs = legs;
		this.necklength = necklength;
		this.name = name;
		this.spots = spots;
	}

	public int getEyes()
	{
		return eyes;
	}

	public int getLegs()
	{
		return legs;
	}

	public double getNecklength()
	{
		return necklength;
	}

	public String getName()
	{
		return name;
	}

	public int getSpots()
	{
		return spots;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public void setNecklength(double necklength)
	{
		this.necklength = necklength;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSpots(int spots)
	{
		this.spots = spots;
	}
}
