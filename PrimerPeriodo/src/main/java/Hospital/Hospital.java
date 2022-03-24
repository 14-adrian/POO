
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
        //Ejemplo lista medicina
        Medicina med1 = new Medicina("acetaminofen", 123);
        Medicina med2 = new Medicina("Ibuprofeno", 999);
        Medicina med3 = new Medicina("Carvidopa", 892);
        Medicina med4 = new Medicina("Bicarbonato", 210);
        Medicina med5 = new Medicina("SodioCaps", 320);
        Medicina med6 = new Medicina("Salva", 344);
        Medicina med7 = new Medicina("Tramaset", 122);
        medicina.add(med1);
        medicina.add(med2);
        medicina.add(med3);
        medicina.add(med4);
        medicina.add(med5);
        medicina.add(med6);
        medicina.add(med7);
        //Ejemplo lista paciente
        Paciente _pac1 = new Paciente("Leonidas", "Mendoza", 123456789, "7777-7777", "ssss@fff.com", addFecha("14/02/2001"), "m");
        Paciente _pac2 = new Paciente("Alberto", "Lopez", 111114444, "7755-4444", "lambda@fff.com", addFecha("25/06/2000"), "m");
        Paciente _pac3 = new Paciente("Sara", "Lopez", 444433322, "5555-5555", "sara9@fff.com", addFecha("12/01/1999"), "f");
        Paciente _pac4 = new Paciente("Arturo", "Flores", 999999999, "7333-7777", "A911@fff.com", addFecha("03/09/2003"), "m");
        pacientes.add(_pac1);
        pacientes.add(_pac2);
        pacientes.add(_pac3);
        pacientes.add(_pac4);
        ArrayList<Medico> medicos = new ArrayList<Medico>();
        ArrayList<SolicitudCita> citas = new ArrayList<SolicitudCita>();
        SolicitudCita _s = new SolicitudCita(1234, "activa", addFecha("03/09/2022"), "Juan", "Radiografia", pacientes.get(0));
        citas.add(_s);
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
                                System.out.println("Ingrese el Nombre:");
                                String nombre = entrada.next();
                                System.out.println("Ingrese la especialidad:");
                                String especialidad = entrada.next();
                                System.out.println("Ingrese el numero de identificacion:");
                                int idMed = entrada.nextInt();
                                System.out.println("Ingrese el numero de telefono:");
                                String telefono = entrada.next();
                                System.out.println("Ingrese el correo:");
                                String correo = entrada.next();
                                System.out.println("Ingrese la fecha de nacimiento(dd/mm/aaaa):");
                                String fNac = entrada.next();
                                Date fecha = addFecha(fNac);
                                System.out.println("Ingrese el sexo:");
                                String sexo = entrada.next();
                                
                                Paciente _paciente = new Paciente(nombre, especialidad, idMed, telefono, correo, fecha, sexo);
                                pacientes.add(_paciente);
                                break;
                            //Eliminar medico
                            case 2:
                                if(!medicos.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        System.out.println("Ingrese el numero de identificacion del medico que desea eliminar:");
                                        int idDel = entrada.nextInt();
                                        n = Medico.busquedaMedico(medicos, idDel);
                                        if(n == -1)System.out.println("El medico no existe, ingrese un numero de identificacion correcto correcto!");
                                        else borrando = false;
                                    }
                                    medicos.remove(n);
                                    System.out.println("Datos eliminados!");
                                }
                                else System.out.println("No existen datos para eliminar");
                                break;
                            //Buscar medico
                            case 3:
                                if(!medicos.isEmpty()){
                                boolean buscando = true;
                                int n = -1;
                                    while(buscando){
                                        System.out.println("Ingrese el numero de DUI del paciente que desea buscar:");
                                        int idSrch = entrada.nextInt();
                                        n = Medico.busquedaMedico(medicos, idSrch);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    System.out.println("Nombre:\t\tEspecialidad:\tIDMedico:\tTelefono:\tCorreo:\tFecha Nacimiento:\tSexo:");
                                    System.out.print(medicos.get(n).getNombre()+"\t");
                                    System.out.print(medicos.get(n).getEspecialidad()+"\t\t");
                                    System.out.print(medicos.get(n).getIdMedico()+"\t\t");
                                    System.out.print(medicos.get(n).getTelefono()+"\t\t");
                                    System.out.print(medicos.get(n).getCorreo()+"\t\t");
                                    String fnac = fechaFormato(medicos.get(n).getFNacimiento());
                                    System.out.print(fnac+"\t\t");
                                    System.out.print(medicos.get(n).getSexo()+"\n");
                                }
                                break;
                            //Mostrar Medicos
                            case 4:
                                if(!medicos.isEmpty()){
                                    String fnac;
                                    System.out.println("Nombre:\t\tEspecialidad:\tIDMedico:\tTelefono:\tCorreo:\tFecha Nacimiento:\tSexo:");
                                    for(int i = 0; i < medicos.size(); i++){
                                        System.out.print(medicos.get(i).getNombre()+"\t");
                                        System.out.print(medicos.get(i).getEspecialidad()+"\t\t");
                                        System.out.print(medicos.get(i).getIdMedico()+"\t\t");
                                        System.out.print(medicos.get(i).getTelefono()+"\t\t");
                                        System.out.print(medicos.get(i).getCorreo()+"\t\t");
                                        fnac = fechaFormato(medicos.get(i).getFNacimiento());
                                        System.out.print(fnac+"\t\t");
                                        System.out.print(medicos.get(i).getSexo()+"\n");
                                    }
                                }
                                break;
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
                                + "\n2 - Borrar cita"
                                + "\n3 - Buscar cita"
                                + "\n4 - Mostrar citas"
                                + "\n5 - Salir");
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
                             if(!citas.isEmpty()){
                                boolean borrando = true;
                                int n = -1;
                                while(borrando){
                                    System.out.println("Ingrese el numero de identificacion de la cita que desea eliminar:");
                                    int idDel = entrada.nextInt();
                                    n = SolicitudCita.busquedaCita(citas, idDel);
                                    if(n == -1)System.out.println("El id de la cita no existe, por favor ingrese un id correcto!");
                                    else borrando = false;
                                }
                                citas.remove(n);
                                System.out.println("Datos eliminados!");
                                }
                                else System.out.println("No existen datos para eliminar");
                                break;
                            //Buscar cita
                            case 3:
                                if(!citas.isEmpty()){
                                boolean buscando = true;
                                int n = -1;
                                    while(buscando){
                                        System.out.println("Ingrese el numero de identificacion de la cita que desea buscar:");
                                        int idSrch = entrada.nextInt();
                                        n = SolicitudCita.busquedaCita(citas, idSrch);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    String f;
                                    System.out.println("ID::\t\tEstado:\tFecha:\tMedico:\tTipo:\tPaciente:");
                                    System.out.print(citas.get(n).getIdSolicitud()+"\t");
                                    System.out.print(citas.get(n).getEstado()+"\t\t");
                                    f = fechaFormato(citas.get(n).getFecha());
                                    System.out.print(f+"\t\t");
                                    System.out.print(citas.get(n).getMedicoNombre()+"\t\t");
                                    System.out.print(citas.get(n).getTipoConsulta()+"\t\t");
                                    System.out.print(citas.get(n).getPaciente().getNombre()+"\n");
                                    
                                    
                                }
                                else System.out.println("No existen datos para buscar");
                                break;
                            //Mostrar cita
                            case 4:
                                if(!citas.isEmpty()){
                                    boolean mostrarM = true;
                                    int opMostrar = 0;
                                    String f;
                                    while(mostrarM){
                                        System.out.println("ID::\t\tEstado:\tFecha:\tMedico:\tTipo:\tPaciente:");
                                        for(int i = 0; i < citas.size(); i++){
                                            System.out.print(citas.get(i).getIdSolicitud()+"\t");
                                            System.out.print(citas.get(i).getEstado()+"\t\t");
                                            f = fechaFormato(citas.get(i).getFecha());
                                            System.out.print(f+"\t\t");
                                            System.out.print(citas.get(i).getMedicoNombre()+"\t\t");
                                            System.out.print(citas.get(i).getTipoConsulta()+"\t\t");
                                            System.out.print(citas.get(i).getPaciente().getNombre()+"\n");
                                        }
                                        System.out.println("-----------------------\nIngrese una opcion\n1 - Ordenar\n2 - Salir");
                                        opMostrar = entrada.nextInt();
                                        switch(opMostrar){
                                            case 1:
                                                ArrayList<SolicitudCita> _cita = new ArrayList<SolicitudCita>();
                                                _cita = SolicitudCita.ordCitas(citas);
                                                citas = _cita;
                                                break;
                                            case 2:
                                                mostrarM = false;
                                                break;
                                            default:
                                                System.out.println(MSJERROR);
                                                break;
                                        }
                                    }
                                }
                                break;
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
                                    boolean mostrarM = true;
                                    int opMostrar = 0;
                                    String fnac;
                                    while(mostrarM){
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
                                        System.out.println("-----------------------\nIngrese una opcion\n1 - Ordenar\n2 - Salir");
                                        opMostrar = entrada.nextInt();
                                        switch(opMostrar){
                                            case 1:
                                                ArrayList<Paciente> _pac = new ArrayList<Paciente>();
                                                _pac = Paciente.ordPaciente(pacientes);
                                                pacientes = _pac;
                                                break;
                                            case 2:
                                                mostrarM = false;
                                                break;
                                            default:
                                                System.out.println(MSJERROR);
                                                break;
                                        }
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
                                //Aqui se utilizan los metodos de ordenamiento de las clases
                                if(!medicina.isEmpty()){
                                    boolean mostrarM = true;
                                    int opMostrar = 0;
                                    while(mostrarM){
                                        System.out.println("Descripcion:\tID:");
                                        for(int i = 0; i < medicina.size(); i++){
                                            System.out.print(medicina.get(i).getDescripcion()+"\t\t");
                                            System.out.print(medicina.get(i).getIdMedicina()+"\n");
                                        }
                                        System.out.println("-----------------------\nIngrese una opcion\n1 - Ordenar\n2 - Salir");
                                        opMostrar = entrada.nextInt();
                                        switch(opMostrar){
                                            case 1:
                                                ArrayList<Medicina> _med = new ArrayList<Medicina>();
                                                _med = Medicina.ordMedicina(medicina);
                                                medicina = _med;
                                                break;
                                            case 2:
                                                mostrarM = false;
                                                break;
                                            default:
                                                System.out.println(MSJERROR);
                                                break;
                                        }
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
