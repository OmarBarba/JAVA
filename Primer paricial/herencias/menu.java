import java.util.Scanner;

  public class menu {

public static void main(String args[]){ 

 
 Servicio Herencia1= new Servicio("21110406", "Omar Barba","Bosques","Mecatronica","95","tercero","Escuela Verde","6hrs");


 Beca Herencia2= new Beca("21110417", "Nicolle Castillo", "Lopez Mateos","Mecatronica","99","cuarto","5000");

 Practicas Herencia3 = new Practicas("21110422", "Rodolfo Gutierrez","La Cima", "Mecatronica", "99", "quinto","Flex", "480","5000");

carta Herencia4= new carta( "21110225", "Alberto Rojas","Bugambilias", "Software", "69", "septimo", "Electricidad", "58", "68", "72", "Enfermedad");

workercet Herencia5 = new workercet("21110001", "Pedro Barbosa","Las Pintas", "Electronica", "80", "eg","Mantenimiento","02/05/2019", "8","15000");

Industria Herencia6 = new Industria("21110560", "Vanesa Gutierrez","Bosques", "Farmacos", "99", "eg","02/05/2019","Sanmina", "15000");


System.out.println("\tDatos Servicio");
Herencia1.datosGenerales();
Herencia1.datosServicio();

System.out.println("\t\tDatos Beca");
Herencia2.datosGenerales();
Herencia2.datosBecado();

System.out.println("\t\tDatos practicas");
Herencia3.datosGenerales();
Herencia3.datosPracticas();

System.out.println("\t\tDatos Carta");
Herencia4.datosGenerales();
Herencia4.datosIrregular();
Herencia4.datosTitulo();
Herencia4.datosCarta();

System.out.println("\t\tDatos WorkerCeti");
Herencia5.datosGenerales();
Herencia5.datosEgreso();
Herencia5.datosWorkercet();

System.out.println("\t\tDatos industria");
Herencia6.datosGenerales();
Herencia6.datosEgreso();
Herencia6.datosIndustria();
}//main

}