public class S1Ejercicio5{
  public static void main(String[] args){
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(blanco + "Lunes\t\tMartes\t\tMiércoles\tJueves\t\tViernes");
    System.out.println("-----\t\t------\t\t---------\t------\t\t-------");
    System.out.println(rojo + "PROG\t\t" + verde + "EDD\t\t" + rojo + "PROG\t\tPROG\t\t" + naranja + "SIN");
    System.out.println(blanco + "-----\t\t------\t\t---------\t------\t\t-------");
    System.out.println(rojo + "PROG\t\t" + azul + "LM\t\t" + rojo + "PROG\t\tPROG\t\t" + naranja + "SIN");
    System.out.println(blanco + "-----\t\t------\t\t---------\t------\t\t-------");
    System.out.println(rojo + "PROG\t\t" + azul + "LM\t\t" + rojo + "PROG\t\t" + verde + "EDD\t\t" + naranja + "SIN");
    System.out.println(blanco + "-----\t\t------\t\t---------\t------\t\t-------");
    System.out.println(morado + "BBDD\t\t" + naranja + "SIN\t\t" + morado + "BBDD\t\t" + verde + "EDD\t\t" + celeste + "FOL");
    System.out.println(blanco + "-----\t\t------\t\t---------\t------\t\t-------");
    System.out.println(morado + "BBDD\t\t" + naranja + "SIN\t\t" + morado + "BBDD\t\t" + azul + "LM\t\t" + celeste + "FOL");
    System.out.println(blanco + "-----\t\t------\t\t---------\t------\t\t-------");
    System.out.println(morado + "BBDD\t\t" + naranja + "SIN\t\t" + morado +  "BBDD\t\t" + azul + "LM\t\t" + celeste + "FOL");
  }
} 
