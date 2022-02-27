
package Hospital;
import java.util.*;
/**
 *
 * @author Sarahi Guadalupe Silva Molina 
 *         Leonidas Adrian Mendoza Flores
 */
public class Medicina {
    private String descripcion; //Descripcion de la medicina
    private int idMedicina; //Numero de Identificacion de medicina
    
    public Medicina(String desc, int id) //Metodo para crear un atributo con la clase
    {
        this.descripcion = desc;
        this.idMedicina = id;
    }
    //Metodos get y set
    public String getDescripcion() 
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    public int getIdMedicina()
    {
        return idMedicina;
    }
    public void setIdMedicina(int id)
    {
        this.idMedicina = id;
    }
    public static int busquedaMedicina(ArrayList<Medicina> a, int id)
    {
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = a.size()-1;
        while(bajo<=alto)
        {
            central = (bajo + alto)/2;
            valorCentral = a.get(central).idMedicina;
            if(id == valorCentral) return central;
            //else if(id < valorCentral) alto = central -1;
            else bajo = central +1;
        }
        return -1;
    }
}
