package Hospital;

import java.util.Date;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class SolicitudCita {
    char idSolicitud;
    char estado;
    Date fecha;
    Date hora;
    String nombreMedico;
    char tipoConsulta;
    
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
