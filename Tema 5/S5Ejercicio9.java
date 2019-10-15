/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("En este programa te voy a decir los dígitos que tiene un número introducido por teclado ");
    long numero;
    long numeroDigitos = 0;
    
    System.out.print("Por favor, introduzca un número: ");
    numero = Long.parseLong(System.console().readLine());  
   
   long numeroCon = numero;
    do {
      numero /= 10;
      numeroDigitos++;
    } while (numero > 0);
    
    System.out.println(numeroCon + " tiene " + numeroDigitos + " dígitos.");
  }
}

