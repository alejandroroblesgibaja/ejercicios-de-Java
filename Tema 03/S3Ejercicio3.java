
public class S3Ejercicio3 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de pesetas que quiera convertir a euros: ");
    double pesetas;
    pesetas = Double.parseDouble(System.console().readLine());

    double euros;
    euros = pesetas / 166;

    System.out.printf(pesetas + " pesetas equivalen a %.2f €", euros );
  } 
}
