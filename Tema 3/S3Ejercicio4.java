public class S3Ejercicio4 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número: ");
    double primerNúmero;
    primerNúmero = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca un segundo número: ");
    double segundoNúmero;
    segundoNúmero = Double.parseDouble(System.console().readLine());

    double suma;
    suma = primerNúmero + segundoNúmero;
    double resta;
    resta = primerNúmero - segundoNúmero;
    double multiplicación;
    multiplicación = primerNúmero * segundoNúmero;
    double división;
    división = primerNúmero / segundoNúmero;
    System.out.println("El primer número introducido es " + " " + primerNúmero);
    System.out.println("El segundo número introducido es" + " " + segundoNúmero);
    System.out.println("La suma de los dos números es" + " " + suma);
    System.out.println("La resta de los dos números es" + " " + resta);
    System.out.println("La multiplicación de los dos números es" + " " + multiplicación);
    System.out.println("La división de los dos números es" + " " + división);
  } 
}
