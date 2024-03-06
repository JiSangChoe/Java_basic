package application;

public abstract class Car {
	    private String vin;
	    private String color;
	    private boolean isStart;

	    public Car(String vin, String color, boolean isStart) {
	        this.vin = vin;
	        this.color = color;
	        this.isStart = isStart;
	    }

	    public String getVin () {
	        return this.vin;
	    }

	    public String getColor () {
	        return this.color;
	    }

	    public boolean isStart () {
	        return this.isStart;
	    }

	    public void setStart () {
	        this.isStart = !this.isStart;
	    }
	}