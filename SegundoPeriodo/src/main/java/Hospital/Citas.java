
package Hospital;

import java.util.Date;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
//Clase padre 
public class Citas {
    private int idSolicitud; //Numero de identificacion de solicitud
    private String estado; //Estado de la solicitud
    private Date fecha;//Hora y fecha de la cita
    public Citas(int id, String estado, Date fecha)
    {
        this.idSolicitud = id;
        this.estado = estado;
        this.fecha = fecha;
    }
    //Metodos get y set
    public int getIdSolicitud()
    {
        return idSolicitud;
    }
    public void setIdSolicitud(int id)
    {
        this.idSolicitud = id;
    }
    public String getEstado() 
    {
        return estado;
    }
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }
    public Date getFecha()
    {
        return fecha;
    } 
    public void setFecha(Date fecha) 
    {
        this.fecha = fecha;
    } 
}
