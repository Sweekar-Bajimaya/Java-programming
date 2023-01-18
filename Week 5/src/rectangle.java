public class rectangle {
    int length, width, area, perimeter;
}
class area{
    public static void main(String[]arcs){
        rectangle measurement = new rectangle();
        measurement.length = 6;
        measurement.width =  4;
        measurement.area = measurement.length * measurement.width;
        measurement.perimeter = 2* (measurement.length + measurement.width);

        System.out.println("Area: " +measurement.area + " cm^2");
        System.out.println("Perimeter: " + measurement.perimeter + " cm");
    }
}
