
package Hospital;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Leoni
 */
public class IngresarTest {
    
    public IngresarTest() {
    }

    /**
     * Test of opcion method, of class Ingresar.
     */
    //Regla de paquete externo para simular entrada de scanner
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @Test
    public void testOpcion() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese el numero 12:";
        //Resultado esperado
        int expResult = 12;
        //Simulador de entrada de Scanner
        systemInMock.provideLines("12");
        //Uso del metodo
        int result = ingreso.opcion(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }

    /**
     * Test of addNombre method, of class Ingresar.
     */
//    @Test
//    public void testAddNombre() {
//        System.out.println("addNombre");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        String expResult = "";
//        String result = instance.addNombre(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addCorreo method, of class Ingresar.
//     */
//    @Test
//    public void testAddCorreo() {
//        System.out.println("addCorreo");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        String expResult = "";
//        String result = instance.addCorreo(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addDUI method, of class Ingresar.
//     */
//    @Test
//    public void testAddDUI() {
//        System.out.println("addDUI");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        int expResult = 0;
//        int result = instance.addDUI(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addID method, of class Ingresar.
//     */
//    @Test
//    public void testAddID() {
//        System.out.println("addID");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        int expResult = 0;
//        int result = instance.addID(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addTelefono method, of class Ingresar.
//     */
//    @Test
//    public void testAddTelefono() {
//        System.out.println("addTelefono");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        String expResult = "";
//        String result = instance.addTelefono(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addFecha method, of class Ingresar.
//     */
//    @Test
//    public void testAddFecha() {
//        System.out.println("addFecha");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        Date expResult = null;
//        Date result = instance.addFecha(titulo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addDecimal method, of class Ingresar.
//     */
//    @Test
//    public void testAddDecimal() {
//        System.out.println("addDecimal");
//        String titulo = "";
//        Ingresar instance = new Ingresar();
//        float expResult = 0.0F;
//        float result = instance.addDecimal(titulo);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
