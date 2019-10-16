/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("En este programa vamos a mostrar por pantalla los números existentes de 7 en 7 entre dos números introducidos por teclado ");
    
    
    int numero = 0;
    int segundoNumero = 0;


    System.out.print("Introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());
      
    System.out.print("Introduzca otro número: ");
    segundoNumero = Integer.parseInt(System.console().readLine());
    
    if (numero == segundoNumero) {
      System.out.print("No existen números entre los números introducidos");
    }  
    
    for(int i = numero; i < segundoNumero; i+=7) {
      System.out.print( i + " ");
    }


  }
}
