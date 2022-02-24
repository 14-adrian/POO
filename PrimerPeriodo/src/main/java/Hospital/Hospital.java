
package Hospital;
import java.util.*;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Hospital {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean salir = true;
        while(salir){
            System.out.println("Hospotal El Salvador\nIngrese una opicion:"
                    + "\n1 - Citas"
                    + "\n2 - Medicos"
                    + "\n3 - Pacientes"
                    + "\n4 - Medicinas"
                    + "\n5 - Salir");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Hola");
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
