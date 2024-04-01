//Omar Alejandro Barba Limon
public class Servicio extends comunidad{

 String horas, area;

 public Servicio(String r, String n, String d, String c, String p, String s, String h, String a) {
  super(r, n, d, c, p, s);
  area = a;
  horas=h;
  }

public void datosServicio() {
System.out.println(area);
System.out.println(horas);

 }

}