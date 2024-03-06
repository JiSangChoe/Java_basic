package app;

public class App {
    public static void main(String[] args) {
        ManualCar manualCar = new ManualCar("10가1234", "blue");
        AutomaticCar automaticCar = new AutomaticCar("10가5678", "red");
        PassengerTrain passengerTrain = new PassengerTrain("KTX001", "서울", "부산");
        FreightTrain freightTrain = new FreightTrain("Cargo001", "부산", "구미");

        
        manualCar.accelerate();
        automaticCar.accelerate();
        passengerTrain.accelerate();
        freightTrain.accelerate();

        
    }
}