
public class S3Ejercicio7 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base imponible del producto: ");
    double baseImponible;
    baseImponible = Double.parseDouble(System.console().readLine());
    
    double iva;
    iva = baseImponible * 0.21;

    double total;
    total = baseImponible + iva;

    System.out.printf("La base imponible del producto es %10.2f €\n", baseImponible);
    System.out.printf("El IVA del producto es            %10.2f €\n", iva );
    System.out.printf("----------------------------------------------\n");
    System.out.printf("El precio total del producto es   %10.2f € ", total);
  } 
}
