/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("En este programa vamos a calcular el cuadrado y el cubo de los 5 siguientes números del número introducido por teclado");
    System.out.print("Por favor, introduzca un número: ");
    int numero  = Integer.parseInt(System.console().readLine());
    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%6d %6d %6d\n", i, i * i, i * i * i);
    }
  }
}
