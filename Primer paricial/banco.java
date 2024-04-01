 //Omar Alejandro Barba Limón 21110406 

 import java.util.Scanner;

 public class banco {

 String tel,nombre,dom;
int edad;
 int opc;
 int saldo;
int menu() {
 Scanner entrada = new Scanner(System.in);
        System.out.println("\nSeleccione la operacion:");
        System.out.println("\n\n1 Dar de alta usuario");
        System.out.println("2 Mostar datos con saldo");
        System.out.println("3 Modificar datos");
        System.out.println("4 Hacer retiros");
        System.out.println("\n5 Realizar abonos");
        System.out.println("\n6 Salir");
        System.out.println("\n\nIndique operacion: ");
        opc= entrada.nextInt();   
    return opc;
    }
//public Banco (String num, String per, String calle, String a){
//}


 void setTel(String num){
   tel=num;}
 String getTel(){
  return tel;}

 void setNombre(String per){
   nombre= per;}
 String getNombre(){
  return nombre;}

 void setDom(String calle){
   dom= calle;}
 String getDom(){
  return dom;}

void setEdad(int a){
   edad= a;}
int getEdad(){
  return edad;}

 void setMonto(int mon){
   saldo= mon;}

 int getMonto(){
  return saldo;}

  /////main
 
 public static void main(String[] args)
    {
Scanner entrada = new Scanner(System.in);
  String num,per,calle;
  int mon,opc,a,q,z=0,l;
 banco Datos = new banco();

do{
 opc= Datos.menu();
    switch (opc) { 
 case 1: 
   
  System.out.printf("\nIngresa el Nombre de la persona: ");
  per = entrada.nextLine();
  Datos.setNombre(per);
  System.out.printf("\nIngresa el Telefono de la persona: ");
  num = entrada.nextLine();
  Datos.setTel(num);
  System.out.printf("\nIngresa el Domicilio de la persona: ");
 calle = entrada.nextLine();
  Datos.setDom(calle);
   System.out.printf("\nIngresa la Edad de la persona: ");
  a = entrada.nextInt();
  Datos.setEdad(a);
  Datos.setMonto(10000);
  break;
  
case 2: 

  System.out.printf("\nLos datos son:");
  System.out.printf("\nEl nombre es: %s",Datos.getNombre());
  System.out.printf("\nEl Telefono es: %s",Datos.getTel());
  System.out.printf("\nElDomicilio es: %s",Datos.getDom());  
  System.out.printf("\nLa edad es: %d",Datos.getEdad());
  System.out.printf("\nEl monto de la cuenta es: %d",Datos.getMonto());
   break;

case 3: 
    System.out.printf("\nIngresa el Nombre de la persona: ");
  per = entrada.nextLine();
  per = entrada.nextLine();
  Datos.setNombre(per);
  System.out.printf("\nIngresa el Telefono de la persona: ");
  num = entrada.nextLine();
  Datos.setTel(num);
  System.out.printf("\nIngresa el Domicilio de la persona: ");
 calle = entrada.nextLine();
  Datos.setDom(calle);
   System.out.printf("\nIngresa la Edad de la persona: ");
  a = entrada.nextInt();
  Datos.setEdad(a);
   System.out.printf("\nIngresa el monto nuevo de la persona: ");
  mon = entrada.nextInt();
  Datos.setMonto(mon);

    System.out.printf("\nLos datos modificados son:");
  System.out.printf("\nEl nombre es: %s",Datos.getNombre());
  System.out.printf("\nEl Telefono es: %s",Datos.getTel());
  System.out.printf("\nElDomicilio es: %s",Datos.getDom());
  System.out.printf("\nLa edad es: %d",Datos.getEdad());
  System.out.printf("\nEl monto de la cuenta es: %d",Datos.getMonto());
   break;
case 4: 
Datos.getMonto();
System.out.printf("\nIngresa la cantidad a retirar: ");
z = entrada.nextInt();
 if(Datos.saldo>z){
q=Datos.saldo-z;
 System.out.printf("\nEl monto de la cuenta es: %d",q);
}
break;

case 5:

System.out.printf("\nIngresa la Ecantidad a ingresar: ");
l = entrada.nextInt();
q=Datos.saldo+l;
 System.out.printf("\nEl monto de la cuenta es: %d",q);
break;
}
}
while(opc!= 6);
}
}