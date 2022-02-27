package Hospital;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class SolicitudCita {
    private int idSolicitud; //Numero de identificacion de solicitud
    private String estado; //Estado de la solicitud
    private Date fecha;//Hora y fecha de la cita
    private String nombreMedico; //Nombre del medico asignado
    private String tipoConsulta; //Tipo de la consulta
    private Paciente paciente; //Paciente
    
    public SolicitudCita(int id, String estado, Date fecha, String nMedico, String tipo, Paciente paciente) //Metodo para crear un atributo con la clase
    {
        this.idSolicitud = id;
        this.estado = estado;
        this.fecha = fecha;
        this.nombreMedico = nMedico;
        this.tipoConsulta = tipo;
        this.paciente = paciente;
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
    public static int busquedaPaciente(ArrayList<SolicitudCita> a, int id)
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
            //else if(dui < valorCentral) alto = central -1;
            else bajo = central +1;
        }
        return -1;
    }
}
