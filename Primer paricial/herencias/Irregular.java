//Omar Alejandro Barba Limon
public class Irregular extends comunidad{

 String materia, calificacion;

 public Irregular(String r, String n, String d, String c, String p, String s, String mat, String cal) {
  super(r, n, d, c, p, s);
 materia =mat ;
  calificacion=cal;
  
  }

public void datosIrregular() {
System.out.println(materia);
System.out.println(calificacion);


 }

}