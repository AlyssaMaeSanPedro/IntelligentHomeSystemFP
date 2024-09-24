public class AirConditioning implements HomeService {
    @Override
    public void turnOn(){
        System.out.println("AirCon is turning on...");
    }

    @Override
    public void turnOff(){
        System.out.println("AirCon is turning off...");
    }
}