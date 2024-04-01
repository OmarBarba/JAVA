 import java.util.Scanner;
 public class EntradadeDatos{ 
   public static void main(String args []){
     String texto;
     float x=0;
      int y=7;

     Scanner entrada = new Scanner(System.in);
     
     System.out.println("Ingresa tu nombre:");
     texto= entrada.nextLine();

     System.out.println("Ingresa tu calificacion del examen:");
     x= entrada.nextFloat();

     System.out.printf("Hola %s!\nObtubiste %.2f y necesitas %d para pasar", texto, x, y);
    
}
}