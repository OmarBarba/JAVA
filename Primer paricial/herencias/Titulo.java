//Omar Alejandro Barba Limon
public class Titulo extends Irregular{

 String calificacion2;

 public Titulo(String r, String n, String d, String c, String p, String s, String mat, String cal, String cal2) {
  super(r, n, d, c, p, s,mat,cal);
 
  calificacion2=cal2;
  
  }

public void datosTitulo() {

System.out.println(calificacion2);


 }

}