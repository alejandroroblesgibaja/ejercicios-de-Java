/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio12 {
  public static void main(String[] args) {

     int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO");
    
    System.out.println("1. ¿Cuántas horas de Programación tenemos a la semana?");
    System.out.println("a) 8\nb) 6\nc) 9"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("2. ¿Cómo se llama el profesor de Programación?");
    System.out.println("a) Eustaquio\nb) Alberto\nc) Luis"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. ¿Qué día tenemos FOL?");
    System.out.println("a) Lunes\nb) Viernes\nc) Jueves"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿Cúantos ejercicios nos han mandado en Programación para el fin de semana?");
    System.out.println("a) 29\nb) 45\nc) 12"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Como se llama la profesora de Base de Datos?");
    System.out.println("a) Eva\nb) Luisa\nc) Mar"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("6. ¿Cuántas horas de Base de Datos tenemos a la semana?");
    System.out.println("a) 8\nb) 6\nc) 9"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("7. ¿Cuántas horas de FOL tenemos a la semana?");
    System.out.println("a) 1\nb) 3\nc) 2"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("8. ¿Qué lenguaje utilizamos en Programación?");
    System.out.println("a) Java\nb) C\nc) Php"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("9. ¿Cómo se llama la profesora de Lenguaje de Marcas?");
    System.out.println("a) Pilar\nb) Juana\nc) Rafaela"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("10. ¿A dónde subimos los ejercicios de Programación?");
    System.out.println("a) Slack\nb) Moodle\nc) GitHub"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
      
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
