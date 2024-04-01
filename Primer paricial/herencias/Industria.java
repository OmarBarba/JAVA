//Omar Alejandro Barba Limon
public class Industria extends Egreso{

 String empresa,sueldo;

 public Industria(String r, String n, String d, String c, String p, String s, String fe, String emp, String su) {
  super(r, n, d, c, p, s,fe);
 empresa =emp ;
 sueldo=su;
  
  }

public void datosIndustria() {
System.out.println(empresa);
System.out.println(sueldo);
 }

}