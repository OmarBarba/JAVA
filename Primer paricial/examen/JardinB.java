
// CASO B
public class JardinB{
   int largo;
   int ancho;
   String fechaPoda;
   String horariodeRiego;	

   public void fijarDimensiones(int l, int a){
     largo = l;
     ancho = a;
   } // fin del método "fijarDimensiones"

   public void establecerFechaPoda(String Fecha){
      fechaPoda = Fecha;
   } // fin del método "establecerFechaPoda"

   public void establecerHorarioRiego(String horario){
      horariodeRiego = horario;
   } // fin del método "establecerHorarioRiego"

   public String consultaHorarioRiego(){
     return horariodeRiego;
   } // fin del método "consultaHorarioRiego"

   public static void main(String args[]){

     JardinB casa     = new JardinB();
     JardinB escuela  = new JardinB();
     JardinB botanico = new JardinB();

     casa.fijarDimensiones(10, 20);
     casa.establecerFechaPoda("20/03/2020");
     casa.establecerHorarioRiego("15:00:00");

     escuela.fijarDimensiones(5, 15);
     escuela.establecerFechaPoda("21/03/2020");
     escuela.establecerHorarioRiego("16:00:00");

     botanico.fijarDimensiones(100, 200);
     botanico.establecerFechaPoda("20/04/2020");
     botanico.establecerHorarioRiego("09:00:00");
   } // fin del main
} // fin de la clase "Jardín"
