package Hospital;

import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class SolicitudCita {
    char idSolicitud; //Numero de identificacion de solicitud
    char estado; //Estado de la solicitud
    Date fecha; //Fecha de la cita
    Date hora; //Hora de la cita
    String nombreMedico; //Nombre del medico asignado
    char tipoConsulta; //Tipo de la consulta
    Paciente paciente;
    Medico medico;
    
    public SolicitudCita(char id, char estado, Date fecha, Date hora, String nMedico, char tipo, Paciente paciente, Medico medico) //Metodo para crear un atributo con la clase
    {
        this.idSolicitud = id;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreMedico = nMedico;
        this.tipoConsulta = tipo;
    }
    //Metodos get y set
    public char getIdSolicitud()
    {
         return idSolicitud;
    }
    public void setIdSolicitud(char id)
    {
        this.idSolicitud = id;
    }
    public char getEstado() 
    {
        return estado;
    }
    public void setEstado(char estado) 
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
    public Date getHora()
    {
        return hora;
    } 
    public void setHora(Date hora) 
    {
        this.hora = hora;
    } 
    public String getMedicoNombre() 
    {
        return nombreMedico;
    }
    public void setNombreMedico(String medico) 
    {
        this.nombreMedico = medico;
    }
  
    public char getTipoConsulta()
    {
        return tipoConsulta;
    }
  
     public void setTipoConsulta(char tipo)
    {
        this.tipoConsulta = tipo;
    }
}
