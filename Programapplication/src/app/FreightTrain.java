package app;

public class FreightTrain extends Train implements Vehicle {
	    private double cargoWeight;

	    public FreightTrain(String trainNumber, String departureStation, String arrivalStation) {
	        
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("화물 열차가 느리게 가속합니다!");
	    }

	    @Override
	    public void stop() {
	        System.out.println("화물 열차가 느리게 정차합니다!");
	    }

	    @Override
	    public void setStart() {
	        isStart = !isStart;
	    }

	    
	}