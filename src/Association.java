import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Andres de la Roca 20332
 * Clase que se encarga de asociar las palabras con el diccionario que se hizo a traves de BST.
 * @version 18/04/2021
 * @since 15/04/2021
 */
public class Association{


    HashMap<String, String> Asociaciones = new HashMap<>();
    SymTab<String, String> DiccionarioEspanol = new SymTab<>();
    SymTab<String, String> DiccionarioFrances = new SymTab<>();
    SymTab<String, String> DiccionarioIngles = new SymTab<>();

    /**
     *Constructor de la clase Association, se encarga de la creacion de los arboles binarios.
     * @throws IOException
     */
    public Association() throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("C:\\Users\\Andre\\OneDrive\\Universidad\\Segundo año\\Segundo año - Primer Semestre\\Algoritmos y estructuras de datos\\Hojas de trabajo\\Hoja de trabajo 7\\src\\diccionario.txt"));
        List<String> lines = new ArrayList<String>();
        String line = "";
        while((line = abc.readLine()) != null) {

            lines.add(line);

        }
        abc.close();


        String[] data = lines.toArray(new String[]{});
        for (int i = 0; i < data.length; i++) {
            String[] arr = data[i].split(",");
            DiccionarioIngles.add(arr[0], data[i]);
            DiccionarioEspanol.add(arr[1], data[i]);
            DiccionarioFrances.add(arr[2], data[i]);


        }
        System.out.println("Recorrido Diccionario en ingles: ");
        for (int i = 0; i < data.length; i++) {

            String[] arr = data[i].split(",");
            System.out.println(DiccionarioIngles.get(arr[0]));
        }

        System.out.println("\nRecorrido Diccionario en espanol: ");
        for (int i = 0; i < data.length; i++) {

            String[] arr = data[i].split(",");
            System.out.println(DiccionarioEspanol.get(arr[1]));
        }

        System.out.println("\nRecorrido Diccionario en frances: ");
        for (int i = 0; i < data.length; i++) {

            String[] arr = data[i].split(",");
            System.out.println(DiccionarioFrances.get(arr[2]));
        }
    }

    /**
     * Metodo que se encarga de traducir la oracion del archivo de texto de espanol a ingles.
     * @throws IOException
     */
    public void traductorEspanol() throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("C:\\Users\\Andre\\OneDrive\\Universidad\\Segundo año\\Segundo año - Primer Semestre\\Algoritmos y estructuras de datos\\Hojas de trabajo\\Hoja de trabajo 7\\src\\texto.txt"));
        List<String> lines = new ArrayList<String>();
        String line = "";
        while((line = abc.readLine()) != null) {

            lines.add(line);

        }
        abc.close();

        String[] data = lines.toArray(new String[]{});

        String oracion = data[0];
        String oraciontraducida = "";
        String[] oracionpartida = oracion.split(" ");
        for (int i = 0; i < oracionpartida.length; i++){
            if(DiccionarioEspanol.contains(oracionpartida[i])) {
                String[] arraypalabras = DiccionarioEspanol.get(oracionpartida[i]).split(",");
                oracionpartida[i] = " "+arraypalabras[0]+" ";
            } else {
                String palabra = " *"+oracionpartida[i]+"* ";
                oracionpartida[i] = palabra;
            }
            oraciontraducida = oraciontraducida.concat(oracionpartida[i]);
        }
        System.out.println("Traduccion de espanol a ingles: " + oraciontraducida);
    }

    /**
     * Metodo que muestra la oracion ingresada por medio del archivo de texto.
     * @throws IOException
     */
    public void mostrarOracion() throws IOException{
        BufferedReader abc = new BufferedReader(new FileReader("C:\\Users\\Andre\\OneDrive\\Universidad\\Segundo año\\Segundo año - Primer Semestre\\Algoritmos y estructuras de datos\\Hojas de trabajo\\Hoja de trabajo 7\\src\\texto.txt"));
        List<String> lines = new ArrayList<String>();
        String line = "";
        while((line = abc.readLine()) != null) {

            lines.add(line);

        }
        abc.close();

        String[] data = lines.toArray(new String[]{});

        String oracion = data[0];
        System.out.println(oracion);
    }

    /**
     * Metodo que traduce de ingles a frances la oracion que ha sido ingresada por medio del archivo de texto.
     * @throws IOException
     */
    public void traductorIngles() throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("C:\\Users\\Andre\\OneDrive\\Universidad\\Segundo año\\Segundo año - Primer Semestre\\Algoritmos y estructuras de datos\\Hojas de trabajo\\Hoja de trabajo 7\\src\\texto.txt"));
        List<String> lines = new ArrayList<String>();
        String line = "";
        while((line = abc.readLine()) != null) {

            lines.add(line);

        }
        abc.close();

        String[] data = lines.toArray(new String[]{});

        String oracion = data[0];
        String oraciontraducida = "";
        String[] oracionpartida = oracion.split(" ");
        for (int i = 0; i < oracionpartida.length; i++){
            if(DiccionarioIngles.contains(oracionpartida[i])) {
                String[] arraypalabras = DiccionarioIngles.get(oracionpartida[i]).split(",");
                oracionpartida[i] = " "+arraypalabras[2]+" ";
            } else {
                String palabra = " *"+oracionpartida[i]+"* ";
                oracionpartida[i] = palabra;
            }
            oraciontraducida = oraciontraducida.concat(oracionpartida[i]);
        }
        System.out.println("Traduccion de ingles a frances: " + oraciontraducida);
    }

    /**
     * Metodo que se encarga de traducir de frances a espanol el texto que se ha introducido por medio del archivo de texto.
     * @throws IOException
     */
    public void traductorFrances() throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("C:\\Users\\Andre\\OneDrive\\Universidad\\Segundo año\\Segundo año - Primer Semestre\\Algoritmos y estructuras de datos\\Hojas de trabajo\\Hoja de trabajo 7\\src\\texto.txt"));
        List<String> lines = new ArrayList<String>();
        String line = "";
        while((line = abc.readLine()) != null) {

            lines.add(line);

        }
        abc.close();

        String[] data = lines.toArray(new String[]{});

        String oracion = data[0];
        String oraciontraducida = "";
        String[] oracionpartida = oracion.split(" ");
        for (int i = 0; i < oracionpartida.length; i++){
            if(DiccionarioFrances.contains(oracionpartida[i])) {
                String[] arraypalabras = DiccionarioFrances.get(oracionpartida[i]).split(",");
                oracionpartida[i] = " "+arraypalabras[1]+" ";
            } else {
                String palabra = " *"+oracionpartida[i]+"* ";
                oracionpartida[i] = palabra;
            }
            oraciontraducida = oraciontraducida.concat(oracionpartida[i]);
        }
        System.out.println("Traduccion de Frances a espanol: " + oraciontraducida);
    }


}

