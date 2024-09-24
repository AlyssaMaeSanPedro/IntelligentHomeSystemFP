public class HomeInterface{
    private HomeService light;
    private HomeService tv;
    private HomeService aircon;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new TV();
        this.aircon = new AirConditioning();
    }

    public void turnOnAll(){
        light.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
}