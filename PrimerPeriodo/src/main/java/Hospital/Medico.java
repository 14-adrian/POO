
package Hospital;

import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class Medico {
    private String nombre; //Nombre de el medico
    private String especialidad; //Especialidad del medico
    private int IdMedico; //Numero de identificacion del medico
    private String telefono; //Numero de telefono del medico
    private String correo; //Correo del medico
    private Date fNacimiento; //Fecha de nacimiento del medico
    
    //Metodo para crear un atributo con la clase
    public Medico (String nombre, String especialidad, int idMedico, String telefono, String correo, Date fnacimiento, char sexo)
    {
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.IdMedico=idMedico;
        this.telefono=telefono;
        this.correo=correo;
        this.fNacimiento=fnacimiento;  
    }
    //Metodos get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){ 
       this.nombre=nombre;
       
    }
    public String getEspecialidad(){
        return especialidad; 
    }
    public void setEspecialidad(String especialidad){
       this.especialidad=especialidad;
    }
    public int getIdMedico(){
       return IdMedico;
    }
    public void setIdMedico(int id){
       this.IdMedico=id;
    }
    public String getTelefono(){
       return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
   public String getCorreo(){
        return correo;
    }
    public void setcorreo(String correo){
       this.correo=correo;
    }
    public Date getFNacimiento(){
       return fNacimiento;
    }
     public void setFNacimiento(Date fnacimiento){ 
       this.fNacimiento=fnacimiento;
    }
}
