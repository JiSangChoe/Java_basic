package app;

public class PassengerTrain extends Train implements Vehicle {
	    private int passengerCount;

	    public PassengerTrain(String trainNumber, String departureStation, String arrivalStation) {
	        
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("여객 열차가 천천히 가속합니다!");
	    }

	    @Override
	    public void stop() {
	        System.out.println("여객 열차가 천천히 정차합니다!");
	    }

	    @Override
	    public void setStart() {
	        isStart = !isStart;
	    }

	    // Other methods if needed
	}