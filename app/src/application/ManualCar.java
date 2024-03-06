package application;

public class ManualCar extends Car implements Vehicle {

	    private int gear;

	    public ManualCar(String vin, String color, boolean isStart, int gear) {
	        super(vin, color, isStart);
	        this.gear = gear;
	    }

	    @Override
	    public void accelerate() {
	        System.out.println("수동 변속기 자동차가 가속합니다!");
	    }

	    @Override
	    public void stop() {
	        System.out.println("수동 변속기 자동차가 정차합니다!");
	    }

	    @Override
	    public void setStart() {
	        super.setStart();
	    }

	    public int getGear () {
	        return this.gear;
	    }

	    public void setGear (int gear) {
	        if (gear < 0 || gear > 6) return;
	        this.gear = gear;
	    }
	}