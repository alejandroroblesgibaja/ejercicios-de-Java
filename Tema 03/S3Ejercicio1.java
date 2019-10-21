
public class S3Ejercicio1 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduce un número: ");
    double primerNumero;
    primerNumero = Double.parseDouble(System.console().readLine());

    System.out.print("introduce otro, por favor: ");
    double segundoNumero;
    segundoNumero = Double.parseDouble(System.console().readLine());

    double total;
    total = primerNumero * segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("La multiplicación del primero por el segundo es ");
    System.out.print(total);   
  } 
}
