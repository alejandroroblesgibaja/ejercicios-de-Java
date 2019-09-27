
public class S3Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la nota del primer examen de Programación: ");
    double primerExamen;
    primerExamen = Double.parseDouble(System.console().readLine());

    System.out.print("¿Qué nota quiere sacar en la asignatura de Programación en el trimestre?: ");
    double notaTrimestre;
    notaTrimestre = Double.parseDouble(System.console().readLine());

    double segundoExamen;
    segundoExamen = (notaTrimestre - (primerExamen * 0.4)) / 0.6;

    System.out.println("La nota del primer examen es un " + primerExamen);
    System.out.println("Si quiero sacar un " + notaTrimestre + " en el trimestre");
    System.out.printf("Tendré que sacar un %.2f en el segundo examen", segundoExamen);
  } 
}
