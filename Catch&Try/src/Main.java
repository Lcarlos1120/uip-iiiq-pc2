import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        double nota;
        String nombre = "";
        BufferedReader t1 = new BufferedReader(new InputStreamReader(System.in));


        //TIP DEL DÍA:

        do {
            System.out.print("Nombre: ");
            try {
                nombre = t1.readLine();
            } catch (Exception e) {
                System.out.println("Hubo excepcion...");
            }
            if (nombre.matches(".*\\d+.*")) {
                System.out.println("Tu nombre tiene un numero en algun lugar");
            }
        } while (nombre.matches(".*\\d+.*"));


        do {
            System.out.print("Nota: ");
            try {
                nota = Double.parseDouble(t1.readLine());
            } catch (Exception e) {
                System.out.println("valor invalido...");
                nota = 0.0;
            }
            } while (nota==0.0);

            if (nota >= 91) {
                System.out.println(nombre + " tienes una A");
            }
            if (nota >= 81) {
                System.out.println(nombre + " tienes una B");
            }
            if (nota >= 71) {
                System.out.println(nombre + " tienes una C");
            }
            if (nota >= 61) {
                System.out.println(nombre + " tienes una D");
            } else {
                System.out.println(nombre + " tienes una F");
            }

    }
}

