import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int moneda = 0;
        boolean x = true;
        double usd, eur;
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Convertido de Monedas");


        while( x == true ) {
            System.out.print("¿Cuantas monedas tienes?: ");
            moneda = Integer.parseInt(tec.readLine());

            if (moneda >= 0) {
                usd = moneda / 100.0;
                eur = usd * 0.89;
                System.out.println("USD = $ " + usd);
                System.out.println("EUR = ↑ " + eur);
                x= false;

            } else {
                System.out.println("Cantidad de monedas erronea. Intente de nuevo");

            }
        }
    }
}
