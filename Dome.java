import java.text.SimpleDateFormat;
import java.util.Date;

public class Dome {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Date date = new Date (); // this object contains the current date value
            SimpleDateFormat formatter = new SimpleDateFormat ("dd-MM-yyyy HH:mm:ss");
            System.out.println (formatter.format (date));
            Thread.sleep (1000);
        }
    }

}
