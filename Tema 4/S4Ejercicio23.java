/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio23 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
    
    // Calcula el IVA y el precio antes del descuento
    
    int tipoIVAD = 0;
    
    switch(tipoIVA) {
      case "general":
        tipoIVAD = 21;
        break;
      case "reducido":
        tipoIVAD = 10;
        break;
      case "superreducido":
        tipoIVAD = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto.");
    }
    
    double iva = baseImponible * tipoIVAD / 100;
    double precio = baseImponible + iva;
    
    double descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad": 
        descuento = precio / 2;
        break;
      case "meno5": 
        descuento = 5;
        break;
      case "5porc": 
        descuento = precio * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
    
    double total = precio - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoIVAD, iva);
    System.out.printf("Precio con IVA       %6.2f\n", precio);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigoPromocional, descuento);
    System.out.printf("TOTAL                %6.2f", total);
  }
}
