/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca la anchura de la bandera en cm: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    double area = (altura * anchura);
    
    double precioBase = area * 0.01;

    System.out.println("¿Quiere escudo bordado (si/no): ");
    String escudo = System.console().readLine();
    
    double precioEscudo = 0;
    double gastosEnvio = 3.25;
    double total = precioEscudo + gastosEnvio + precioBase;
    
    switch(escudo) {
      case "si":
        precioEscudo = 2.5;
        break;
      case "no":
        precioEscudo = 0;
        break;
      default:
        System.out.println("El tipo de escudo bordado introducido no es correcto.");
       }
    
    System.out.println("La altura de la bandera es de " + altura + " cm");
    System.out.println("La anchura de la bandera es de " + anchura + " cm");
    System.out.println("El precio del escudo es " + precioEscudo + " €");
    System.out.println("El precio de la bandera es " + precioBase + " €");
    System.out.println("El precio de gastos de envío es " + gastosEnvio + " €");
    System.out.println("El precio total es " + total + " €");
  }
}
