
package Hospital;

/**
 *
 * @author Sarahi Guadalupe Silva Molina 
 *         Leonidas Adrian Mendoza Flores
 */
public class Medicina {
    String descripcion; //Descripcion de la medicina
    char idMedicina; //Numero de Identificacion de medicina
    
    public Medicina(String desc, char id) //Metodo para crear un atributo con la clase
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
    public char getIdMedicina()
    {
        return idMedicina;
    }
    public void setIdMedicina(char id)
    {
        this.idMedicina = id;
    }
}
