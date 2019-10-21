
public class S4Ejercicio21 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la nota del primer examen: ");
    double primerExamen = Double.parseDouble(System.console().readLine());

    System.out.print("Por favor, introduzca la nota del segundo examen: ");
    double segundoExamen = Double.parseDouble(System.console().readLine());
    
    double media = (primerExamen + segundoExamen) / 2;
    
    if (media >= 5) {
      System.out.println("La nota media del alumno es un " + media);
    }  
    if (media < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");  
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        System.out.println("La nota media del alumno es un 5");
      }  
      if (recuperacion.equals("no apto")) {
        System.out.print("La nota media del alumno es un " + media);
      }
    }
  }
}
