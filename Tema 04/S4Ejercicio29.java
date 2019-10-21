/**
 * Ejercicios Java Tema 4
 *
 * @author Alejandro Robles Gibaja
 */

public class S4Ejercicio29 {
  public static void main(String[] args) {

    System.out.print("¿Qué ha tomado el usuario de comer? (palmera, donut, pitufo): ");
    String comer = System.console().readLine();
    
    double precioComer = 0;
    
    switch(comer) {
      case "palmera":
        precioComer = 1.4;
        break;
      case "donut":
        precioComer = 1;
        break;
      case "pitufo":
        System.out.print("¿Lo ha tomado con aceite o con tortilla?: ");
        String pitufoCon = System.console().readLine();
        if (pitufoCon.equals("aceite")) {
        precioComer = 1.2;
        }  
        if (pitufoCon.equals("tortilla")) {
        precioComer = 1.6;
        }
        break;
      default:
        System.out.println("La comida introducida no es correcta.");
    }
    
    System.out.print("¿Qué ha tomado el usuario de beber? (cafe, zumo): ");
    String beber = System.console().readLine();
    
    double precioBeber = 0;
      switch(beber) {
      case "cafe":
        precioBeber = 1.2;
        break;
      case "zumo":
        precioBeber = 1.5;
        break;
      default:
        System.out.println("La bebida introducida no es correcta.");
    }
    double total = precioComer + precioBeber;
    
    System.out.println(comer + " " + precioComer + " €");
    System.out.println(beber + " " + precioBeber + " €");
    System.out.println("Total " + total + "€");
  }
}

