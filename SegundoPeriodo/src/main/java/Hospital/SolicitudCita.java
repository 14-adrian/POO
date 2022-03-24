package Hospital;

import java.util.Date;
/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class SolicitudCita extends Citas {
    private String nombreMedico; //Nombre del medico asignado
    private String tipoConsulta; //Tipo de la consulta
    private Paciente paciente; //Paciente
    
    public SolicitudCita(int id, String estado, Date fecha, String nMedico, String tipo, Paciente paciente) //Metodo para crear un atributo con la clase
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
    
}
