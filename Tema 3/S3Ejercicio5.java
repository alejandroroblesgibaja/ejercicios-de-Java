
public class S3Ejercicio5 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base del rectángulo (cm): ");
    double base;
    base = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca la altura del rectángulo(cm): ");
    double altura;
    altura = Double.parseDouble(System.console().readLine());

    double área;
    área = base * altura;

    System.out.print("La base del rectángulo es de " + base + " cm");
    System.out.println(" y la altura es de " + altura + " cm");
    System.out.print("El área total es de ");
    System.out.println(área + " cm²");
  } 
}
