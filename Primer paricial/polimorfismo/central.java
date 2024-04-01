import java.util.Scanner;
 public class central {
  Float hora, h;
 
 public void DatosHoraCentral(){
  
  Scanner lectura = new Scanner(System.in);
    System.out.println("Introduce el GMT (Greenwich Mean Time): ");

    h = lectura.nextFloat();
}
  public void MostrarCentral() {
   System.out.printf("La hora local es:%.2f", hora);

}
}