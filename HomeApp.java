public class HomeApp{
    public static void main(String [] args){

        HomeInterface facade = new HomeInterface();
        
        System.out.println("Turning on all appliances...");
        facade.turnOnAll();
        System.out.println();
        System.out.println("Turning off all appliances...");
        facade.turnOffAll();
    }
}