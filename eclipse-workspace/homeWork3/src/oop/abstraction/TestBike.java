package oop.abstraction;

public class TestBike {

	public static void main(String[] args) {
	    Bike bike = new Honda();
	    bike.start();
	    bike.stop();
	    
	    
	    Honda Ex100 = new Honda();
	    Ex100.motorBike();
	    Ex100.start();
	    
	    MotorBike hybridBike = new Honda();
	    hybridBike.racingBike();
	}

}