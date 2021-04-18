import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Andres de la Roca 20332
 * Clase que realiza las pruebas unitarias de algunos metodos de los arboles binarios
 */
public class BSTtests {
    SymTab<String, String> sym = new SymTab<>();

    @Test
    public void testAgregaryBuscar() {
        sym.add("Llave", "Valor");
        assertEquals("Valor", sym.get("Llave"));
    }

}
