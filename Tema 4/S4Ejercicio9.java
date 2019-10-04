/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio9 {
  public static void main(String[] args) {

    System.out.println("Este programa resuelve ecuaciones del tipo ax² + bx + c = 0");
    System.out.print("Por favor, introduce el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double raiz; 
    raiz = ((b * b) -4 * a * c);
    if (raiz < 0) {
      System.out.println("Esta ecuación no tiene solución real");
    }
    if ((raiz > 0) && (a != 0)) {
      System.out.printf("x = %.3f\n", (-b + (Math.sqrt(raiz)) / (2 * a)));
      System.out.printf("x = %.3f\n", (-b - (Math.sqrt(raiz)) / (2 * a)));
    }
    if (a == 0) {
      System.out.println("x = " + (-c/b));
    }
  }
}
