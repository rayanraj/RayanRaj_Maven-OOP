package com.epam.newyear_gift;

public class Chocolates implements Gifts {
	
	int cost,weight,cat;
	String name;
	
	public Chocolates(int cost, int weight,String name,int cat) {
		super();
		this.cost = cost;
		this.weight = weight;
		this.name=name;
		this.cat=cat;
	}
	
	
	public int getCost()
	{
		return cost;
	}
	
	
	public int getWeight()
	{
		return weight;
	}


	public String getName() {
		return name;
	}
	
	public int getCat()
	{
		return cat;
	}

	@Override
	public String toString() {
		return "Name=" +  name + " [cost=" + cost + ", weight=" + weight  + "]";
	}

	
}
