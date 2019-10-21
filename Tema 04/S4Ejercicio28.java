/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio28 {
  public static void main(String[] args) {

    System.out.print("Turno del jugador 1 (introuzca piedra, papel o tijera): ");
    String primerTurno = System.console().readLine();
    
    System.out.print("Turno del jugador 2 (introuzca piedra, papel o tijera): ");
    String segundoTurno = System.console().readLine();
    
    if ((primerTurno.equals("piedra")) && (segundoTurno.equals("piedra"))) {
        System.out.print("Empate");
        }  
    if ((primerTurno.equals("tijera")) && (segundoTurno.equals("tijera"))) {
        System.out.print("Empate");
        }  
    if ((primerTurno.equals("papel")) && (segundoTurno.equals("papel"))) {
        System.out.print("Empate");
        }
    if ((primerTurno.equals("piedra")) && (segundoTurno.equals("tijera"))) {
        System.out.print("Gana Jugador 1");
        }  
    if ((primerTurno.equals("tijera")) && (segundoTurno.equals("piedra"))) {
        System.out.print("Gana Jugador 2");
        }  
    if ((primerTurno.equals("papel")) && (segundoTurno.equals("piedra"))) {
        System.out.print("Gana Jugador 1");
        }
    if ((primerTurno.equals("piedra")) && (segundoTurno.equals("papel"))) {
        System.out.print("Gana Jugador 2");
        }  
    if ((primerTurno.equals("papel")) && (segundoTurno.equals("tijera"))) {
        System.out.print("Gana Jugador 2");
        }  
    if ((primerTurno.equals("tijera")) && (segundoTurno.equals("papel"))) {
        System.out.print("Gana Jugador 1");
        }                        
  }
}
