/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio14 {
  public static void main(String[] args) {

     System.out.print("Por favor, introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());

    if ((numero % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((numero % 5) == 0) {
      System.out.println(" y divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
