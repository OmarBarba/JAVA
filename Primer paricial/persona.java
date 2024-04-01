
 import java.util.Scanner;

 public class persona {
    String nombre,telefono,domicilio;
    int edad;
    float prom;

  void llenar(){
   Scanner entrada = new Scanner(System.in);
   System.out.println("\n\nIngrese su Nombre");
    nombre=entrada.nextLine();
   System.out.println("Ingrese su Domicilio");
    domicilio=entrada.nextLine();
   System.out.println("Ingrese su Telefono");
    telefono=entrada.nextLine();
    //telefono=entrada.nextLine();
  System.out.println("Ingrese su Edad");
    edad=entrada.nextInt();
  System.out.println("Ingrese su promedio");
    prom=entrada.nextFloat();
   }

  void mostrar(){
    System.out.printf(" Hola los datos son los siguientes:");
    System.out.printf("\nEl nombre de la persona es: %s \nLa direccion es: %s \nEl telefono de la persona es: %s", nombre,domicilio,telefono);
    System.out.printf("\nLa edad es: %d \nEl promedio de su calificacion %.2f",edad,prom);
}

  public static void main(String args []){
    persona PersonaUno = new persona();
    persona PersonaDos = new persona();
    persona PersonaTres = new persona();
   PersonaUno.llenar();
   PersonaUno.mostrar();
   PersonaDos.llenar();
   PersonaDos.mostrar();
   PersonaTres.llenar();
   PersonaTres.mostrar();
   }
}