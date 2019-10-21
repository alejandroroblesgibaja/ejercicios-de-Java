
public class S3Ejercicio8 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca las horas semanales trabajadas: ");
    double horas;
    horas = Double.parseDouble(System.console().readLine());
    
    double salario;
    salario = horas * 12;

    System.out.println("El trabajador ha trabajado " + horas + " horas semanales");
    System.out.println("El salario correspondiente es de " + salario + " €");
  } 
}
