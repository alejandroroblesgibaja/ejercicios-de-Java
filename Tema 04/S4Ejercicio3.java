/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio3 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introduzca un número del 1 al 7: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    switch(numero) {
      case 1:
        dia = "Lunes";
        break;
      case 2:
        dia = "Martes";
        break;
      case 3:
        dia = "Miércoles";
        break;
      case 4:
        dia = "Jueves";
        break;
      case 5:
        dia = "Viernes";
        break;
      case 6:
        dia = "Sábado";
        break;
      case 7:
        dia = "Domingo";
        break;
      default:
        dia = "Debe introducir un número del 1 al 7";
    }
    
    System.out.println(dia);

  }
}
