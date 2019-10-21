
public class S4Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String dias = System.console().readLine();

    int dia = 0;

    switch(dias) {
      case "lunes":
        dia = 0;
        break;
      case "martes":
        dia = 1;
        break;
      case "miércoles":
      case "miercoles":
        dia = 2;
        break;
      case "jueves":
        dia = 3;
        break;
      case "viernes":
        dia = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosTotales = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (dia * 24 * 60) + (horas * 60) + minutos;
    
    System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
  }
}
