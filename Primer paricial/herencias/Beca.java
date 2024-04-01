//Omar Alejandro Barba Limon
public class Beca extends comunidad{

 String monto;

 public Beca(String r, String n, String d, String c, String p, String s, String m) {
  super(r, n, d, c, p, s);
  monto = m;
  }

public void datosBecado() {
System.out.println(monto);
 }

}
