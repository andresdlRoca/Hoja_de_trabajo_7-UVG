import java.util.Scanner;

public class DriverTraductor {

    public static void main(String[] args) {

        boolean run = true;
        Scanner scan = new Scanner(System.in);

        while(run) {
            System.out.println("\n---Traductor---");
            System.out.println("1. Traducir archivo de texto");
            System.out.println("Salir de programa\n");

            int choice = scan.nextInt();

            switch(choice) {

                case 1 :
                    System.out.println("Se procesara el archivo de texto...\n");
                    System.out.println("Original:");
                    //sysout el archivo original.
                    System.out.println("Traducido");
                    //sysout el archivo traducido.
                    scan.nextLine();
                    break;
                case 2 :
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
