package app;

public class AutomaticCar extends Car implements Vehicle {
    public AutomaticCar(String vin, String color) {
        // Constructor initialization
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
        isStart = !isStart;
    }

    // Other methods if needed
}