 //Omar Alejandro Barba Limón 21110406 

 import java.util.Scanner;

 public class calculadora {
   
    float x,y,res; 
int opc;

int menu() {
 Scanner entrada = new Scanner(System.in);
        System.out.println("\nSeleccione la operacion:");
        System.out.println("\n\n1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("\n5) Salir");
        System.out.println("\n\nIndique operacion: ");
        opc= entrada.nextInt();   
    return opc;
    }

void obtener(){
  Scanner entrada = new Scanner(System.in);
  System.out.printf("\nIngresa el primer numero: ");
  x = entrada.nextFloat();
  System.out.printf("Ingresa el segundo numero: ");
  y = entrada.nextFloat();
  }

void Resultados(){
 Scanner entrada = new Scanner(System.in);
  System.out.printf("\nEl resultado de la operacion es: %f\n", res);
	}

  void div(){
  res=x/y;
  }

  void multi(){
   res=x*y; 
  }

  void resta(){
   res=x-y;
   }

  void suma(){
   res=x+y;
 // System.out.printf("\n%f %f\n", x,y);
   }
 

  public static void main(String[] args)
    {

int opc;
float res;

  calculadora Programa = new calculadora();
    

do{
    
   opc= Programa.menu();
    switch (opc) { 

      case 1: System.out.printf("\n\tElegiste la operacion Suma\n");
               Programa.obtener();
               Programa.suma();
               Programa.Resultados();
               break;
      case 2: System.out.printf("\n\tElegiste la operacion Resta\n");
               Programa.obtener();
               Programa.resta();
               Programa.Resultados();
               break;
      case 3: System.out.printf("\n\tElegiste la operacion Multiplicacion\n");
               Programa.obtener();
               Programa.multi();
               Programa.Resultados();
               break;
      case 4: System.out.printf("\n\tElegiste la operacion Division\n");
               Programa.obtener();
               Programa.div();
               Programa.Resultados();
               break;

}
}
while(opc != 5);
}
}

