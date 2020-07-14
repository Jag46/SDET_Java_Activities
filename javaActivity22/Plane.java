package javaActivity22;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String passenger) {
        this.passengers.add(passenger);
    }
	
	public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
	
	public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
	
    public static void main(String[] args) throws InterruptedException {
        //Assign max 10 passengers
        Plane plane = new Plane(10);
        //Adding passengers
        plane.onboard("Jag");
        plane.onboard("Sabari");
        plane.onboard("Kiran");
        plane.onboard("Harthi");
        
        System.out.println("Plane take off time: " + plane.takeOff());
        System.out.println("Number of Passengers on the plane: " + plane.getPassengers());
        
        Thread.sleep(5000);
        
        plane.land();
        
        System.out.println("Plane landed time: " + plane.getLastTimeLanded());
        System.out.println("Number of Passengers on the plane after landing: " + plane.getPassengers());
    }
}
