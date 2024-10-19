package Exercise3;
import java.util.Arrays;

public class Demo3DPrinter {
    

    public static void main(String[] args) {
        PrinterHotEnd printerHotEnd = new PrinterHotEnd();

        System.out.println(printerHotEnd.getTemperature());

        printerHotEnd.setTemperature(200);
        System.out.println(printerHotEnd.getTemperature());

        System.out.println(Arrays.toString(printerHotEnd.getPosition()));
        printerHotEnd.setPosition(150, 150, 0);
        System.out.println(Arrays.toString(printerHotEnd.getPosition()));

        System.out.println("Center of the plate reached, starting printing...");
    }
}
