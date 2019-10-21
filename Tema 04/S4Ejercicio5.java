/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio5 {
  public static void main(String[] args) {

    System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
    System.out.print("Por favor, introduce el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
