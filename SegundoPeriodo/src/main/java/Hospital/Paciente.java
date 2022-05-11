
package Hospital;
import static Hospital.Hospital.fechaFormato;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
//Clase hijo
public class Paciente extends Persona implements Comparador<Paciente>{
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
    //Metodo Ordenamiento aplicando irterface
    public static ArrayList<Paciente> ordPaciente(ArrayList<Paciente> pacientes) {
        Paciente temp;
        int n, indiceMenor;
        n = pacientes.size() ;
        for (int i = 0; i < n; i++) {
            indiceMenor = i;
            for (int j = i+1; j < n; j++) {
                if (pacientes.get(j).comparar(pacientes.get(indiceMenor)) > 0) {
                    indiceMenor = j;
                }
            }
            if(i != indiceMenor && indiceMenor < n){
                temp = pacientes.get(i);
                pacientes.set(i, pacientes.get(indiceMenor));
                pacientes.set(indiceMenor, temp);
            }
        }
        return pacientes;
    }
    //metodo abstracto 
    @Override
    public void leer()
    {
        String fnac = fechaFormato(this.getFNacimiento());
        //Formato para el printF
        String formato = "|%12s|%12s|%12s|%12s|%12s|%18s|%12s|%n";
        System.out.printf(formato,  "Nombre", "Apellido", "DUI", "Telefono", "Correo", "Fecha Nacimiento", "Sexo");
        System.out.printf(formato, this.getNombre(), this.getApellido(), this.getDUI(),  this.getTelefono(),  this.getCorreo(), fnac, this.getSexo());
    }
    //Metodo Interface
    @Override
    public int comparar(Paciente pac1){
        return pac1.getNombre().compareTo(this.getNombre());
    }
}
