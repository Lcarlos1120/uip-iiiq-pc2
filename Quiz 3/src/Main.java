import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String nombre, archivo1 = "Velocidades.dat", archivo2 = "ATTT.dat";
        double multa= 0, nuvMulta= 0, velocidad, sumaMulta = 0;
        int  i;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 0;
        System.out.print("Nombre Completo: ");
        nombre = br.readLine();
        System.out.print("Cantidad de Velocidades: ");
        i = Integer.parseInt(br.readLine());

        try {
            File f1 = new File(archivo1);
            f1.createNewFile();
        } catch (IOException e) {
            System.out.println("Problema de lectura-escritura");
        }
        nuvMulta=0;

        for ( int iii = i; iii > 0; iii--) {
            System.out.print("Velocidad: ");
            velocidad =Double.parseDouble(br.readLine());

            try {
                FileWriter fw = new FileWriter(archivo1, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Velocidades de " + nombre + ": " + Double.toString(velocidad));
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                System.out.println("Problema de lectura-escritura");
            }

                if (velocidad >= 160) {
                    System.out.println("Usted tiene una multa de $220");
                    multa = 220;
                } if (velocidad >= 120 && velocidad < 160) {
                    System.out.println("Usted tiene una multa de $70");
                    multa = 70;
                }
                if (velocidad >= 50 && velocidad < 120) {
                    System.out.println("Usted tiene una multa de $20");
                    multa = 20;
                }
                if (velocidad < 50) {
                    System.out.println("No se le aplica multa a su velocida");
                    multa= 0;
                }


            sumaMulta = multa + nuvMulta;
            nuvMulta= sumaMulta;
        }


            try {
                File f = new File(archivo2);
                f.createNewFile();
                FileWriter fw = new FileWriter(archivo2, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nombre + ", " + Double.toString(nuvMulta));
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                System.out.println("Problema de lectura-escritura");
            }

            System.out.println(nombre + ", tu Multa Total es " +   nuvMulta);

    }

}