
package Hospital;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class Paciente {
    private String nombre; //Nombre del paciente
    private String apellido; //Apellido del paciente
    private int dui; //Numero deDUI del paciente
    private String telefono; //Telefono del Paciente
    private String correo; //Correo del paciente
    private Date fNacimiento; //Fecha de nacimiento del paciente
    private char sexo; //Sexo del paciente
        
    //Metodo para crear un atributo con la clase
    public Paciente (String nombre, String apellido, int dui, String telefono, String correo, Date fnacimiento, char sexo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dui=dui;
        this.telefono=telefono;
        this.correo=correo;
        this.fNacimiento=fnacimiento;
        this.sexo=sexo;
    }
    public String getNombre(){ //Obtener nombre del paciente
        return nombre;
    }
    public void setNombre(String nombre){ //Modificar nombre del paciente
        this.nombre=nombre;
    }    
    public String getApellido(){ //Obtener nombre del paciente
        return apellido;
    }
    public void setApellido(String apellido){ //Modificar nombre del paciente
        this.apellido=apellido;
    }
    public int getDUI(){ //Obtener el numero de DUI del paciente
    return dui;
    }
    public void setDUI(int dui){ //Modificar numero de DUI del paciente
        this.dui=dui;
    }
    public String getTelefono(){ //Obtener numero de telefono del paciente
        return telefono;
    }
    public void setTelefono(String telefono){ //Obtener numero de telefono del paciente
        this.telefono=telefono;
    }    
    public String getCorreo(){ //Obtener correo del paciente
        return correo;
    }
    public void setCorreo(String correo){ //Modificar correo del paciente
    this.correo=correo;
    }
    public Date getFNacimiento(){ //Obtener fecha de nacimiento del paciente
        return fNacimiento;
    }
    public void setFNacimiento(Date fnacimiento){ //Modificar fecha de nacimiento del paciente
        this.fNacimiento=fnacimiento;
    }       
    public char getSexo(){ //Obtener el sexo del paciente
        return sexo;
    }
    public void setSexo(char sexo){ //Modificar el sexo del paciente
        this.sexo=sexo;
    }
}
