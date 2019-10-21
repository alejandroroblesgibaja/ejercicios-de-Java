/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */
public class S4Ejercicio4 {
  public static void main(String[] args) {

    int sueldoSemanal;

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    if (horas < 40) {
      sueldoSemanal = 12 * horas;
    } else {
      sueldoSemanal = (40 * 12) + ((horas - 40) * 16);
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}
