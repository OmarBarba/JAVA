//CASO C
public class c{
  public  int gasto1;   //puede ser "renta"
  private int gasto2;   //puede ser "gasolina"
          int gasto3;   //puede ser "comida"

  public  int ingreso1; //puede ser "sueldo"
  private int ingreso2; //puede ser "beca"
          int ingreso3; //puede ser "comisiones"
  
  public void registrarGastos(int a, int b, int c){
    gasto1 = a;
    gasto2 = b;
    gasto3 = c;
  } // fin del método "registrarGastos"

  public void registrarIngresos(int a, int b, int c,int d){
    ingreso1 = a;
    ingreso2 = b;
    ingreso3 = c;
  } // fin del método "registrarIngresos"

  public int consultaGastos(){
    int sumaGastos;
    sumaGastos = gasto1 + gasto2+ gasto3;
    return sumaGastos;
  } //fin del método "consultaGastos"

  public int consultaIngresos(){
    int sumaIngresos;
    sumaIngresos = ingreso1 + ingreso2+ ingreso3+gasto3;
    return sumaIngresos;
  } //fin del método "consultaIngresos"

  public static void main(String args[]){
    int a=0;
    int b=0;

    c misGastos = new c();

    misGastos.registrarGastos(2500, 1500, 3854);
    misGastos.registrarIngresos(8500, 2000, 33,55);
    a = misGastos.consultaIngresos();
    b = misGastos.consultaGastos();
    System.out.println("Mis ingresos son de " + a);
    System.out.println("Mis gastos son de "   + b);
  } //fin del main
} //fin de la clase "GastosPersonales"