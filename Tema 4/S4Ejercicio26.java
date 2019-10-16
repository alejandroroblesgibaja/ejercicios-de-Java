/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio26 {
  public static void main(String[] args) {

    System.out.print("Venta de entradas CineCampa");

    System.out.print("Número de entradas: ");
    int entradas = Integer.parseInt(System.console().readLine());

    System.out.print("Por favor, introduzca el día de la semana que irá al cie (lunes, martes...): ");
    String dia = System.console().readLine();

    System.out.print("¿Tiene tarjeta CineCampa? (si/no): ");
    boolean tieneTarjeta = System.console().readLine().equalsIgnoreCase("si");
    
    double precioBase = 8;
    
    if (dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("miércoles")){
      precioBase = 5;
    }
    
    int entradasParejas = 0;
    int entradasIndividuales = entradas;
    double total = 0;
    
    if (dia.equalsIgnoreCase("jueves")) {
      entradasParejas = entradas / 2;
      entradasIndividuales = entradas % 2;
    }
    
    System.out.println("Aquí tiene sus entradas. gracias por su compra");
    if (entradasParejas > 0) {
      System.out.printf("Entradas parejas  %4d\n", entradasParejas);
      System.out.printf("Precio unitario   %4.2f €\n", 11.0);
      total += entradasParejas * 11;
    }  
    
    if (entradasIndividuales > 0) {
    System.out.printf("Entradas individuales         %4d\n", entradasIndividuales);
    total += entradasIndividuales * precioBase;
    System.out.printf("Precio unitario            %4.2f €\n", precioBase);
  }
    
    System.out.printf("Total             %4.2f €\n", total);
    
    double descuento = 0;
    if (tieneTarjeta) {
      descuento = total * 0.1;
    }
    
    System.out.printf("Descuento         %4.2f €\n", descuento);
    System.out.printf("A pagar           %4.2f €\n", total - descuento);
  }
}    
