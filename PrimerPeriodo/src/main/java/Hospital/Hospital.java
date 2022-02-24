
package Hospital;
import java.util.*;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Hospital {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean sMenu = true;
        while(sMenu){
            boolean sOpcion = true;
            System.out.println("-- Hospital El Salvador --\nIngrese una opicion:"
                    + "\n1 - Citas"
                    + "\n2 - Medicos"
                    + "\n3 - Pacientes"
                    + "\n4 - Medicinas"
                    + "\n5 - Salir");
            int opMenu = entrada.nextInt();
            
            switch(opMenu){
                case 1:
                    while(sOpcion){
                        System.out.println("-- Citas --\nIngrese una opicion:"
                                + "\n1 - Nueva cita"
                                + "\n2 - Editar datos cita"
                                + "\n3 - Borrar cita"
                                + "\n4 - Buscar cita"
                                + "\n5 - Mostrar citas"
                                + "\n6 - Salir");
                        int opCitas = entrada.nextInt();
                        switch(opCitas){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;    
                        }
                    }
                    break;
                case 2:
                    while(sOpcion){
                        System.out.println("-- Medicos --\nIngrese una opicion:"
                                + "\n1 - Agregar medico"
                                + "\n2 - Editar datos medico"
                                + "\n3 - Eliminar edico"
                                + "\n4 - Buscar medico"
                                + "\n5 - Mostrar medicos"
                                + "\n6 - Salir");
                        int opMedicos = entrada.nextInt();
                        switch(opMedicos){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;    
                        }
                    }
                    break;
                case 3:
                    while(sOpcion){
                        System.out.println("-- Pacientes --\nIngrese una opicion:"
                                + "\n1 - Agregar paciente"
                                + "\n2 - Editar datos paciente"
                                + "\n3 - Borrar paciente"
                                + "\n4 - Buscar paciente"
                                + "\n5 - Mostrar pacientes"
                                + "\n6 - Salir");
                        int opPacientes = entrada.nextInt();
                        switch(opPacientes){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }
                    break;
                case 4:
                    while(sOpcion){
                        System.out.println("-- Medicina --\nIngrese una opicion:"
                                + "\n1 - Agregar medicina"
                                + "\n2 - Editar medicina"
                                + "\n3 - Borrar medicina"
                                + "\n4 - Buscar medicina"
                                + "\n5 - Mostrar medicinas"
                                + "\n6 - Salir");
                        int opMedicina = entrada.nextInt();
                        switch(opMedicina){
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Adios");
                    sMenu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
