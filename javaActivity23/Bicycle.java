package javaActivity23;

import java.util.Scanner;

public abstract class Bicycle implements BicycleOperations, BicycleParts{
	
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int speed) {
		
		this.gears = gears;
		this.currentSpeed = speed;
	}
	Scanner input = new Scanner(System.in);
	int i = input.nextInt();
	double d = input.nextDouble();
	String s = input.toString();
	
	public void applyBrake(int decrement) {
		System.out.println("Bicycle reduces the currentSpeed by: "+decrement);
	}
	
	public void speedUp(int increment) {
		System.out.println("Bicycle increases the currentSpeed by: "+increment);
	}
	
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}

}
