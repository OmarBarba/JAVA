//Omar Alejandro Barba Limon
public class Practicas extends comunidad{

 String horas, empresa,remuneracion;

 public Practicas(String r, String n, String d, String c, String p, String s, String h, String e, String rem) {
  super(r, n, d, c, p, s);
  empresa =e ;
  horas=h;
  remuneracion=rem;
  }

public void datosPracticas() {
System.out.println(empresa);
System.out.println(horas);
System.out.println(remuneracion);

 }

}