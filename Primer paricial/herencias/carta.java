//Omar Alejandro Barba Limon
public class carta extends Titulo{

 String calificacion3,just;

 public carta(String r, String n, String d, String c, String p, String s, String mat, String cal, String cal2,String cal3,String justi) {
  super(r, n, d, c, p, s,mat,cal,cal2);
 
  calificacion3=cal3;
  just=justi;
  }

public void datosCarta() {

System.out.println(calificacion3);

System.out.println(just);
 }

}