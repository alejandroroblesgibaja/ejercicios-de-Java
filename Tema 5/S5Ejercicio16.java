/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio16 {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero y te diré si es primo: ");
    int numero = Integer.parseInt(System.console().readLine());

    boolean primo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

  }
}
