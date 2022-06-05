
package Hospital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *                  Sarahi Guadalupe Silva Molina
 */
//Clase Ingresar para la entrada de datos
public class Ingresar {
    Scanner sc;
    public Ingresar(){
        sc = new Scanner(System.in);
    }
    // Metodo de ingreso de opcion
    public int opcion(String menu){
        int op = -1;
        try {
            do {
                System.out.println(menu);
                System.out.print("Ingrese una opcion:");
                while (!sc.hasNextInt()) {
                    System.out.println("Ingrese un numero!!");
                    sc.next(); 
                }
               op = sc.nextInt();
            } while (op <= 0);
       } catch (Exception e) {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        return op;
    }
    //Metodo para agregar nombres
    public String addNombre(String titulo){
        String nombre = "";
        try{
            do{
                 System.out.println(titulo);
                 nombre = sc.next();
                 if(!nombre.matches("[A-Z][a-zA-Z]*")) System.out.println("!!! Ingrese los datos correctamente !!!");
            }
            while(!nombre.matches("[A-Z][a-zA-Z]*"));
        }
        catch(Exception e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        return nombre;
    }
    //Metodo para agregar correo
    public String addCorreo(String titulo){
        String correo = "";
        try{
            do{
                 System.out.println(titulo);
                 correo = sc.next();
                 if(!correo.matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$")) System.out.println("!!! Ingrese un correo valido !!!");
            }
            while(!correo.matches("^[a-zA-Z0-9_!#$%&'\\*+/=?{|}~^.-]+@[a-zA-Z0-9.-]+$"));
        }
        catch(RuntimeException e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        return correo;
    }
    //Metodo para agregar DUI
    public int addDUI(String titulo){
        String sID = "1";
        int id = 1;
        try{
            do{
                 System.out.println(titulo);
                 sID = sc.next();
                 if(!sID.matches("^[0-9]{9}$")) System.out.println("!!! Ingrese los datos correctamente !!!");
            }
            while(!sID.matches("^[0-9]{9}$"));
            id = Integer.parseInt(sID);
        }
        catch(RuntimeException e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        return id;
    }
    //Metodo para agregar Numero de identificacion
    public int addID(String titulo){
        String sID = "1";
        int id = 1;
        try{
            do{
                 System.out.println(titulo);
                 sID = sc.next();
                 if(!sID.matches("^[0-9]{5}$")) System.out.println("!!! Ingrese los datos correctamente !!!");
            }
            while(!sID.matches("^[0-9]{5}$"));
            id = Integer.parseInt(sID);
        }
        catch(RuntimeException e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        return id;
    }
//Metodo para agregar Telefono
    public String addTelefono(String titulo){
        String telefono = "1";
        try{
            do{
                 System.out.println(titulo);
                 telefono = sc.next();
                 if(!telefono.matches("^[0-9]{4}-[0-9]{4}$")) System.out.println("!!! Ingrese los datos correctamente !!!");
            }
            while(!telefono.matches("^[0-9]{4}-[0-9]{4}$"));
        }
        catch(RuntimeException e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        
        return telefono;
    }
    //Metodo para agregar fechas
    public Date addFecha(String titulo){
        String fecha = "01/01/1950";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try{
            do{
                 System.out.println(titulo);
                 fecha = sc.next();
                 if(!fecha.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")) System.out.println("!!! Ingrese los datos correctamente !!!");
            }
            while(!fecha.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$"));
            fechaDate = formato.parse(fecha);
        }
        catch(ParseException ex){
            throw new RuntimeException("Ocurrio un error con la fecha!!");
        }
        catch(RuntimeException e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        
        return fechaDate;
    }
    //Metodo para agregar numeros decimales
    public float addDecimal(String titulo){
        String dec = "1";
        float valor = 1;
        try{
            do{
                 System.out.println(titulo);
                 dec = sc.next();
                 if(!dec.matches("^([0-9]{1,6}\\.[0-9]{2})$")) System.out.println("!!! Ingrese los datos correctamente !!!");
            }
            while(!dec.matches("^([0-9]{1,6}\\.[0-9]{2})$"));
            valor= Float.valueOf(dec);
        }
        catch(RuntimeException e)
        {
            throw new RuntimeException("Los datos que ingreso no eran validos!!!");
        }
        return valor;
    }
}
