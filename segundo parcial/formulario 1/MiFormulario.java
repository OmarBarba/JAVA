import javax.swing.*;
import java.awt.event.*;

public class MiFormulario extends JFrame implements ActionListener{
	public JLabel etiqueta;
	public JLabel etiqueta2;
	public JLabel etiqueta3;
	public JButton boton;
	public JButton boton1;
	public JTextField campoTexto;
	public JTextField campotex;
	public JTextField campoTexto2;
	
	public MiFormulario(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		etiqueta = new JLabel ("Nombre");
		etiqueta.setBounds(220, 25, 150, 15);
		add(etiqueta);
		
		etiqueta2 = new JLabel ("Domicilio");
		etiqueta2.setBounds(220, 65, 150, 15);
		add(etiqueta2);
		
		etiqueta3 = new JLabel ("correo");
		etiqueta3.setBounds(220, 100, 150, 15);
		add(etiqueta3);
		
		boton = new JButton ("Cerrar");
		boton.setBounds(260, 220, 100, 30);
		add(boton);
		
		boton1 = new JButton ("Actulizar");
		boton1.setBounds(60,220,100,30);
		add(boton1);
       
	   campoTexto = new JTextField();
	   campoTexto.setBounds(50,25,150,25);
	   add (campoTexto);
	   
	    campotex = new JTextField();
	   campotex.setBounds(50,65,150,25);
	   add (campotex);
	    campoTexto2 = new JTextField();
	   campoTexto2.setBounds(50,100,150,25);
	   add (campoTexto2);
	   
	   boton.addActionListener(this);
	   boton1.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent accion){
		if( accion.getSource() == boton ){
		System.exit(0);}
		if(accion.getSource() == boton1){
		etiqueta.setText(campoTexto.getText());
		etiqueta2.setText(campotex.getText());
		etiqueta3.setText(campoTexto2.getText());
		}
	}
	
	public static void main (String args[]){
		MiFormulario formmulario = new MiFormulario();
		formmulario.setBounds(200,200,400,350);
		formmulario.setVisible(true);
	}
}