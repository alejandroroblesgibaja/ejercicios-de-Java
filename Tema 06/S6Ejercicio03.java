/**
 * Ejercicios Java Tema 6
 *
 * @author Alejandro Robles Gibaja
 */
public class S6Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.println("En este programa diremos una carta al azar de la baraja española: ");
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    
    switch(numeroPalo) {
      case 1:
        palo = "bastos";
        break;
      case 2:
        palo = "espadas";
        break;
      case 3:
        palo = "oros";
        break;
      case 4:
        palo = "copas";
      default:
    }

    int numeroCarta = (int)(Math.random()*10) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
}
