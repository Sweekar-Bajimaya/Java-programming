public class Motorcarrunner {
    public static void main(String [] args){
        motorcars Bugatti = new motorcars();
        motorcars Lamborghini = new motorcars();
        Bugatti.start();
        Bugatti.setSpeed(100);
        System.out.println("The speed of car is " + Bugatti.getSpeed() + "Km/s");

        Lamborghini.start();
        Lamborghini.setSpeed(100);
        System.out.println("The speed of car is " + Lamborghini.getSpeed() + "Km/m");
    }
}
