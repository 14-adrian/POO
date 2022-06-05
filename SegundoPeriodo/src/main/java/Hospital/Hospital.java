
package Hospital;
import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.text.ParseException;

/*Proyecto programacion orientada a objetos
Version: 1.0
Ultima modificacion: 04/06/2022
Modificacion: Finalizado
*/
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 *                  Sarahi Guadalupe Silva Molina
 */
public class Hospital {
    public static void main(String[] args){
        Ingresar ingresar = new Ingresar();
        String MSJERROR="Ingrese una opcion valida";
        int opMenu;
        //Listas
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        ArrayList<Medicina> medicina = new ArrayList<Medicina>();
        ArrayList<Personal> personal = new ArrayList<Personal>();
        Jefatura jefe;
        ArrayList<Medico> medicos = new ArrayList<Medico>();
        ArrayList<SolicitudCita> citas = new ArrayList<SolicitudCita>();
        ArrayList<SolicitudDonacion> citasD= new ArrayList<SolicitudDonacion>();
        //Id para agregar a los objetos
        int id = 1;
        boolean sMenu = true;
        
        //Menu
        while(sMenu){
            boolean sOpcion = true;
            String menu = ("-- Hospital El Salvador --"
                    + "\n1 - Medicos"
                    + "\n2 - Citas"
                    + "\n3 - Citas Donacion"
                    + "\n4 - Pacientes"
                    + "\n5 - Medicinas"
                    + "\n6 - Personal"
                    + "\n7 - Salir\n");
            
            opMenu = ingresar.opcion(menu);
            
            switch(opMenu){
                //Menu medicos
                case 1:
                    while(sOpcion){
                        String menuM = ("-- Medicos --"
                                + "\n1 - Agregar medico"
                                + "\n2 - Eliminar medico"
                                + "\n3 - Buscar medico"
                                + "\n4 - Mostrar medicos"
                                + "\n5 - Salir");
                        int opMedicos = ingresar.opcion(menuM);
                        switch(opMedicos){
                            //Agregar medico
                            case 1:
                                String nombre = ingresar.addNombre("Ingrese el nombre: ");
                                String especialidad = ingresar.addNombre("Ingrese la especialidad");
                                int idMed = ingresar.addID("Ingrese el numero de identificacion:");
                                String telefono = ingresar.addTelefono("Ingrese el numero de telefono(####-####):");
                                String correo = ingresar.addCorreo("Ingrese el correo:");
                                Date fecha = ingresar.addFecha("Ingrese la fecha de nacimiento(dd/mm/aaaa):");
                                String sexo = ingresar.addNombre("Ingrese el sexo: ");
                                
                                Medico _medico = new Medico(nombre, especialidad, idMed, telefono, correo, fecha, sexo);
                                medicos.add(_medico);
                                break;
                            //Eliminar medico
                            case 2:
                                if(!medicos.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        int idDel = ingresar.addID("Ingrese el numero de identificacion del medico que desea eliminar:");
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
                                        int idSrch = ingresar.addID("Ingrese el numero de DUI del paciente que desea buscar:");
                                        n = Medico.busquedaMedico(medicos, idSrch);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    medicos.get(n).leer();
                                }
                                break;
                            //Mostrar Medicos
                            case 4:
                                if(!medicos.isEmpty()){
                                    String formato = "|%12s|%12s|%12s|%12s|%24s|%18s|%12s|%n";
                                    String fnac;
                                    System.out.printf(formato,  "Nombre", "Especialidad", "IDMedico", "Telefono", "Correo", "Fecha Nacimiento", "Sexo");
                                    for(int i = 0; i < medicos.size(); i++){
                                        fnac = fechaFormato(medicos.get(i).getFNacimiento());
                                        System.out.printf(formato, medicos.get(i).getNombre()
                                                , medicos.get(i).getEspecialidad()
                                                , medicos.get(i).getIdMedico()
                                                ,  medicos.get(i).getTelefono()
                                                ,  medicos.get(i).getCorreo()
                                                , fnac, medicos.get(i).getSexo());
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
                        String menuC = ("-- Citas --"
                                + "\n1 - Nueva cita"
                                + "\n2 - Borrar cita"
                                + "\n3 - Buscar cita"
                                + "\n4 - Mostrar citas"
                                + "\n5 - Salir");
                        int opCitas = ingresar.opcion(menuC);
                        switch(opCitas){
                            //Nueva Cita
                            case 1:
                                if(!pacientes.isEmpty()){
                                    id++;
                                    String estado = ingresar.addNombre("Ingrese el estado: ");
                                    Date fecha = ingresar.addFecha("ingrese la fecha de la cita");
                                    String medico = ingresar.addNombre("Ingrese el nombre del medico asignado:");
                                    String tipo = ingresar.addNombre("Ingrese el tipo de consulta: ");
                                    boolean cons = true;
                                    int n = -1;
                                    while(cons){
                                        int duiPac = ingresar.addDUI("Ingrese el numero de DUI del paciente:");
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
                                    int idDel = ingresar.addID("Ingrese el numero de identificacion de la cita que desea eliminar:");
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
                                        int idSrch = ingresar.addID("Ingrese el numero de identificacion de la cita que desea buscar:");
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
                                        String menuMostrar = ("-----------------------\n1 - Ordenar\n2 - Salir");
                                        opMostrar = ingresar.opcion(menuMostrar);
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
                case 3:
                    while (sOpcion) {
                        String menuC = ("-- Citas de Donacion --"
                                + "\n1 - Nueva cita"
                                + "\n2 - Borrar cita"
                                + "\n3 - Buscar cita"
                                + "\n4 - Mostrar citas"
                                + "\n5 - Salir");
                        int opCitas = ingresar.opcion(menuC);
                        switch (opCitas) {
                            //Nueva Cita
                            case 1:
                                    id++;
                                    int idD = ingresar.addID("Ingrese el id de la cita: ");
                                    String estado = ingresar.addNombre("Ingrese el estado: ");
                                    Date fecha = ingresar.addFecha("ingrese la fecha de la cita");
                                    String donante = ingresar.addNombre("Ingrese el nombre del donante:");
                                    int dui = ingresar.addDUI("Ingrese el DUI del donante");

                                    SolicitudDonacion _citasD = new SolicitudDonacion(id, estado, fecha, donante, dui);
                                    citasD.add(_citasD);
                                break;
                            //Eliminar cita
                            case 2:
                                if (!citas.isEmpty()) {
                                    boolean borrando = true;
                                    int n = -1;
                                    while (borrando) {
                                        int idDel = ingresar.addID("Ingrese el numero de identificacion de la cita que desea eliminar:");
                                        n = SolicitudDonacion.busquedaCita(citasD, idDel);
                                        if (n == -1) {
                                            System.out.println("El id de la cita no existe, por favor ingrese un id correcto!");
                                        } else {
                                            borrando = false;
                                        }
                                    }
                                    citasD.remove(n);
                                    System.out.println("Datos eliminados!");
                                } else {
                                    System.out.println("No existen datos para eliminar");
                                }
                                break;
                            //Buscar cita
                            case 3:
                                if (!citasD.isEmpty()) {
                                    boolean buscando = true;
                                    int n = -1;
                                    while (buscando) {
                                        int idSrch = ingresar.addID("Ingrese el numero de identificacion de la cita que desea buscar:");
                                        n = SolicitudDonacion.busquedaCita(citasD, idSrch);
                                        if (n == -1) {
                                            System.out.println("La cita no existe, por favor ingrese un numero de identificacion correcto!");
                                        } else {
                                            buscando = false;
                                        }
                                    }
                                    String f;
                                    System.out.println("ID::\t\tEstado:\tFecha:\tDonante:\tDUI:");
                                    System.out.print(citasD.get(n).getIdSolicitud() + "\t");
                                    System.out.print(citasD.get(n).getEstado() + "\t\t");
                                    f = fechaFormato(citasD.get(n).getFecha());
                                    System.out.print(f + "\t\t");
                                    System.out.print(citasD.get(n).getDonante() + "\t\t");
                                    System.out.print(citasD.get(n).getDUI() + "\t\t");

                                } else {
                                    System.out.println("No existen datos para buscar");
                                }
                                break;
                            //Mostrar cita
                            case 4:
                                if (!citasD.isEmpty()) {
                                    boolean mostrarM = true;
                                    String f;
                                    while (mostrarM) {
                                        System.out.println("ID::\t\tEstado:\tFecha:\tDonante:\tDUI:");
                                        for (int i = 0; i < citasD.size(); i++) {
                                            System.out.print(citasD.get(i).getEstado() + "\t\t");
                                            f = fechaFormato(citasD.get(i).getFecha());
                                            System.out.print(f + "\t\t");
                                            System.out.print(citasD.get(i).getDonante() + "\t\t");
                                            System.out.print(citasD.get(i).getDUI() + "\n");
                                        }
                                        break;
                                       
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
                case 4:
                    while(sOpcion){
                        String menuP = ("-- Pacientes --"
                                + "\n1 - Agregar paciente"
                                + "\n2 - Borrar paciente"
                                + "\n3 - Buscar paciente"
                                + "\n4 - Mostrar pacientes"
                                + "\n5 - Salir");
                        int opPacientes = ingresar.opcion(menuP);
                        switch(opPacientes){
                            //Agregar Pacientes
                            case 1:
                                String nombre = ingresar.addNombre("Ingrese el nombre: ");
                                String apellido = ingresar.addNombre("Ingrese el apellido");
                                int dui = ingresar.addDUI("Ingrese el numero de DUI: ");
                                String telefono = ingresar.addTelefono("Ingrese el numero de telefono;");
                                String correo = ingresar.addCorreo("Ingrese el correo:");
                                Date fecha = ingresar.addFecha("Ingrese la fecha de nacimiento(dd/mm/aaaa):");
                                String sexo = ingresar.addNombre("Ingrese el sexo; ");
                                
                                Paciente _paciente = new Paciente(nombre, apellido, dui, telefono, correo, fecha, sexo);
                                pacientes.add(_paciente);
                                break;
                            //Eliminar paciente
                            case 2:
                                if(!pacientes.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        int duiDel = ingresar.addDUI("Ingrese el numero de DUI del paciente que desea eliminar:");
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
                                        int duiSrch = ingresar.addDUI("Ingrese el numero de DUI del paciente que desea buscar:");
                                        n = Paciente.busquedaPaciente(pacientes, duiSrch);
                                        if(n == -1)System.out.println("El producto no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    pacientes.get(n).leer();
                                    
                                }
                                else System.out.println("No existen datos para buscar");
                                break;
                            //Mostrar Pacientes
                            case 4:
                                if(!pacientes.isEmpty()){
                                    String formato = "|%12s|%12s|%12s|%12s|%12s|%18s|%12s|%n";
                                    boolean mostrarM = true;
                                    int opMostrar = 0;
                                    String fnac;
                                    while(mostrarM){
                                        System.out.printf(formato, "Nombre", "Apellido", "DUI", "Telefono", "Correo", "Fecha Nacimiento", "Sexo");
                                        
                                        for(int i = 0; i < pacientes.size(); i++){
                                            fnac = fechaFormato(pacientes.get(i).getFNacimiento());
                                            System.out.printf(formato, pacientes.get(i).getNombre()
                                                    , pacientes.get(i).getApellido()
                                                    , pacientes.get(i).getDUI()
                                                    , pacientes.get(i).getTelefono()
                                                    , pacientes.get(i).getCorreo()
                                                    , fnac, pacientes.get(i).getSexo());
                                            
                                        }
                                        String menuMostrar = ("-----------------------\n1 - Ordenar\n2 - Salir");
                                        opMostrar = ingresar.opcion(menuMostrar);
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
                case 5:
                    while(sOpcion){
                        String menuMM = ("-- Medicina --"
                                + "\n1 - Agregar medicina"
                                + "\n2 - Borrar medicina"
                                + "\n3 - Buscar medicina"
                                + "\n4 - Mostrar medicinas"
                                + "\n5 - Salir");
                        int opMedicina = ingresar.opcion(menuMM);
                        switch(opMedicina){
                            //Agregar Medicina
                            case 1:
                                String descripcion = ingresar.addNombre("Ingrese la descripcion: ");
                                int idMed = ingresar.addID("Ingrese el numero de identificacion: ");
                                Medicina medic = new Medicina(descripcion, idMed);
                                medicina.add(medic);
                                break;
                            //Eliminar medicina
                            case 2:
                                if(!medicina.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        int idDel = ingresar.addID("Ingrese el numero de identificacion del producto que desea eliminar:");
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
                                        int idSrch = ingresar.addID("Ingrese el numero de identificacion del producto que desea buscar:");
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
                                        String menuMostrar = ("-----------------------\n1 - Ordenar\n2 - Salir");
                                        opMostrar = ingresar.opcion(menuMostrar);
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
                //Menu Empleados
                case 6:
                    while(sOpcion){
                        String menuPer = ("-- Personal --"
                                + "\n1 - Agregar empleado"
                                + "\n2 - Eliminar empleado"
                                + "\n3 - Buscar empleado"
                                + "\n4 - Mostrar empleados"
                                + "\n5 - Ascender empleado"
                                + "\n6 - Salir");
                        int opEmp = ingresar.opcion(menuPer);
                        switch(opEmp){
                            //Agregar Empleado
                            case 1:
                                String nombre = ingresar.addNombre("Ingrese el nombre: "); //Nombre
                                int idEmp = ingresar.addID("Ingrese el numero de identificacion"); //ID
                                String telefono = ingresar.addTelefono("Ingrese el numero de telefono: "); //Telefono
                                String correo = ingresar.addCorreo("Ingrese el correo :"); //Correo
                                Date fecha = ingresar.addFecha("Ingrese la fecha de nacimiento(dd/mm/aaaa):"); //Fecha nacimiento
                                String sexo = ingresar.addNombre("Ingrese el sexo: "); //Sexo
                                float sueldo = ingresar.addDecimal("Ingrese el sueldo: "); //Sueldo
                                int dui = ingresar.addDUI("Ingrese el numero de DUI: "); //DUI
                                String cargo = ingresar.addNombre("Ingrese el cargo: "); //Cargo
                                
                                Personal _empleado = new Jefatura(nombre, idEmp, telefono, correo, fecha, sexo, sueldo, dui, cargo);
                                personal.add(_empleado);
                                break;
                            //Eliminar empleado
                            case 2:
                                if(!personal.isEmpty()){
                                    boolean borrando = true;
                                    int n = -1;
                                    while(borrando){
                                        int idDel = ingresar.addID("Ingrese el numero de identificacion del empleado:");
                                        n = Personal.busqueda(personal, idDel);
                                        if(n == -1)System.out.println("El empleado no existe, ingrese un numero de identificacion correcto correcto!");
                                        else borrando = false;
                                    }
                                    personal.remove(n);
                                    System.out.println("Datos eliminados!");
                                }
                                else System.out.println("No existen datos para eliminar");
                                break;
                            //Buscar personal
                            case 3:
                                if(!personal.isEmpty()){
                                    boolean buscando = true;
                                    int n = -1;
                                    while(buscando){
                                        int idSrch = ingresar.addID("Ingrese el numero de identificacion del empleado que desea buscar:");
                                        n = Personal.busqueda(personal, idSrch);
                                        if(n == -1)System.out.println("El empleado no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    personal.get(n).leer();
                                }
                                break;
                            //Mostrar personal
                            case 4:
                                if(!personal.isEmpty()){
                                    String fnac;
                                    String formato = "|%12s|%12s|%12s|%24s|%18s|%12s|%12s|%12s|%12s|%n";
                                    System.out.printf(formato,  "Nombre", "ID", "Telefono", "Correo", "Fecha Nacimiento", "Sexo", "Sueldo", "DUI", "Cargo");
                                    for(int i = 0; i < personal.size(); i++){
                                        fnac = fechaFormato(personal.get(i).getFNacimiento());
                                        System.out.printf(formato, personal.get(i).getNombre()
                                                , personal.get(i).getId()
                                                ,  personal.get(i).getTelefono()
                                                ,  personal.get(i).getCorreo()
                                                , fnac, personal.get(i).getSexo()
                                                , personal.get(i).getSueldo()
                                                , personal.get(i).getDUI()
                                                , personal.get(i).getCargo());
                                    }
                                }
                                break;
                            //Ascender
                            case 5:
                                if(!personal.isEmpty()){
                                    boolean buscando = true;
                                    int n = -1;
                                    while(buscando){
                                        int idSrch = ingresar.addID("Ingrese el numero de identificacion del empleado que desea ascender:");
                                        n = Personal.busqueda(personal, idSrch);
                                        if(n == -1)System.out.println("El empleado no existe, por favor ingrese un numero de identificacion correcto!");
                                        else buscando = false;
                                    }
                                    jefe = (Jefatura) personal.get(n);
                                    personal.get(n).setCargo("Jefatura");
                                }
                                break;
                            //Salir
                            case 6:
                                sOpcion = false;
                                break;
                            default:
                                System.out.println(MSJERROR);
                                break;    
                        }
                    }
                    break;
                case 7:
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
 // Metodo temporal para ejemplificacion
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
