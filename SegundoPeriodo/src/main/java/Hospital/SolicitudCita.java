package Hospital;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
//Clase hijo
public class SolicitudCita extends Citas {
    private String nombreMedico; //Nombre del medico asignado
    private String tipoConsulta; //Tipo de la consulta
    private Paciente paciente; //Paciente
    
    public SolicitudCita(int id, String estado, Date fecha, String nMedico, String tipo, Paciente paciente) 
    {
        super(id, estado, fecha);
        this.nombreMedico = nMedico;
        this.tipoConsulta = tipo;
        this.paciente = paciente;
    }
    //Metodos get y set
    
    public String getMedicoNombre() 
    {
        return nombreMedico;
    }
    public void setNombreMedico(String medico) 
    {
        this.nombreMedico = medico;
    }
  
    public String getTipoConsulta()
    {
        return tipoConsulta;
    }
  
    public void setTipoConsulta(String tipo)
    {
        this.tipoConsulta = tipo;
    }
    public Paciente getPaciente()
    {
        return paciente;
    }
    public void setPaciente(Paciente pac)
    {
        this.paciente = pac;
    }
    //Metodos de busqueda y ordenamiento
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
