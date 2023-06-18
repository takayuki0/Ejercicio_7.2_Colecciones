import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CalcularLongitudString cadenas = new CalcularLongitudString();

        ArrayList<String> miArray = new ArrayList<>();

        cadenas.leerArray(miArray);
        cadenas.cadenaMasLarga(miArray);

    }
}