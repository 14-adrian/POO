
package Hospital;


import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *                  Sarahi Guadalupe Silva Molina
 */
public class IngresarTest {
    
    public IngresarTest() {
    }
    //------------Pruebas Positivas----------------------
    
    //Regla de paquete externo para simular entrada de scanner
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    
    //Test opcion TO1
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
    
    //Test Agregar nombre TN1
    @Test
    public void testAddNombre() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese el nombre Sarahi:";
        //Resultado esperado
        String expResult = "Sarahi";
        //Simulador de entrada de Scanner
        systemInMock.provideLines("Sarahi");
        //Uso del metodo
        String result = ingreso.addNombre(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }

    //Test Agregar correo TC1
    @Test
    public void testAddCorreo() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese el correo ssilva88@gmail.com:";
        //Resultado esperado
        String expResult = "ssilva88@gmail.com";
        //Simulador de entrada de Scanner
        systemInMock.provideLines("ssilva88@gmail.com");
        //Uso del metodo
        String result = ingreso.addCorreo(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }

    //Test agregar telefono TT1
    @Test
    public void testAddTelefono() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese el numero de telefono 7589-6348";
        //Resultado esperado
        String expResult = "7589-6348";
        //Simulador de entrada de Scanner
        systemInMock.provideLines("7589-6348");
        //Uso del metodo
        String result = ingreso.addTelefono(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }

    //Test Agregar dui TDUI1
    @Test
    public void testAddDUI() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese el numero de Dui: 123456789";
        //Resultado esperado
        int expResult = 123456789;
        //Simulador de entrada de Scanner
        systemInMock.provideLines("123456789");
        //Uso del metodo
        int result = ingreso.addDUI(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }
    
    //Test Agregar Fecha TF!
    @Test
    public void testAddFecha() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese 14/02/2001: ";
        //Resultado esperado
        String fechaDate = "14/02/2001";
        Date expResult = Hospital.addFecha(fechaDate);
        //Simulador de entrada de Scanner
        systemInMock.provideLines("14/02/2001");
        //Uso del metodo
        Date result = ingreso.addFecha(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }
    
    //Test agregar decimal TDEC1
    @Test
    public void testAddDecimal() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese un numero decimal";
        //Resultado esperado
        float expResult = Float.valueOf("34.45");
        //Simulador de entrada de Scanner
        systemInMock.provideLines("34.45");
        //Uso del metodo
        float result = ingreso.addDecimal(menu);
        //Igualar resultados
        assertEquals(expResult, result);
    }
    //----------------Pruebas Negativas---------------------
    
    //Test Opcion TO1N
    @Test
    public void testOpcionNegativa() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese el numero 22:";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("abc");
                 ingreso.opcion(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
        
        //Igualar resultados
        assertTrue(expResult.equals(result));
    }
    
    //Test agregar nombre TN1N
    @Test
    public void testAddNombreNegativo() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese su nombre: ";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("'123ingreso'");
                 ingreso.addNombre(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
         //Igualar resultados
         assertTrue(expResult.equals(result));
    }
    
    //Test agregar correo TC1N
    @Test
    public void testAddCorreoNegativo() {
         Ingresar ingreso = new Ingresar();
        String menu = "Ingrese un correo: ";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("'---#123.ab123'");
                 ingreso.addCorreo(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
         //Igualar resultados
         assertTrue(expResult.equals(result));
    }
    
    //Test agregar dui TDUI1N
    @Test
    public void testAddDUINegativo() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese un numero de DUI: ";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("abc12345-");
                 ingreso.addDUI(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
         //Igualar resultados
         assertTrue(expResult.equals(result));
    }
    
    //Test agregar telefono TT1N
    @Test
    public void testAddTelefonoNegativo() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese un numero de Telefono: ";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("abc'222'abc");
                 ingreso.addID(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
         //Igualar resultados
         assertTrue(expResult.equals(result));
    }
    //Test agregar fecha TF1N
    @Test
    public void testAddFechaNegativo() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese una fecha: ";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("35/aa/9999");
                 ingreso.addFecha(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
         //Igualar resultados
         assertTrue(expResult.equals(result));
    }
    //Test agregar decimal TDEC1N
    @Test
    public void testAddDecimalNegativo() {
        Ingresar ingreso = new Ingresar();
        String menu = "Ingrese un numero decimal:  ";
        //Resultado esperado
        Exception exception = assertThrows(RuntimeException.class, ()  -> {
                //Simulador de entrada de Scanner
                 systemInMock.provideLines("34....3");
                 ingreso.addDecimal(menu);
         });
         String expResult = "Los datos que ingreso no eran validos!!!";
         String result =  exception.getMessage();
         //Igualar resultados
         assertTrue(expResult.equals(result));
    }
    
}
