
package Hospital;
import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.text.ParseException;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *         Sarahi Guadalupe Silva Molina
 */
public class Hospital implements HInterface {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Listas
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        ArrayList<Medicina> medicina = new ArrayList<Medicina>();
        Paciente _pac1 = new Paciente("Leonidas", "Mendoza", 123456789, "7777-7777", "ssss@fff.com", addFecha("14/02/2001"), "m");
        pacientes.add(_pac1);
        ArrayList<Medico> medicos = new ArrayList<Medico>();
        ArrayList<SolicitudCita> citas = new ArrayList<SolicitudCita>();
        //Id para agregar a los objetos
        int id = 1;
        boolean sMenu = true;
        
        //Menu
        while(sMenu){
            boolean sOpcion = true;
            System.out.println("-- Hospital El Salvador --\nIngrese una opicion:"
                    + "\n1 - Medicos"
                    + "\n2 - Citas"
                    + "\n3 - Pacientes"
                    + "\n4 - Medicinas"
                    + "\n5 - Salir");
            int opMenu = entrada.nextInt();
            
            switch(opMenu){
                //Menu medicos
                case 1:
                    while(sOpcion){
                        System.out.println("-- Medicos --\nIngrese una opicion:"
                                + "\n1 - Agregar medico"
                                + "\n2 - Eliminar medico"
                                + "\n3 - Buscar medico"
                                + "\n4 - Mostrar medicos"
                                + "\n5 - Salir");
                        int opMedicos = entrada.nextInt();
                        switch(opMedicos){
                            //Agregar medico
                            case 1:
                            //Eliminar medico
                            case 2:
                            //Buscar medico
                            case 3:
                            //Mostrar Medicos
                            case 4:
                            //Salir
                            case 5:
                                sOpcion = false;
                                break;
                            default:
                                System.out.println(MSJERROR);
                                break;    
                        }
                    }
                    break;
                //Menu citas
                case 2:
                    while(sOpcion){
                        System.out.println("-- Citas --\nIngrese una opicion:"
                                + "\n1 - Nueva cita"
                                + "\n3 - Borrar cita"
                                + "\n4 - Buscar cita"
                                + "\n5 - Mostrar citas"
                                + "\n6 - Salir");
                        int opCitas = entrada.nextInt();
                        switch(opCitas){
                            //Nueva Cita
                            case 1:
                                if(!pacientes.isEmpty()){
                                    id++;
                                    System.out.println("Ingrese el estado:");
                                    String estado = entrada.nextLine();
                                    Date fecha = new Date();
                                    System.out.println("Ingrese el nombre del medico asignado:");
                                    String medico = entrada.nextLine();
                                    System.out.println("Ingrese el tipo de consulta:");
                                    String tipo = entrada.nextLine();
                                    boolean cons = true;
                                    int n = -1;
                                    while(cons){
                                        System.out.println("Ingrese el numero de DUI del paciente:");
                                        int duiPac = entrada.nextInt();
                                        n = Paciente.busquedaPaciente(pacientes, duiPac);
                                        if(n == -1)System.out.println("El paciente no existe, por favor ingrese un numero de DUI correcto!");
                                        else cons = false;
                                    }
                                    SolicitudCita _citas = new SolicitudCita(id, estado, fecha, medico, tipo, pacientes.get(n));
                                    citas.add(_citas);
                                }
                                else System.out.println("No existen pacientes, por lo que no se pueden crear citas");
                                break;
                            //Eliminar cita
                            case 2:
                            //Buscar cita
                            case 3:
                            //Mostrar cita
                            case 4:
                            //Salir
                            case 5:
                                sOpcion = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;    
                        }
                    }
                    break;
                //Menu Pacientes
                case 3:
                    while(sOpcion){
                        System.out.println("-- Pacientes --\nIngrese una opicion:"
                                + "\n1 - Agregar paciente"
                                + "\n2 - Borrar paciente"
                                + "\n3 - Buscar paciente"
                                + "\n4 - Mostrar pacientes"
                                + "\n5 - Salir");
                        int opPacientes = entrada.nextInt();
                        switch(opPacientes){
                            //Agregar Pacientes
                            case 1:
                                System.out.println("Ingrese el Nombre:");
                                String nombre = entrada.next();
                                System.out.println("Ingrese el Apellido:");
                                String apellido = entrada.next();
                                System.out.println("Ingrese el numero de DUI:");
                                int dui = entrada.nextInt();
                                System.out.println("Ingrese el numero de telefono:");
                                String telefono = entrada.next();
                                System.out.println("Ingrese el correo:");
                                String correo = entrada.next();
                                System.out.println("Ingrese la fecha de nacimiento(dd/mm/aaaa):");
                                String fNac = entrada.next();
                                Date fecha = addFecha(fNac);
                                System.out.println("Ingrese el sexo:");
                                String sexo = entrada.next();
                                
                                Paciente _paciente = new Paciente(nombre, apellido, dui, telefono, correo, fecha, sexo);
                                pacientes.add(_paciente);
                                break;
                            //Eliminar paciente
                            case 2:
                                if(!pacientes.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        System.out.println("Ingrese el numero de DUI del paciente que desea eliminar:");
                                        int duiDel = entrada.nextInt();
                                        n = Paciente.busquedaPaciente(pacientes, duiDel);
                                        if(n == -1)System.out.println("El paciente no existe, por favor ingrese un numero de DUI correcto!");
                                        else borrando = false;
                                    }
                                    pacientes.remove(n);
                                    System.out.println("Datos eliminados!");
                                }
                                else System.out.println("No existen datos para eliminar");
                                break;
                            //Buscar paciente
                            case 3:
                                if(!pacientes.isEmpty()){
                                boolean buscando = true;
                                int n = -1;
                                    while(buscando){
                                        System.out.println("Ingrese el numero de DUI del paciente que desea buscar:");
                                        int duiSrch = entrada.nextInt();
                                        n = Paciente.busquedaPaciente(pacientes, duiSrch);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    String fnac;
                                    System.out.println("Nombre:\t\tApellido:\tDUI:\tTelefono:\tCorreo:\tFecha:\tNacimiento:\tSexo:");
                                    System.out.print(pacientes.get(n).getNombre()+"\t");
                                    System.out.print(pacientes.get(n).getApellido()+"\t\t");
                                    System.out.print(pacientes.get(n).getDUI()+"\t\t");
                                    System.out.print(pacientes.get(n).getTelefono()+"\t\t");
                                    System.out.print(pacientes.get(n).getCorreo()+"\t\t");
                                    fnac = fechaFormato(pacientes.get(n).getFNacimiento());
                                    System.out.print(fnac+"\t\t");
                                    System.out.print(pacientes.get(n).getSexo()+"\n");
                                    
                                }
                                else System.out.println("No existen datos para buscar");
                                break;
                            //Mostrar Pacientes
                            case 4:
                                if(!pacientes.isEmpty()){
                                    String fnac;
                                    System.out.println("Nombre:\t\tApellido:\tDUI:\tTelefono:\tCorreo:\tFecha:\tNacimiento:\tSexo:");
                                    for(int i = 0; i < pacientes.size(); i++){
                                        System.out.print(pacientes.get(i).getNombre()+"\t");
                                        System.out.print(pacientes.get(i).getApellido()+"\t\t");
                                        System.out.print(pacientes.get(i).getDUI()+"\t\t");
                                        System.out.print(pacientes.get(i).getTelefono()+"\t\t");
                                        System.out.print(pacientes.get(i).getCorreo()+"\t\t");
                                        fnac = fechaFormato(pacientes.get(i).getFNacimiento());
                                        System.out.print(fnac+"\t\t");
                                        System.out.print(pacientes.get(i).getSexo()+"\n");
                                    }
                                }
                                break;
                            case 5:
                                sOpcion = false;
                                break;
                            default:
                                System.out.println(MSJERROR);
                                break;
                        }
                    }
                    break;
                //Menu medicinas
                case 4:
                    while(sOpcion){
                        System.out.println("-- Medicina --\nIngrese una opicion:"
                                + "\n1 - Agregar medicina"
                                + "\n2 - Borrar medicina"
                                + "\n3 - Buscar medicina"
                                + "\n4 - Mostrar medicinas"
                                + "\n5 - Salir");
                        int opMedicina = entrada.nextInt();
                        switch(opMedicina){
                            //Agregar Medicina
                            case 1:
                                System.out.println("Ingrese la descripcion:");
                                String descripcion = entrada.next();
                                System.out.println("Ingrese el numero de identificacion:");
                                int idMed = entrada.nextInt();
                                Medicina medic = new Medicina(descripcion, idMed);
                                medicina.add(medic);
                                break;
                            //Eliminar medicina
                            case 2:
                                if(!medicina.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        System.out.println("Ingrese el numero de identificacion que desea eliminar:");
                                        int idDel = entrada.nextInt();
                                        n = Medicina.busquedaMedicina(medicina, idDel);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else borrando = false;
                                    }
                                    medicina.remove(n);
                                    System.out.println("Datos eliminados!");
                                }
                                else System.out.println("No existen datos para eliminar");
                                break;
                            //Buscar medicina
                            case 3:
                                if(!medicina.isEmpty()){
                                boolean buscando = true;
                                int n = -1;
                                    while(buscando){
                                        System.out.println("Ingrese el numero de identificacion que desea buscar:");
                                        int idSrch = entrada.nextInt();
                                        n = Medicina.busquedaMedicina(medicina, idSrch);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    System.out.println("Descripcion:\tID:");
                                    System.out.print(medicina.get(n).getDescripcion()+"\t\t");
                                    System.out.print(medicina.get(n).getIdMedicina()+"\n");
                                }
                                else System.out.println("No existen datos para buscar");
                                break;
                            //Mostrar Medicina
                            case 4:
                                if(!medicina.isEmpty()){
                                    System.out.println("Descripcion:\tID:");
                                    for(int i = 0; i < medicina.size(); i++){
                                        System.out.print(medicina.get(i).getDescripcion()+"\t\t");
                                        System.out.print(medicina.get(i).getIdMedicina()+"\n");
                                    }
                                }
                                else System.out.println("No existen datos");
                                break;
                            case 5:
                                sOpcion = false;
                                break;
                            default:
                                System.out.println(MSJERROR);
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Adios");
                    sMenu = false;
                    break;
                default:
                    System.out.println(MSJERROR);
                    break;
            }
        }
    }
    //Metodo para mostrar el formato especificado

    public static String fechaFormato(Date ahora)
    {
        ahora = Calendar.getInstance().getTime();  
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");  
        
        return formato.format(ahora);
    }
 
    public static Date addFecha(String f){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(f);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
}
