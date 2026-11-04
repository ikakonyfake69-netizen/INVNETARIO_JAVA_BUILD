import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class InventarioTest {
    
    @Test
    void calculaSubtotalDeCuatroProductos() {

        int resultado = inventario.calcularSubtotal(50,4);
        assertEquals(201, resultado);
    }


}
