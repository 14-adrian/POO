package Hospital;
import java.util.Date;

/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores 
 */
//Clase Padre
public class Persona {
    private String nombre; //dato general
    private String telefono; //dato general
    private String correo; //dato general
    private Date fNacimiento; //dato general
    private String sexo; //dato general
    
    public Persona(String nombre, String telefono,String correo, Date fNacimiento,String sexo)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.correo=correo;
        this.fNacimiento=fNacimiento;
        this.sexo=sexo;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
        
    public String getTelefono()
    {
        return this.telefono;
    }
    
    public void setTelefono(String telefono)
    {
        this.telefono=telefono;
    }
    
     public String getCorreo()
    {
        return this.correo;
    }
    
    public void setCorreo(String correo)
    {
        this.correo=correo;
    }
    
     public Date getFNacimiento()
    {
        return this.fNacimiento;
    }
    
    public void setFNacimiento(Date fNacimiento)
    {
        this.fNacimiento=fNacimiento;
    }
    
     public String getSexo()
    {
        return this.sexo;
    }
    
    public void setSexo(String sexo)
    {
        this.sexo=sexo;
    }
}