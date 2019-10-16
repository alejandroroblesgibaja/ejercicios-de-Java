/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio17 {
  public static void main(String[] args) {
    int numero = 0;
    

      System.out.print("Introduzca un número entero positivo: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if(numero < 0) {
        System.out.println("El número introducido no es positivo");
      }

    int suma = 0;
    
    for(int i = numero; i < numero + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);
  }
}
