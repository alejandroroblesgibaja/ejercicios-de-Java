/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio69 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int caracteresPorFila = 1;
    int espaciosDelanteros = altura - 1;
    
    for (int i = 0; i < altura; i++) {
        //Espacios delanteros cada fila
      for (int j = 0; j < espaciosDelanteros; j++) {
        System.out.print(" ");
      }
      //Pinta el flanco izquierdo 
      for (int j = 0; j < caracteresPorFila; j++) {
        System.out.print("*");
      }
        
      //Pinta la parte central
      if (i % 2 == 0) { //cuando i es par
        System.out.print("****");
      } else {
        System.out.print("    ");
      }
        
      //Pinta el flanco derecho 
      for (int j = 0; j < caracteresPorFila; j++) {
        System.out.print("*");
      }
      System.out.println();
      
      caracteresPorFila ++;
      espaciosDelanteros --;
    }
  }
}
