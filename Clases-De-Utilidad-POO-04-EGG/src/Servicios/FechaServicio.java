
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FechaServicio {

    public static Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de su nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de su nacimiento (1-12): ");
        int mes = scanner.nextInt() - 1; // Restamos 1 para que sea compatible con Calendar.MONTH

        System.out.print("Ingrese el año de su nacimiento: ");
        int anio = scanner.nextInt();

        scanner.close();

        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes, dia);

        return calendar.getTime();
    }

    public static Date fechaActual() {
        return new Date();
    }

    public static int diferencia(Date fecha1, Date fecha2) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(fecha1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(fecha2);

        int anio1 = calendar1.get(Calendar.YEAR);
        int anio2 = calendar2.get(Calendar.YEAR);

        return anio2 - anio1;
    }
}