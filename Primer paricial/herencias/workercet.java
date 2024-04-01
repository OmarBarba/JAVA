//Omar Alejandro Barba Limon
public class workercet extends Egreso{

 String area,horas ,sueldo;

 public workercet(String r, String n, String d, String c, String p, String s, String fe, String ar, String h, String su) {
  super(r, n, d, c, p, s,fe);
 area =ar ;
 horas=h;
 sueldo=su;
  
  }

public void datosWorkercet() {
System.out.println(area);
System.out.println(horas);
System.out.println(sueldo);
 }

}