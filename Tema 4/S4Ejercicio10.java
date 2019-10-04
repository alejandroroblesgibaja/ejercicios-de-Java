/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio10 {
  public static void main(String[] args) {

    String dia;

    System.out.println("Por favor, introduzca el número de mes (1-12) ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Por favor, introduzca el número de día (1-31) ");
    int numeroSegundo = Integer.parseInt(System.console().readLine());
    
    switch(numero) {
      case 1:
        if ((numeroSegundo <= 19) && (numeroSegundo > 0)) {
          System.out.println("Su signo zodiaco es Capricornio");
        } 
        if ((numeroSegundo >= 20) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Acuario");
        } 
      break;  
      case 2:
        if ((numeroSegundo > 0) && (numeroSegundo <= 18)) {
          System.out.println("Su signo zodiaco es Acuario");
        } 
        if ((numeroSegundo >= 19) && (numeroSegundo <= 29)) {
          System.out.println("Su signo zodiaco es Piscis");
        } 
      break;
      case 3:
        if ((numeroSegundo > 0) && (numeroSegundo <= 20)) {
          System.out.println("Su signo zodiaco es Piscis");
        } 
        if ((numeroSegundo >= 21) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Aries");
        } 
      break;
      case 4:
        if ((numeroSegundo > 0) && (numeroSegundo <= 20)) {
          System.out.println("Su signo zodiaco es Aries");
        } 
        if ((numeroSegundo >= 21) && (numeroSegundo <= 30)) {
          System.out.println("Su signo zodiaco es Tauro ");
        } 
      break;
      case 5:
        if ((numeroSegundo > 0) && (numeroSegundo <= 20)) {
          System.out.println("Su signo zodiaco es Tauro");
        } 
        if ((numeroSegundo >= 21) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Géminis");
        } 
      break;
      case 6:
        if ((numeroSegundo > 0) && (numeroSegundo <= 20)) {
          System.out.println("Su signo zodiaco es Géminis");
        } 
        if ((numeroSegundo >= 21) && (numeroSegundo <= 30)) {
          System.out.println("Su signo zodiaco es Cáncer");
        } 
      break;
      case 7:
        if ((numeroSegundo > 0) && (numeroSegundo <= 20)) {
          System.out.println("Su signo zodiaco es Cáncer");
        } 
        if ((numeroSegundo >= 21) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Leo");
        } 
      break;
      case 8:
        if ((numeroSegundo > 0) && (numeroSegundo <= 21)) {
          System.out.println("Su signo zodiaco es Leo");
        } 
        if ((numeroSegundo >= 22) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Virgo");
        } 
      break;
      case 9: 
        if ((numeroSegundo > 0) && (numeroSegundo <= 22)) {
          System.out.println("Su signo zodiaco es Virgo");
        } 
        if ((numeroSegundo >= 23) && (numeroSegundo <= 30)) {
          System.out.println("Su signo zodiaco es Libra");
        } 
      break;
      case 10:
        if ((numeroSegundo > 0) && (numeroSegundo <= 22)) {
          System.out.println("Su signo zodiaco es Libra");
        } 
        if ((numeroSegundo >= 23) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Escorpio");
        } 
      case 11:
        if ((numeroSegundo > 0) && (numeroSegundo <= 22)) {
          System.out.println("Su signo zodiaco es Escorpio");
        } 
        if ((numeroSegundo >= 23) && (numeroSegundo <= 30)) {
          System.out.println("Su signo zodiaco es Sagitario");
        } 
      break;
      case 12:
        if ((numeroSegundo > 0) && (numeroSegundo <= 20)) {
          System.out.println("Su signo zodiaco es Sagitario");
        } 
        if ((numeroSegundo >= 21) && (numeroSegundo <= 31)) {
          System.out.println("Su signo zodiaco es Capricornio");
        } 
      break;
    }
  }
}
