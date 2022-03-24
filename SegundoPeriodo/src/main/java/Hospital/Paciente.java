
package Hospital;
import java.util.ArrayList;
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
    private String sexo; //Sexo del paciente
        
    //Metodo para crear un objeto con la clase
    public Paciente (String nombre, String apellido, int dui, String telefono, String correo, Date fnacimiento, String sexo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dui=dui;
        this.telefono=telefono;
        this.correo=correo;
        this.fNacimiento=fnacimiento;
        this.sexo=sexo;
    }
    //Metodos get y set
    public String getNombre(){ 
        return nombre;
    }
    public void setNombre(String nombre){ 
        this.nombre=nombre;
    }    
    public String getApellido(){ 
        return apellido;
    }
    public void setApellido(String apellido){ 
        this.apellido=apellido;
    }
    public int getDUI(){ 
    return dui;
    }
    public void setDUI(int dui){ 
        this.dui=dui;
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
    public void setCorreo(String correo){ 
    this.correo=correo;
    }
    public Date getFNacimiento(){ 
        return fNacimiento;
    }
    public void setFNacimiento(Date fnacimiento){ 
        this.fNacimiento=fnacimiento;
    }       
    public String getSexo(){ 
        return sexo;
    }
    public void setSexo(String sexo){ 
        this.sexo=sexo;
    }
    //Metodo de busqueda
    public static int busquedaPaciente(ArrayList<Paciente> a, int dui)
    {
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = a.size();
        while(bajo<=alto)
        {
            central = (bajo + alto)/2;
            valorCentral = a.get(central).getDUI();
            if(dui == valorCentral) return central;
            else if(dui < valorCentral) alto = central -1;
            else bajo = central +1;
        }
        return -1;
    }
    public static ArrayList<Paciente> ordPaciente(ArrayList<Paciente> pacientes) {
        Paciente temp;
        for (int i = 0; i < pacientes.size() - 1; i++) {
            
            for (int j = i+1; j < pacientes.size(); j++) {
                if (pacientes.get(i).getNombre().compareTo(pacientes.get(j).getNombre()) > 0) {
                    temp = pacientes.get(i);
                    pacientes.add(i, pacientes.get(j));
                    pacientes.add(j, temp);
                }
            }
        }
        return pacientes;
    }
}
