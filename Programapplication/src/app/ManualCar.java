package app;

public class ManualCar extends Car implements Vehicle {
    private int gear;

    public ManualCar(String vin, String color) {
      
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
        isStart = !isStart;
    }

    public void setGear(int gear) {
    	if (gear >= -1 && gear <= 6) { 
            this.gear = gear;
            System.out.println("기어를 " + gear + "로 변경했습니다.");
        } else {
            System.out.println("올바르지 않은 기어입니다.");
        }
    
   }
}