package Hospital;

import static Hospital.Hospital.fechaFormato;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
public class Personal extends Persona{
    private String cargo; //Cargo que desempeña
    private int id; //Id del empleado
    private int dui; //DUI de el empleado
    private float sueldo; // Sueldo de el empleado
    public Personal(String nombre, int id, String telefono, String correo, Date fnacimiento, String sexo, float sueldo, int dui, String cargo){
        super(nombre, telefono, correo, fnacimiento, sexo);
        this.cargo = cargo;
        this.id = id;
        this.sueldo = sueldo;
        this.dui = dui;
    }
    //Metodos get y set
    public int getId(){
       return this.id;
    }
    public void setId(int _id){
       this.id = _id;
    }
    public float getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(float _sueldo){
        this.sueldo = _sueldo;
    }
    public int getDUI(){
       return this.dui;
    }
    public void setDUI(int _dui){
       this.dui = _dui;
    }
    public String getCargo(){
       return this.cargo;
    }
    public void setCargo(String _cargo){
       this.cargo = _cargo;
    }
    //Metodos busqueda y ordenamiento
    public static int busqueda(ArrayList<Personal> a, int id)
    {
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = a.size();
        while(bajo<=alto)
        {
            central = (bajo + alto)/2;
            valorCentral = a.get(central).getId();
            if(id == valorCentral) return central;
            else if(id < valorCentral) alto = central -1;
            else bajo = central +1;
        }
        return -1;
    }
    public static ArrayList<Personal> ordEmpleados(ArrayList<Personal> personal) {
        Personal temp;
        for (int i = 0; i < personal.size() - 1; i++) {

            for (int j = i+1; j < personal.size(); j++) {
                if (personal.get(i).getNombre().compareTo(personal.get(j).getNombre()) > 0) {
                    temp = personal.get(i);
                    personal.add(i, personal.get(j));
                    personal.add(j, temp);
                }
            }
        }
        return personal;
    }
    //metodo abstracto 
    @Override
    public void leer()
    {
        System.out.println("Nombre:\t\tID:\t\tTelefono:\t\tCorreo:\t\tFecha Nacimiento:\t\tSexo:\t\tSueldo:\t\tDUI:\t\tCargo:");
        System.out.print(this.getNombre()+"\t");
        System.out.print(this.getId()+"\t\t");
        System.out.print(this.getTelefono()+"\t\t");
        System.out.print(this.getCorreo()+"\t\t");
        String fnac = fechaFormato(this.getFNacimiento());
        System.out.print(fnac+"\t\t");
        System.out.print(this.getSexo()+"\n");
        System.out.print(this.getSueldo()+"\n");
        System.out.print(this.getDUI()+"\n");
        System.out.print(this.getCargo()+"\n");
    }
}
