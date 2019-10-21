/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (n % 10));
  }
}
