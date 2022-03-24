
package Hospital;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
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
    public static int busquedaCita(ArrayList<SolicitudCita> a, int id)
    {
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = a.size();
        while(bajo<=alto)
        {
            central = (bajo + alto)/2;
            valorCentral = a.get(central).getIdSolicitud();
            if(id == valorCentral) return central;
            else if(id < valorCentral) alto = central -1;
            else bajo = central +1;
        }
        return -1;
    }
    public static ArrayList<SolicitudCita> ordCitas(ArrayList<SolicitudCita> idCita)
    {
        int indicemenor, n;
        n = idCita.size() - 1;
        for(int i=0; i<n-1; i++) 
        {
            indicemenor= 1;
            for(int j=i+1;j<n;j++) if(idCita.get(j).getIdSolicitud()<idCita.get(indicemenor).getIdSolicitud()) indicemenor=j;
            if(i!=indicemenor)
            {
            SolicitudCita temp = idCita.get(i);
            idCita.set(i, idCita.get(indicemenor));
            idCita.set(indicemenor, temp);
            }
        }
        return idCita;
    }
}
