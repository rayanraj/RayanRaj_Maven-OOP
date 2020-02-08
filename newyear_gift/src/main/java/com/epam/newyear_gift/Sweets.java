package com.epam.newyear_gift;

public class Sweets implements Gifts{

	int cost,weight;
	String name;
	public Sweets(int cost, int weight,String name) {
		super();
		this.cost = cost;
		this.weight = weight;
		this.name=name;
	}


	public int getCost() {
		return cost;
	}

	
	public int getWeight() {
		return weight;
	}

	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Name=" +  name + " [cost=" + cost + ", weight=" + weight  + "]";
	}
}
