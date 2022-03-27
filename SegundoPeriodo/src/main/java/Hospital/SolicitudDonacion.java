
package Hospital;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
//Clase hijo
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
    //Metodos de busqueda y ordenamiento
    public static int busquedaCita(ArrayList<SolicitudDonacion> a, int id)
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
    public static ArrayList<SolicitudDonacion> ordCitas(ArrayList<SolicitudDonacion> idCita)
    {
        int indicemenor, n;
        n = idCita.size() - 1;
        for(int i=0; i<n-1; i++) 
        {
            indicemenor= 1;
            for(int j=i+1;j<n;j++) if(idCita.get(j).getIdSolicitud()<idCita.get(indicemenor).getIdSolicitud()) indicemenor=j;
            if(i!=indicemenor)
            {
            SolicitudDonacion temp = idCita.get(i);
            idCita.set(i, idCita.get(indicemenor));
            idCita.set(indicemenor, temp);
            }
        }
        return idCita;
    }
}
    
    
