package application;

public class FreightTrain extends Train implements Vehicle {

	    private double cargoWeight;

	    public FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
	        super(trainNumber, departureStation, arrivalStation, isStart);
	        this.cargoWeight = cargoWeight;
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("자동 변속기 자동차가 가속합니다!");
	    }

	    @Override
	    public void stop() {
	        System.out.println("자동 변속기 자동차가 정차합니다!");
	    }

	    @Override
	    public void setStart() {
	        super.setStart();
	    }

	    public double getCargoWeight () {
	        return this.cargoWeight;
	    }
	    
	}
