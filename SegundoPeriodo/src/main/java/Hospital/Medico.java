
package Hospital;

import java.util.ArrayList;
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
    private String sexo;
    
    //Metodo para crear un atributo con la clase
    public Medico (String nombre, String especialidad, int idMedico, String telefono, String correo, Date fnacimiento, String sexo)
    {
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.IdMedico=idMedico;
        this.telefono=telefono;
        this.correo=correo;
        this.fNacimiento=fnacimiento;  
        this.sexo = sexo;
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
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String _sexo){
       this.sexo=_sexo;
    }
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
}
