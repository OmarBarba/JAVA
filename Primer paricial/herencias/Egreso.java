//Omar Alejandro Barba Limon
public class Egreso extends comunidad{

 String fecha;
 public Egreso(String r, String n, String d, String c, String p, String s, String fe) {
  super(r, n, d, c, p, s);
 fecha =fe ;

  
  }

public void datosEgreso() {
System.out.println(fecha);

 }

}