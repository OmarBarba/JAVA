import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;


public class MiFormulario extends JFrame implements ActionListener, FocusListener, KeyListener{
	public JLabel etiqueta;
	public JLabel etiqueta2;
	public JLabel etiqueta3;
	public JButton boton;
	public JButton boton1;
	public JTextField campoTexto;
	public JTextField campotex;
	public JTextField campoTexto2;
	String cadena;
	
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
	   
	   setFocusable(true);
	   addKeyListener(this);
	   
	   boton.addActionListener(this);
	   boton1.addActionListener(this);

	   campotex.addKeyListener(this);
	   campoTexto.addKeyListener(this);
	   campoTexto2.addKeyListener(this);
	   
	   campoTexto.addFocusListener(this);
	 
	}

	public void actionPerformed(ActionEvent accion){
		if( accion.getSource() == boton ){
		System.exit(0);}
		if(accion.getSource() == boton1){
 
  	cadena=campoTexto.getText();
  int longitudCadena=cadena.length();

  for (int x=0; x<longitudCadena; x++){
    char caracter=cadena.charAt(x); 
    int caracterCode=(int)caracter; 
    if((caracterCode==32)||(65<=caracterCode && caracterCode<=90)||(97<=caracterCode && caracterCode<=122)){
    etiqueta.setText(campoTexto.getText());
    }else{
	JOptionPane.showMessageDialog(null,"A ocurrido un error, el cararcter no es alfabetico \n Favor de escribir de nuevo el nombre usando caracteres solamentes alfabeticos");
       		campoTexto.setText("");
			etiqueta.setText("Error");
    }
  }	
		etiqueta2.setText(campotex.getText());
		etiqueta3.setText(campoTexto2.getText());
	}		
}
		

	public void keyTyped(KeyEvent x){}
	public void keyReleased(KeyEvent e){}
 
	public void keyPressed(KeyEvent accion){
		char letra=accion.getKeyChar();
		int codigo=accion.getKeyCode();
  
	if(codigo==10){
		cadena=campoTexto.getText();
		int longitudCadena=cadena.length();

	for (int x=0; x<longitudCadena; x++){
		char caracter=cadena.charAt(x); 
		int caracterCode=(int)caracter; 
    if((caracterCode==32)||(65<=caracterCode && caracterCode<=90)||(97<=caracterCode && caracterCode<=122)){
		etiqueta.setText(campoTexto.getText());
    }else{
		JOptionPane.showMessageDialog(null,"A ocurrido un error, el cararcter no es alfabetico \n Favor de escribir de nuevo el nombre usando caracteres solamentes alfabeticos");
       		campoTexto.setText("");
			etiqueta.setText("Error");
    }
  }	
        	etiqueta2.setText(campotex.getText());
        	etiqueta3.setText(campoTexto2.getText());
    
	}
}
	
	public void focusGained (FocusEvent F){ }
	
	public void focusLost(FocusEvent F){
	 cadena=campoTexto.getText();
  int longitudCadena=cadena.length();

  for (int x=0; x<longitudCadena; x++){
    char caracter=cadena.charAt(x);
    int caracterCode=(int)caracter; 
    if((caracterCode==32)||(65<=caracterCode && caracterCode<=90)||(97<=caracterCode && caracterCode<=122)){
    }else{
		JOptionPane.showMessageDialog(null,"A ocurrido un error, el cararcter no es alfabetico \n Favor de escribir de nuevo el nombre usando caracteres solamentes alfabeticos");
       	campoTexto.setText("");
		etiqueta.setText("Error");
    }
  }
 } 
	public static void main (String args[]){
		MiFormulario formmulario = new MiFormulario();
		formmulario.setBounds(200,200,400,350);
		formmulario.setVisible(true);
	}
}