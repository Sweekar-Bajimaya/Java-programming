public class lamp {
    boolean ison;
    void turnon(){
        ison = true;
        System.out.println("Light on?" + ison);
    }
    void turnoff(){
        ison = false;
        System.out.println("Light on?" + ison);
    }
    public static void main(String[]args){
        lamp led = new lamp();
        lamp halogen = new lamp();
        led.turnon();
        halogen.turnoff();
    }
}

