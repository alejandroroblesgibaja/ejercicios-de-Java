
public class S3Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de Kb que quiera convertir a Mb: ");
    double kb;
    kb = Double.parseDouble(System.console().readLine());

    double mb;
    mb = kb / 1024;

    System.out.print(kb + " Kb equivalen a " + mb + " Mb");
  } 
}
