package application;

public abstract class Train {
	    
	    private String trainNumber;
	    private String departureStation;
	    private String arrivalStation;
	    private boolean isStart;

	    public Train (String trainNumber, String departureStation, String arrivalStation, boolean isStart) {
	        this.trainNumber = trainNumber;
	        this.departureStation = departureStation;
	        this.arrivalStation = arrivalStation;
	        this.isStart = isStart;
	    }

	    public String getTrainNumber () {
	        return this.trainNumber;
	    }

	    public String getDepartureStation () {
	        return this.departureStation;
	    }

	    public String getArrivalStation () {
	        return this.arrivalStation;
	    }

	    public boolean isStart () {
	        return this.isStart;
	    }

	    public void setStart () {
	        this.isStart = !this.isStart;
	    }

	}
