/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Por favor, introduzca la hora (1-23) ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Por favor, introduzca los minutos (1-59) ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", hora, minuto, segundosHastaMedianoche);
  }
}
