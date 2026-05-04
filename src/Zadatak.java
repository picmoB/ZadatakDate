import java.time.LocalDateTime;

public class Zadatak {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println("Dan: " + dt.getDayOfMonth());
        System.out.println("Mjesec:" + dt.getMonth());
        System.out.println("Godina: " + dt.getYear());
    }
}
