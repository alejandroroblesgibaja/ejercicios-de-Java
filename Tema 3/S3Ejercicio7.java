
public class S3Ejercicio7 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base imponible del producto: ");
    double baseImponible;
    baseImponible = Double.parseDouble(System.console().readLine());
    
    double iva;
    iva = baseImponible * 0.21;

    double total;
    total = baseImponible + iva;

    System.out.println("La base imponible del producto es " + baseImponible + " €");
    System.out.println("El IVA del producto es " + iva + " €");
    System.out.println("El precio total del producto es " + total + " €");
  } 
}
