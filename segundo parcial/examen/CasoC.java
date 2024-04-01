import javax.swing.*;

public class CasoC extends JFrame{
  public JLabel etiqueta1;

  public CasoC(){
    setLayout(null);
    setTitle("Mi primer ventana");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    etiqueta1 = new JLabel("HOLA!!!");
    etiqueta1.setBounds(100, 100, 100, 15);
    add(etiqueta1);

  } // Fin del Constructor

  public static void main(String args[]){
    CasoC ventanita = new CasoC();
    ventanita.setBounds(150, 150, 300, 250);
    ventanita.setVisible(true);


  } // Fin del método main

}