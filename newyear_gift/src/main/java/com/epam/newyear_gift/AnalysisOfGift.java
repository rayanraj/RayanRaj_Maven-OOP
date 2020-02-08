package com.epam.newyear_gift;
import java.util.*;

public class AnalysisOfGift {
	
	static List<Sweets> sweets=new ArrayList<Sweets>();
	static List<Chocolates> chocolates=new ArrayList<Chocolates>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		inputSweets();
		inputChocloates();
		
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.println("1.View chocolate and sweets");
			System.out.println("2.View total weight of gift");
			System.out.println("3.View candies in the Gift");
			System.out.println("4.Filter");
			System.out.println("5.Exit");
			int c=sc.nextInt();
			 switch(c)
			 {
			 case 1:
				 display();
				 break;
			 case 2:
				 System.out.println("Total weight of the gift is:"+calcWeight());
				 break;
			 case 3:
				 System.out.println("The Candies are:");
				 candyDisplay();
				 break;
			 case 4:
				 System.out.println("Filter chocolate and sweets according to: 1.cost 2.weight");
				 int ch=sc.nextInt();
				 filter(ch);
				 break;
			 case 5:
				 System.out.println("Have a nice day!");
				 System.exit(0);
			default:
				 System.out.println("Incorrect Choice!! Try Again!!");
			 }
		}
	}
	public static void inputSweets()
	{
		
		System.out.println("Enter the number of sweets:");
		for(int ns=sc.nextInt();ns>0;ns--)
		{
			System.out.println("Enter the weight of sweets:");
			int weight=sc.nextInt();
			System.out.println("Enter the cost of the sweet:");
			int cost=sc.nextInt();
			System.out.println("Enter the name of sweet:");
			String name=sc.next();
			Sweets sweet=new Sweets(cost,weight,name);
			sweets.add(sweet);
		}
	}
	
	
	public static void inputChocloates()
	{
		
		System.out.println("Enter the no of chocolates:");
		for(int n=sc.nextInt();n>0;n--)
		{
			System.out.println("Enter the weight of the chocolate:");
			int weight=sc.nextInt();
			System.out.println("Enter the cost of the chocolate:");
			int cost=sc.nextInt();
			System.out.println("Enter the type of chocolate: 1.Candy 2.Chocolate");
			int cat=sc.nextInt();
			System.out.println("Enter the name of the chocolate:");
			String name=sc.next();
			Chocolates chocolate=new Chocolates(cost,weight,name,cat);
			chocolates.add(chocolate);
		}
	}	
	
	public static int calcWeight()
	{
		int totalWeight=0;
		for(Chocolates choco:chocolates)
			totalWeight+=choco.getWeight();
		for(Sweets sweet:sweets)
			totalWeight+=sweet.getWeight();
		
		return totalWeight;
	}
	
	public static void candyDisplay()
	{
		for(Chocolates choco:chocolates)
		{
			if(choco.getCat()==1)
				System.out.println(choco.toString());
		}
	}
	
	public static void filter(int ch) 
	{
		int lower,higher;
		if(ch==1)
		{
			System.out.println("Enter the lower cost limit:");
			lower=sc.nextInt();
			System.out.println("Enter the upper cost limit:");
			higher=sc.nextInt();
			for(Chocolates choco:chocolates)
			{
				if(choco.getCost()>=lower&&choco.getCost()<=higher)
					System.out.println(choco.toString());
			}
			for(Sweets sweet:sweets)
			{
				if(sweet.getCost()>=lower&&sweet.getCost()<=higher)
					System.out.println(sweet.toString());
			}
		}
		else
		{
			System.out.println("Enter the lower weight limit:");
			lower=sc.nextInt();
			System.out.println("Enter the upper weight limit:");
			higher=sc.nextInt();
			for(Chocolates choco:chocolates)
			{
				if(choco.getWeight()>=lower&&choco.getWeight()<=higher)
					System.out.println(choco.toString());
			}
			for(Sweets sweet:sweets)
			{
				if(sweet.getWeight()>=lower&&sweet.getWeight()<=higher)
					System.out.println(sweet.toString());
			}
		}
	}
	
	public static void display()
	{
		for(Chocolates choco:chocolates)
				System.out.println(choco.toString());
		for(Sweets sweet:sweets)
				System.out.println(sweet.toString());
	}
}
 