
package Hospital;

import java.util.Date;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
public class SolicitudDonacion extends Citas {
    private String donante; //Nombre del medico asignado
    private int dui; //Tipo de la consulta
    //Metodo constructor
    public SolicitudDonacion(int id, String estado, Date fecha, String donante, int dui)
    {
        super(id, estado, fecha);
        this.donante = donante;
        this.dui = dui;
    }
    //Metodos get y set
    
    public String getDonante() 
    {
        return donante;
    }
    public void setDonante(String donante) 
    {
        this.donante = donante;
    }
  
    public int getDUI()
    {
        return dui;
    }
    public void setTipoConsulta(int dui)
    {
        this.dui = dui;
    }
}
    
    
