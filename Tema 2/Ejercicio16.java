public class Ejercicio16{
  public static void main(String[] args){
    double baseImponible = 59.95;

    System.out.printf("Base imponible %10.2f\n", baseImponible);
    System.out.printf("IVA            %10.2f\n", (baseImponible * 0.21));
    System.out.printf("Total          %10.2f\n", (baseImponible * 1.21));
  }
}
