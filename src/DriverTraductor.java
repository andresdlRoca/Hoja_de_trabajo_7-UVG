import java.io.IOException;
import java.util.Scanner;
/**
 * @author Andres de la Roca 20332
 * Clase que driver del traductor.
 * @version 18/04/2021
 * @since 15/04/2021
 */
public class DriverTraductor {

    /**
     * Metodo main del traductor
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        boolean run = true;
        Scanner scan = new Scanner(System.in);
        Association ass = new Association();

        while(run) {
            System.out.println("\n---Traductor---");
            System.out.println("1. Traducir archivo de texto de espanol a ingles");
            System.out.println("2. Traducir archivo de texto de frances a espanol");
            System.out.println("3. Traducir archivo de texto de ingles a frances");
            System.out.println("4. Salir de programa\n");

            int choice = scan.nextInt();

            switch(choice) {

                case 1 :
                    System.out.println("Se procesara el archivo de texto...\n");
                    System.out.println("Original:");
                    ass.mostrarOracion();
                    System.out.println("\n");
                    ass.traductorEspanol();
                    scan.nextLine();
                    break;

                case 2 :
                    System.out.println("Se procesara el archivo de texto...\n");
                    System.out.println("Original:");
                    ass.mostrarOracion();
                    System.out.println("\n");
                    ass.traductorFrances();
                    scan.nextLine();
                    break;

                case 3 :
                    System.out.println("Se procesara el archivo de texto...\n");
                    System.out.println("Original:");
                    ass.mostrarOracion();
                    System.out.println("\n");
                    ass.traductorIngles();
                    scan.nextLine();
                    break;

                case 4 :
                    System.out.println("\nHasta luego!");
                    run = false;
                    break;

                default :
                    System.out.println("\nEligio una opcion invalida, vuelva a intentarlo\n");
                    scan.nextLine();
            }
        }

    }
}
