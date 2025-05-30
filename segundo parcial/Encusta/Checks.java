import javax.swing.*;
import javax.swing.event.*;

public class Checks extends JFrame implements ChangeListener{
  public JCheckBox check1,check2,check3;
  public JLabel etiqueta;
  
  public Checks(){
	  setLayout(null);
	  setTitle("Checks");
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	  check1= new JCheckBox("Omar");
	  check1.setBounds(50,70,100,20);
	  add(check1);
	  
	  check2= new JCheckBox("Barba");
	  check2.setBounds(50,100,100,20);
	  add(check2);
	  
	  check3= new JCheckBox("Limon");
	  check3.setBounds(50,130,100,20);
	  add(check3);
	  
	  etiqueta = new JLabel ("");
	  etiqueta.setBounds(50,160,300,20);
	  add(etiqueta);
	  
	  check1.addChangeListener(this);
	  check2.addChangeListener(this);
	  check3.addChangeListener(this);
	  
  }
  
  public void stateChanged(ChangeEvent accion){
	String cadena= " ";
	
	if (check1.isSelected()== true){
	cadena= cadena +"Limon";}
	if (check2.isSelected()== true){
	cadena= cadena +"Omar";}
	if (check3.isSelected()== true){
	cadena= cadena +"Barba";}
	
	etiqueta.setText(cadena);
  }
  
  public static void main(String args[]){
	Checks ventana = new Checks();
	ventana.setBounds (200,200,400,400);
	ventana.setVisible(true);
	ventana.setResizable(true);
  }
  
}