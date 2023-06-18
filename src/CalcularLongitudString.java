import java.util.ArrayList;
import java.util.Scanner;

public class CalcularLongitudString {


    public CalcularLongitudString() {
    }

    public void leerArray(ArrayList s) {
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        String cadena = "";
        while (seguir) {
            System.out.print("Ingrese Cadena ó Escriba 'FIN' para terminar: ");
            cadena = entrada.nextLine();
            if (cadena.equals("FIN")) {
                System.out.println("Has finalizado el ingreso de cadenas.");
                seguir = false;
            } else {
                s.add(cadena);
            }
        }

    }

    public void cadenaMasLarga(ArrayList s) {
        String cadenas[] = new String[s.size()];
        s.toArray(cadenas);
        int masLarga = 0;
        String cadenaMasLarga = "";
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i].length() > masLarga) {
                masLarga = cadenas[i].length();
                cadenaMasLarga = cadenas[i];
            }
        }
        System.out.println("La cadena de caracteres con mayor longitud es: " + cadenaMasLarga);
    }


}
