
public class S4Ejercicio7 {
  public static void main(String[] args) {

    System.out.println("Vamos a calcular la nota media de 3 exámenes");
    System.out.println("Por favor, introduzca la nota del primer examen:");
    double primerExamen;
    primerExamen = Double.parseDouble(System.console().readLine());
    
    System.out.println("Por favor, introduzca la nota del segundo examen:");
    double segundoExamen;
    segundoExamen = Double.parseDouble(System.console().readLine());
    
    System.out.println("Por favor, introduzca la nota del tercer examen:");
    double tercerExamen;
    tercerExamen = Double.parseDouble(System.console().readLine());
    
    double notaMedia;
    notaMedia = (primerExamen + segundoExamen + tercerExamen) / 3; 

    System.out.println("La nota del primer examen es un " + primerExamen);
    System.out.println("La nota del segundo examen es un " + segundoExamen);
    System.out.println("La nota del tercer examen es un " + tercerExamen);
    System.out.printf("La nota media de los 3 exámenes es un %.2f", notaMedia);
  } 
}
