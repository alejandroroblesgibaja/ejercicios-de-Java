/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */

public class S5Ejercicio15 {

  public static void main(String[] args) {
  
    System.out.print("Introduzca un número real como base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    int potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

  }
}
