
public class S4Ejercicio6 {
  public static void main(String[] args) {

    System.out.println("Vamos a calcular el tiempo que tarda en caer un objeto desde una altura h");
    System.out.println("Por favor, introduzca la altura (m):");
    double altura;
    altura = Double.parseDouble(System.console().readLine());

    double tiempo;
    tiempo = Math.sqrt((2 * altura) / 9.81);

    System.out.println("La altura inicial del objeto es de " + altura + " (m)");
    System.out.printf("El tiempo que tarda en llegar al suelo es de %.3f (s)", tiempo);
  } 
}
