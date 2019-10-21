/**
 * Ejercicios Java Tema 5
 *
 * @author Alejandro Robles Gibaja
 */
public class S5Ejercicio19 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter de la pirámide: ");
    String caracter = (System.console().readLine());
    
    int caracteresPorFila = 1;
    int espaciosDelanteros = altura - 1;
    
      for (int i = 0; i < altura; i++) {
        //Espacios delanteros cada fila
        for (int j = 0; j < espaciosDelanteros; j++) {
        System.out.print(" ");
        }
        //Pinta los caracteres de la fila
        for (int j = 0; j < caracteresPorFila; j++) {
        System.out.print(caracter);
        }
        System.out.println();
      
        caracteresPorFila +=2;
        espaciosDelanteros --;
    }
  }
}
