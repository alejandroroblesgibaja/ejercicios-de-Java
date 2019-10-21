/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("En este programa vamos a calcular la media de numeros introducidos por teclado");
    double numero = 0;
    double numerosIntroducidos = 0;
    double suma = 0;
    
    
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      numerosIntroducidos ++;
      suma += numero;
    } while (numero >= 0);
      suma -= numero;
      numerosIntroducidos --;
      double media = (suma / numerosIntroducidos);
      System.out.println("La media de los números introducidos es " + media);
  }
}
