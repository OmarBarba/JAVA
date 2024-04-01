
 public class HolaMundoOO {

  String texto,hola;

  void enviaMensaje(){
  //texto= "Hola Mundo";
  //hola= "hola";
   System.out.println(texto);
   System.out.println(hola);
   }
  public static void main(String args[]){
  
    HolaMundoOO miOOHolaMundo = new HolaMundoOO();
    miOOHolaMundo.texto ="SALUDOS!!";
    miOOHolaMundo.hola ="Hola";
    miOOHolaMundo.enviaMensaje();
    } //fin del programa
} //fin de la clase HolaMundoOO 
