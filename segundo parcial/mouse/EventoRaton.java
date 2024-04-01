import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EventoRaton extends JFrame implements MouseListener{

	public JLabel etiqueta, etiqueta2;
	public JTextArea area;
	public JTextField campo;


	public EventoRaton(){

	setLayout(null);
	setTitle("Eventos de raton");
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	etiqueta = new JLabel ("Ayuda ");
	etiqueta.setBounds(415, 15, 150, 15);
	add(etiqueta);

	etiqueta2 = new JLabel (" ");
	etiqueta2.setBounds(130, 300, 250, 15);
	add(etiqueta2);

	 campo = new JTextField();
	   campo.setBounds(15,10,150,25);
	   add (campo);

	area= new JTextArea();
	area.setBounds(15,70,450,150);
	add(area);

	etiqueta.addMouseListener(this);
	addMouseListener(this);
	etiqueta2.addMouseListener(this);

	}

	public void mouseEntered(MouseEvent e){
	if(e.getSource()==etiqueta){
	JOptionPane.showMessageDialog(null,"Bienvenido acontinuacion te mostrare como es que funciona este programa: \n 1: el cuadro grande que obtenemos logramos poner lo que nosotros querramos \n 2: Laventana de texto superior es para poder cambiar el titulo \n 3: si da click derecho obtendra quien hizo el programa y si presiona con la bolita del raton podra terminar el uso del programa");

	}
	}

	public void mouseExited(MouseEvent e){

	}

	public void mousePressed(MouseEvent e){
	String cadena="";
		int valorBoton=0;
		int v=0;

		valorBoton =e.getModifiersEx();

		if (valorBoton ==1024){
			setTitle(campo.getText());
		}
		if (valorBoton ==4096){
			etiqueta2.setText("El programa fue realizado por Omar Barba");

		}
		if (valorBoton ==2048 && e.getSource()==etiqueta2){
	v= JOptionPane.showConfirmDialog(null,"Si desea continuar presiona si");
	if (v==0){
		System.exit(0);
	}
		}

	}

	public void mouseReleased(MouseEvent e){

	}

	public void mouseClicked(MouseEvent e){

	}

	public static void main (String args[]){
	EventoRaton ventana = new EventoRaton();
	ventana.setBounds(700,340,500,400);
	ventana.setVisible(true);
	ventana.setResizable(true);

	}

}
