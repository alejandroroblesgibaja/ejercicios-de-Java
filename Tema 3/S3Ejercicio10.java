
public class S3Ejercicio10 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de Mb que quiera convertir a Kb: ");
    double mb;
    mb = Double.parseDouble(System.console().readLine());

    double kb;
    kb = mb * 1000;

    System.out.print(mb + " Mb equivalen a " + kb + " Kb");
  } 
}
