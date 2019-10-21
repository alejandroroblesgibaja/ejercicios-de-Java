
public class S3Ejercicio9 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el radio de la base del cono (cm): ");
    double radio;
    radio = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca la altura del cono(cm): ");
    double altura;
    altura = Double.parseDouble(System.console().readLine());

    double volumen;
    volumen =   (Math.PI * (radio * radio) * altura) / 3;

    System.out.print("El radio de la base del cono es de " + radio + " cm");
    System.out.println(" y la altura del cono es de " + altura + " cm");
    System.out.printf("El volumen total del cono es de %.3f cm³", volumen);
  } 
}
