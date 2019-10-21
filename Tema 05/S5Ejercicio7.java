/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio7 {
  public static void main(String[] args) {
    System.out.println("En este programa puedes abrir una caja fuerte. Tienes cuatro intentos");
      int codigo = 5487;
      int intentos = 4;
      int opcion = 0;
      
    do {
      System.out.print("Por favor, introduzca el código de la caja fuerte (4 números): ");
      opcion = Integer.parseInt(System.console().readLine());
      intentos --;
    } while (intentos >0 && codigo != opcion);
    
    if (opcion == codigo) {
      System.out.print("Enhorabuena, has abierto la caja fuerte");
    } else {
      System.out.print("Lo siento, has agotado todas las oportunidades");
    }  
  }
}
