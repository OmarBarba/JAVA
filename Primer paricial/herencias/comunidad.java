//Omar Alejandro Barba Limon
public class comunidad {

String registro, nombre, domicilio, carrera, promedio, semestre;

public comunidad(String r, String n, String d, String c, String p, String s) {
  registro = r;
  nombre = n;
  domicilio = d;
  carrera = c;
  promedio = p;
  semestre = s;
 }

  public void datosGenerales() {
   System.out.println(registro);
    System.out.println(nombre);
     System.out.println(domicilio);
      System.out.println(carrera);
       System.out.println(promedio);
        System.out.println(semestre);
   }

}