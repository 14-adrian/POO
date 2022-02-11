
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
    
    public String getDescripcion() //Obtener descripcion
    {
        return descripcion;
    }
    public void setDescripcion(String descripcion) //Modificar Descripcion
    {
        this.descripcion = descripcion;
    }
    public char getIdMedicina() //Obtener Id de Medicina
    {
        return idMedicina;
    }
    public void setIdMedicina(char id) //Modificar Id de Medicina
    {
        this.idMedicina = id;
    }
}
