package oop.abstraction;

public class Honda extends MotorBike {
	//car
    public void start() {
		System.out.println("start the bike to drive");
	
	}
    public void stop() {
		System.out.println("put on break to stop the Bike");
	}
	//honda
	public void motorBike() {
		System.out.println("implement motor engine");
	}
	//hybridBike
    public void electricBattery() {
    	System.out.println("implement electric battery engine");
    }
    //MotorBike
    public void racingBike() {
    	System.out.println("implement racing Bike");
    }
}
