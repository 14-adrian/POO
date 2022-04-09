package Hospital;

import java.util.Date;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
public class Jefatura extends Personal{
    public Jefatura(String nombre, int id, String telefono, String correo, Date fnacimiento, String sexo, float sueldo, int dui, String cargo){
        super(nombre, id,  telefono, correo, fnacimiento, sexo, sueldo, dui, cargo);
    }
    public void aumento(){
        this.setSueldo(this.getSueldo()+200);
    }
}
