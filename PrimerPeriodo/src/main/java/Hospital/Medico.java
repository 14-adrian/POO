
package Hospital;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private int IdMedico;
    private String telefono;
    private String correo;
    private Date fnacimiento;
    public Medico (String nombre, String especialidad, int IdMedico, String telefono, String correo, Date fnacimiento, char sexo)
    {
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.IdMedico=IdMedico;
        this.telefono=telefono;
        this.correo=correo;
        this.fnacimiento=fnacimiento;  
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
       this.nombre=nombre;
       
    }
    public String getespecialidad(){
        return especialidad; 
    }
    public void setespecialidad(){
       this.especialidad=especialidad;
    }
    public int getIdMedico(){
       return IdMedico;
    }
    public void setIdMedico(){
       this.IdMedico=IdMedico;
    }
    public String gettelefono(){
       return telefono;
    }
    public void settelefono(){
        this.telefono=telefono;
    }
   public String getcorreo(){
        return correo;
    }
    public void setcorreo(){
       this.correo=correo;
    }
    public Date getfnacimiento(){
       return fnacimiento;
    }
     public void setfnacimiento(){
       this.fnacimiento=fnacimiento;
    }
}
