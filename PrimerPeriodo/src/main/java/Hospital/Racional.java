
package Hospital;

/**
 *
 * @author Sarahi Guadalupe Silva Molina
 *         Leonidas Adrian Mendoza Flores
 */
public class Racional { //creamos una clase llamada Racional e implementamos la interface "Comparador"
    
      private int num; //definimos el tipo de la variable
    private int den;   //definimos el tipo de la variable
    
    public Racional() //
    {
        num=0;  //asignamos el valor del numerador 
        den=1;  //asignamos el valor del numerador  
    }    
    
    public Racional(int n, int d)
    {
        num=n; //asignamos el valor del numerador
        den=d; //asignamos el valor del numerador
    }
    
    public double toDouble()
    {
         return num/den; //retornamos un valor de tippo Double
    }

    @Override
    public String toString()
    {
        return this.num + "/"+this.den; //convertimos a tipo String
    }
    
    @Override //comparador igual que
    public boolean igualQue(Object o) {
        Racional n = (Racional) o;
        return this.toDouble() == n.toDouble();
    }

    @Override //comparador menor o igual que
    public boolean menorIgual(Object o) {
        Racional n = (Racional) o;
        return this.toDouble() <= n.toDouble();  
    }

    @Override //comparador menor que
    public boolean menorQue(Object o) {
        Racional n = (Racional) o;
        return this.toDouble() < n.toDouble();
    }

    @Override //comparador mayor o igual que
    public boolean mayorIgual(Object o) {
        Racional n = (Racional) o;
        return this.toDouble() >= n.toDouble();
    }

    @Override //comparador mayor que 
    public boolean mayorQue(Object o) {
        Racional n = (Racional) o;
        return this.toDouble() > n.toDouble();
    }
    
}

    
}
