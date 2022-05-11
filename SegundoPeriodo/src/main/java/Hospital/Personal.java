package Hospital;

import static Hospital.Hospital.fechaFormato;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
public class Personal extends Persona implements Comparador<Personal>{
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
        int n, indiceMenor;
        n = personal.size();
        for (int i = 0; i < n; i++) {
            indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (personal.get(j).comparar(personal.get(indiceMenor)) > 0) {
                    indiceMenor = j;
                }
            }
            if (i != indiceMenor && indiceMenor < n) {
                temp = personal.get(i);
                personal.set(i, personal.get(indiceMenor));
                personal.set(indiceMenor, temp);
            }
        }
        return personal;
    }
    //metodo abstracto 
    @Override
    public void leer()
    {
        String fnac = fechaFormato(this.getFNacimiento());
        //Formato para el printF
        String formato = "|%12s|%12s|%12s|%12s|%18s|%12s|%12s|%12s|%12s|%n";
        System.out.printf(formato,  "Nombre", "ID", "Telefono", "Correo", "Fecha Nacimiento", "Sexo", "Sueldo", "DUI", "Cargo");
        System.out.printf(formato, this.getNombre(), this.getId(),  this.getTelefono(),  this.getCorreo(), fnac, this.getSexo(), this.getSueldo(), this.getDUI(), this.getCargo());
    }
    @Override
    public int comparar(Personal pers){
        return pers.getNombre().compareTo(this.getNombre());
    }
}
