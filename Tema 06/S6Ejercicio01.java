/**
 * Ejercicios Java Tema 6
 *
 * @author Alejandro Robles Gibaja
 */
public class S6Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.println("Tirada aleatoria de tres dados");
    int tirada;
    int suma = 0;
    
    
    for (int k = 0; k < 3; k++) { 
      tirada = (int) (Math.random() * 6) + 1;
      System.out.println(tirada + " ");
      suma += tirada;
    }
    
    System.out.println("Suma total " + suma);
  }
}
