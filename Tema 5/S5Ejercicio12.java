/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio12 {
  public static void main(String[] args) {
System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int numero = Integer.parseInt(System.console().readLine());

    switch (numero) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int fibo1 = 0;
        int fibo2 = 1;
        int aux;
        while(numero > 2) {
            aux = fibo1;
            fibo1 = fibo2;
            fibo2 = aux + fibo2;
            System.out.print(" " + fibo2);
            numero--;
        }
    }
    System.out.println();
  }
}
