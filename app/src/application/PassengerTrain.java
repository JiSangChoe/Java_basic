package application;

public class PassengerTrain extends Train implements Vehicle {

    private int passengerCount;

    public PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
        super(trainNumber, departureStation, arrivalStation, isStart);
        this.passengerCount = passengerCount;
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

    public int getPassengerCount () {
        return this.passengerCount;
    }
    
}