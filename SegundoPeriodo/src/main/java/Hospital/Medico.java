
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
public class Medico extends Persona{
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
    public static ArrayList<Medico> ordMedico(ArrayList<Medico> medico) {
        Medico temp;
        for (int i = 0; i < medico.size() - 1; i++) {

            for (int j = i+1; j < medico.size(); j++) {
                if (medico.get(i).getNombre().compareTo(medico.get(j).getNombre()) > 0) {
                    temp = medico.get(i);
                    medico.add(i, medico.get(j));
                    medico.add(j, temp);
                }
            }
        }
        return medico;
    }
    //metodo abstracto 
    @Override
    public void leer()
    {
        System.out.println("Nombre:\t\tEspecialidad:\t\tIDMedico:\t\tTelefono:\t\tCorreo:\t\tFecha Nacimiento:\t\tSexo:");
        System.out.print(this.getNombre()+"\t\t");
        System.out.print(this.getEspecialidad()+"\t\t");
        System.out.print(this.getIdMedico()+"\t\t");
        System.out.print(this.getTelefono()+"\t\t");
        System.out.print(this.getCorreo()+"\t\t");
        String fnac = fechaFormato(this.getFNacimiento());
        System.out.print(fnac+"\t\t");
        System.out.print(this.getSexo()+"\n");
    }
}
