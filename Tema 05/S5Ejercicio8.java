/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("En este programa vamos a mostrar la tabla de multiplicar de un número");
    
    int numero;
    System.out.print("Introduzca el número: ");
    numero = Integer.parseInt(System.console().readLine());
      
for (int i = 0; i <= 10; i++) {
      System.out.println(numero + " * " + i + " = " + (numero * i));
    }
  }
}
