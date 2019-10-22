/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("En este programa, después de introducir 10 números te dirá cuantos son postivoys y cuantos negativos");
    int numero = 0;
    int numerosIntroducidos = 0;
    int positivo = 0;
    int negativo = 0;
    
    
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      numerosIntroducidos ++;
      if (numero > 0) {
        positivo++;
      } else {
        negativo++;
      }  
    } while (numerosIntroducidos < 10);
      
      System.out.println("Has introducido " + positivo + " números positivos y " + negativo + " números negativos");
  }
}
