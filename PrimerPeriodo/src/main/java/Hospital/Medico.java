
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
    public String getNombre(){ //Obtener nombre del medico
        return nombre;
    }
    public void setNombre(String nombre){ //Modificar nombre del medico
       this.nombre=nombre;
       
    }
    public String getEspecialidad(){ //Obtener especialidad del medico
        return especialidad; 
    }
    public void setEspecialidad(String especialidad){ //modificar especialidad del medico
       this.especialidad=especialidad;
    }
    public int getIdMedico(){ //Obtener id del medico
       return IdMedico;
    }
    public void setIdMedico(int id){ //Modificar id del medico
       this.IdMedico=id;
    }
    public String getTelefono(){ //Obtener el telefono del medico
       return telefono;
    }
    public void setTelefono(String telefono){ //Modificar el telefono del medico
        this.telefono=telefono;
    }
   public String getCorreo(){ //Obtener correo del medico
        return correo;
    }
    public void setcorreo(String correo){ //Modificar correo del medico
       this.correo=correo;
    }
    public Date getFNacimiento(){ //Obtener la fecha de nacimiento
       return fNacimiento;
    }
     public void setFNacimiento(Date fnacimiento){ //Modificar la fecha de nacimiento
       this.fNacimiento=fnacimiento;
    }
}
