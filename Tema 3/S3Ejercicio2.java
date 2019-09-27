
public class S3Ejercicio2 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de euros que quiera convertir a pesetas: ");
    double euros;
    euros = Double.parseDouble(System.console().readLine());

    double pesetas;
    pesetas = euros * 166;

    System.out.print(euros + " € equivalen a " + pesetas + " pesetas");
  } 
}
