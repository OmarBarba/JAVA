import javax.swing.*;
import java.awt.event.*;

public class CasoF extends JFrame implements ActionListener{
  public JLabel etiqueta;
  public JButton boton;

  public CasoF(){
    setLayout(null);
    setTitle("Mi primer ventana");
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    etiqueta = new JLabel("HOLA!!!");
    etiqueta.setBounds(70, 50, 300, 15);
    add(etiqueta);

    boton = new JButton("Actualizar");
    boton.setBounds(90, 150, 100, 20);
    add(boton);
  } // Fin del Constructor

  public void actionPerformed(ActionEvent accion){
    etiqueta.setText("SUERTE EN EL EXAMEN!");
  } //Fin del metodo actionPerformed

  public static void main(String args[]){
    CasoF ventanita = new CasoF();
    ventanita.setBounds(150, 150, 300, 250);
    ventanita.setVisible(true);


  } // Fin del método main

} // Fin de la clase CasoC