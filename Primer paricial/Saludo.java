 
 public class Saludo {

  String dias,tardes,noches;

  void muestra(){
   System.out.println(dias);
   
   }

  public static void main(String args[]){
    
    Saludo miSaludo = new Saludo();
    Saludo Tardes = new Saludo();
    Saludo Noches = new Saludo();
    miSaludo.dias = " Buenos dias";
    miSaludo.muestra();
    Tardes.dias = "  Buenas tardes";
    Tardes.muestra();
    Noches.dias = "   Buenas noches";
    Noches.muestra();
    } 
}  