
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
public class Medico extends Persona implements Comparador<Medico>{
    private String especialidad; //Especialidad del medico
    private int IdMedico; //Numero de identificacion del medico
    
    //Metodo para crear un atributo con la clase
    public Medico (String nombre, String especialidad, int idMedico, String telefono, String correo, Date fnacimiento, String sexo)
    {
        super(nombre, telefono, correo, fnacimiento, sexo);
        this.especialidad=especialidad;
        this.IdMedico=idMedico;
    }
    //Metodos get y set
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
    //Metodos busqueda y ordenamiento
    public static int busquedaMedico(ArrayList<Medico> a, int id)
    {
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = a.size();
        while(bajo<=alto)
        {
            central = (bajo + alto)/2;
            valorCentral = a.get(central).getIdMedico();
            if(id == valorCentral) return central;
            else if(id < valorCentral) alto = central -1;
            else bajo = central +1;
        }
        return -1;
    }
    //Metodo Ordenamiento aplicando interface
    public static ArrayList<Medico> ordMedico(ArrayList<Medico> medico) {
        Medico temp;
        int n, indiceMenor;
        n = medico.size();
        for (int i = 0; i < n; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (medico.get(j).comparar(medico.get(indiceMenor)) > 0) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor && indiceMenor < n) {
                temp = medico.get(i);
                medico.set(i, medico.get(indiceMenor));
                medico.set(indiceMenor, temp);
            }
        }
        return medico;
    }
    //metodo abstracto 
    @Override
    public void leer()
    {
        String fnac = fechaFormato(this.getFNacimiento());
        //Formato para el printF
        String formato = "|%12s|%12s|%12s|%12s|%12s|%18s|%12s|%n";
        System.out.printf(formato,  "Nombre", "Especialidad", "IDMedico", "Telefono", "Correo", "Fecha Nacimiento", "Sexo");
        System.out.printf(formato, this.getNombre(), this.getEspecialidad(), this.getIdMedico(),  this.getTelefono(),  this.getCorreo(), fnac, this.getSexo());
    }
    @Override
    public int comparar(Medico med){
        return med.getNombre().compareTo(this.getNombre());
    }
}
