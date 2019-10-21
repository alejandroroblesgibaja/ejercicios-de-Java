/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio1 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Por favor, introduce un día de la semana y te diré qué asignatura tienes a primera hora: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase();
    
    switch(dia) {
      case "lunes":
        System.out.println("Programación");
        break;
      case "martes":
        System.out.println("Entornos de Desarrollo");
        break;
      case "miércoles":
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Sistemas Informáticos");
        break;
      case "sábado":
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día introducido no es correcto.");
    }
  }
}
