
package Hospital;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class Paciente extends Persona {
    private String apellido; //Apellido del paciente
    private int dui; //Numero deDUI del paciente
        
    //Metodo para crear un objeto con la clase
    public Paciente (String nombre, String apellido, int dui, String telefono, String correo, Date fnacimiento, String sexo)
    {
        super(nombre, telefono, correo, fnacimiento, sexo);
        this.apellido=apellido;
        this.dui=dui;
    }
    //Metodos get y set
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
