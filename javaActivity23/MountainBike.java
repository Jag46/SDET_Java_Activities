package javaActivity23;

public class MountainBike extends Bicycle {
	

	public int seatHeight;
	
	public MountainBike(int gears,int currentSpead, int seatsHeight) {
		super(gears, speed);
		this.seatHeight = seatsHeight;
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	@Override
	public String bicycleDesc() {
	    return("SeatHeight of the bicycle:" +seatHeight);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike MB = new MountainBike(4,0,25);
		System.out.println(MB.bicycleDesc());
        MB.speedUp(40);
        MB.applyBrake(5);
		}
		
	}

