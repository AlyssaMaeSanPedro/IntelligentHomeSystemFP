public class TV implements HomeService {
    @Override
    public void turnOn(){
        System.out.println("TV is turning on...");
    }

    @Override
    public void turnOff(){
        System.out.println("TV is turning off...");
    }
}