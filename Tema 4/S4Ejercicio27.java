/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio27 {
  public static void main(String[] args) {

    System.out.print("¿De qué sabor quiere la tarta? (manzana, fresa, chocolate): ");
    String sabor = System.console().readLine();
    
    int precioSabor = 0;
    
    switch(sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
        System.out.print("¿La quiere de chocolate blanco o negro?: ");
        String saborChocolate = System.console().readLine();
        if (saborChocolate.equals("blanco")) {
        precioSabor = 15;
        }  
        if (saborChocolate.equals("negro")) {
        precioSabor = 14;
        }
        break;
      default:
        System.out.println("El sabor introducido no es correcto.");
    }
    
    double suplemento = 0;
    
    System.out.print("¿Quiere nata montada? (si/no): ");
        String nataMontada = System.console().readLine();
        if (nataMontada.equals("si")) {
        suplemento = 2.5;
        }  
        if (nataMontada.equals("no")) {
        suplemento = 0;
        }
     
    double segundoSuplemento = 0;
    
    System.out.print("¿Quiere personalizarla con su nombre ? (si/no): ");
        String nombre = System.console().readLine();
        if (nombre.equals("si")) {
        segundoSuplemento = 2.75;
        }  
        if (nataMontada.equals("no")) {
        segundoSuplemento = 0;
        }    
    
    double total = precioSabor + suplemento + segundoSuplemento;
    
    System.out.println("Tarta de " + sabor + "     " + precioSabor + " €");
    System.out.printf("Nata Montada        %6.2f €\n", suplemento);
    System.out.printf("Nombre              %6.2f €\n", segundoSuplemento);
    System.out.printf("TOTAL                %6.2f €", total);
  }
}
