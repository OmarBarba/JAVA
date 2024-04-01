import javax.swing.*;
import javax.swing.event.*;

public class Radios extends JFrame implements ChangeListener{
  public JRadioButton radio1,radio2,radio3;
  public JLabel etiqueta;
  
  public Radios(){
	  setLayout(null);
	  setTitle("Radios");
	  
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	  radio1= new JRadioButton("Omar");
	  radio1.setBounds(50,70,100,20);
	  add(radio1);
	  
	  radio2= new JRadioButton("Barba");
	  radio2.setBounds(50,100,100,20);
	  add(radio2);
	  
	  radio3= new JRadioButton("Limon");
	  radio3.setBounds(50,130,100,20);
	  add(radio3);
	  
	  etiqueta = new JLabel ("");
	  etiqueta.setBounds(50,160,300,20);
	  add(etiqueta);
	  
	  radio1.addChangeListener(this);
	  radio2.addChangeListener(this);
	  radio3.addChangeListener(this);
	  
  }
  
  public void stateChanged(ChangeEvent accion){
	String cadena= " ";
	
	if (radio1.isSelected()== true){
	cadena= cadena +"Omar";}
	if (radio2.isSelected()== true){
	cadena= cadena +"Barba";}
	if (radio3.isSelected()== true){
	cadena= cadena +"Limon";}
	
	etiqueta.setText(cadena);
  }
  
  public static void main(String args[]){
	Radios ventana = new Radios();
	ventana.setBounds (200,200,400,400);
	ventana.setVisible(true);
	ventana.setResizable(true);
  }
  
}