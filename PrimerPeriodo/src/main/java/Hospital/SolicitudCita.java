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
    
    public SolicitudCita(char id, char estado, Date fecha, Date hora, String nMedico, char tipo) //Metodo para crear un atributo con la clase
    {
        this.idSolicitud = id;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreMedico = nMedico;
        this.tipoConsulta = tipo;
    }
    
    public char getIdSolicitud() //Obtener Id de solicitud
    {
         return idSolicitud;
    }
    public void setIdSolicitud(char id) //Modificar Id de solicitud
    {
        this.idSolicitud = id;
    }
    public char getEstado() //Obtener estado de la solicitud
    {
        return estado;
    }
    public void setEstado(char estado)  //Modificar estado de la solicitud
    {
        this.estado = estado;
    }
    public Date getFecha() //Obtener fecha de la solicitud
    {
        return fecha;
    } 
    public void setFecha(Date fecha)  //Modificar fecha de la solicitud
    {
        this.fecha = fecha;
    } 
    public Date getHora() //Obtener hora de la solicitud
    {
        return hora;
    } 
    public void setHora(Date hora)  //Modificar hora de la solicitud
    {
        this.hora = hora;
    } 
    public String getMedicoNombre()  //Obtener nombre del medico asignado
    {
        return nombreMedico;
    }
    public void setNombreMedico(String medico)  //Cambiar el medico asignado
    {
        this.nombreMedico = medico;
    }
  
    public char getTipoConsulta() //Obtener el tipo de consulta
    {
        return tipoConsulta;
    }
  
     public void setTipoConsulta(char tipo) //Modificar el tipo de consulta
    {
        this.tipoConsulta = tipo;
    }
}
