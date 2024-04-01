import java.util.Scanner;


public class menu {

public static void main(String args[]){
Scanner entrada = new Scanner(System.in);
int opc;
        Tij ti = new Tij();
	paz p = new paz();
	Gdl g = new Gdl();

	do{ 

      	System.out.println("Elige la ciudad: \n1)Tijuana \n2)La Paz \n3)Guadalajara\n");

           opc = entrada.nextInt();
           switch(opc)
           {
            case 1:
                ti.DatosHoraCentral();
                ti.horaLocal();
                ti.MostrarCentral();

                 break;

            case 2:
              p.DatosHoraCentral();
	      p.horaLocal();
	      p.MostrarCentral();

                 break;

              case 3:
              g.DatosHoraCentral();
	      g.horaLocal();
              g.MostrarCentral();

                 break;

           }
        }
        while(opc!=4);

}
}