
package Hospital;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 */
public class Paciente {
    private String nombre;
    private String apellido;
    private int IdP;
    private String telefono;
    private String correo;
    private Date fnacimiento;
    private char sexo;
        
    public Paciente (String nombre, String apellido, int IdP, String telefono, String correo, Date fnacimiento, char sexo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.IdP=IdP;
        this.telefono=telefono;
        this.correo=correo;
        this.fnacimiento=fnacimiento;
        this.sexo=sexo;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }    
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public int getIdp(){
    return IdP;
    }
    public void setIdP(int IdP){
        this.IdP=IdP;
    }
    public String gettelefono(){
        return telefono;
    }
    public void settelefono(String telefono){
        this.telefono=telefono;
    }    
    public String getcorreo(){
        return correo;
    }
    public void setcorreo(String correo){
    this.correo=correo;
    }
    public Date getnacimiento(){
        return fnacimiento;
    }
    public void setfnacimiento(Date fnacimiento){
        this.fnacimiento=fnacimiento;
    }       
    public char getsexo(){
        return sexo;
    }
    public void setsexo(char sexo){
        this.sexo=sexo;
    }
}
