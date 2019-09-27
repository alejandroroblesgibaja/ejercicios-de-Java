
public class S3Ejercicio6 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la base del triángulo (cm): ");
    double base;
    base = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca la altura del triángulo(cm): ");
    double altura;
    altura = Double.parseDouble(System.console().readLine());

    double área;
    área = (base * altura) / 2;

    System.out.print("La base del triángulo es de " + base + " cm");
    System.out.println(" y la altura es de " + altura + " cm");
    System.out.print("El área total es de ");
    System.out.println(área + " cm²");
  } 
}
