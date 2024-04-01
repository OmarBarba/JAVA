import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Insertar extends JFrame implements ActionListener, FocusListener, KeyListener, MouseListener,ItemListener,ChangeListener{
	public JLabel etiqueta;
	public JLabel etiqueta2, etiqueta7;
	public JLabel etiqueta3, etiqueta4, etiqueta5, etiqueta6, et7,et8;
	public JButton boton1;
	public JTextField campoTexto;
	public JTextField campotex;
	public JTextField campoTexto2, campoTexto3;
	String cadena;
	public JComboBox<String> combo,combo2;
	public JRadioButton radio1,radio2,radio3,radio4;
	String dia,nom,corr,tel,dom,tipo,hor;
	 public ButtonGroup dias;

	public Insertar(){
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//etiquetas
{
		{etiqueta = new JLabel ("Nombre");
		etiqueta.setBounds(220, 70, 150, 15);
		add(etiqueta);}

		{etiqueta2 = new JLabel ("Domicilio");
		etiqueta2.setBounds(220, 110, 150, 15);
		add(etiqueta2);}

		{etiqueta3 = new JLabel ("correo");
		etiqueta3.setBounds(220, 150, 150, 15);
		add(etiqueta3);}

		{etiqueta4 = new JLabel ("Telefono");
		etiqueta4.setBounds(220, 190, 180, 15);
		add(etiqueta4);}

		{etiqueta5 = new JLabel ("Insertar datos del solicitante");
		etiqueta5.setBounds(10, 10, 180, 15);
		add(etiqueta5);}

		{etiqueta6 = new JLabel ("Ayuda ");
		etiqueta6.setBounds(300, 330, 150, 15);
		add(etiqueta6);}

		{etiqueta7 = new JLabel ("Tipo de cita ");
		etiqueta7.setBounds(220, 40, 150, 15);
		add(etiqueta7);}

		{et7 = new JLabel ("Dia de la semana ");
		et7.setBounds(350, 180, 150, 15);
		add(et7);}

		{et8 = new JLabel ("Horario");
		et8.setBounds(350, 50, 150, 15);
		add(et8);}
}

//boton
{
		{boton1 = new JButton ("Actulizar");
		boton1.setBounds(60,230,100,30);
		add(boton1);}
}
//texto
{
		{campoTexto = new JTextField();
	   campoTexto.setBounds(50,70,150,25);
		add (campoTexto);}

	   { campotex = new JTextField();
	   campotex.setBounds(50,110,150,25);
	   add (campotex);}

	   { campoTexto2 = new JTextField();
	   campoTexto2.setBounds(50,150,150,25);
	   add (campoTexto2);}

	   {campoTexto3 = new JTextField();
	   campoTexto3.setBounds(50,190,150,25);
		add (campoTexto3);}
}

//combo
{
		{combo = new JComboBox<String>();
		combo.setBounds(60,40,90,20);
		add(combo);

		combo.addItem("Corte");
		combo.addItem("Barba");
		combo.addItem("Facial");
		}

		{combo2 = new JComboBox<String>();
		combo2.setBounds(350,80,90,20);
		add(combo2);
		combo2.addItem("09:00");
		combo2.addItem("10:00");
		combo2.addItem("11:00");
		combo2.addItem("12:00");
		}
}
//radios
{
		{radio1= new JRadioButton("Lunes");
	  radio1.setBounds(350,200,100,20);
		add(radio1);}

		{radio2= new JRadioButton("Martes");
	  radio2.setBounds(350,230,100,20);
		add(radio2);}

		{radio3= new JRadioButton("Miercoles");
	  radio3.setBounds(350,260,100,20);
		add(radio3);}

		{radio4= new JRadioButton("Jueves");
	  radio4.setBounds(350,290,100,20);
		add(radio4);}
dias = new ButtonGroup();


	dias.add(radio1);
	dias.add(radio2);
	dias.add(radio3);
	dias.add(radio4);
	}

//accion
{

	setFocusable(true);
	addKeyListener(this);
	 boton1.addActionListener(this);

	campotex.addKeyListener(this);
	campoTexto.addKeyListener(this);
	campoTexto2.addKeyListener(this);
	campoTexto3.addKeyListener(this);
	campoTexto.addFocusListener(this);

	combo.addItemListener(this);
	combo2.addItemListener(this);
	etiqueta6.addMouseListener(this);
	addMouseListener(this);

	radio1.addChangeListener(this);
	radio2.addChangeListener(this);
	radio3.addChangeListener(this);
	radio4.addChangeListener(this);
	}

	}

	public void actionPerformed(ActionEvent accion){

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
		etiqueta4.setText(campoTexto3.getText());
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
			etiqueta4.setText(campoTexto3.getText());

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

	public void mouseEntered(MouseEvent e){
	if(e.getSource()==etiqueta6){
	JOptionPane.showMessageDialog(null,"Bienvenido acontinuacion te mostrare como es que funciona este programa: \n LLenar los campos en el siguiente orden \n Nombre \n Domicilio \n correo \n Telefono ");

	}
	}

	public void mouseExited(MouseEvent e){

	}

	public void mousePressed(MouseEvent e){
	}

	public void mouseReleased(MouseEvent e){

	}

	public void mouseClicked(MouseEvent e){

	}

	public void itemStateChanged(ItemEvent accion){

		tipo=combo.getSelectedItem().toString();
		hor=combo2.getSelectedItem().toString();
	System.out.println(hor);
	System.out.println(tipo);
	}
	public void stateChanged(ChangeEvent accion){
	if (radio1.isSelected()== true){
	dia= "Lunes";
	System.out.println(dia);
	}
	if (radio2.isSelected()== true){
dia= "Martes";
System.out.println(dia);
	}
	if (radio3.isSelected()== true){
dia= "Miercoles";
System.out.println(dia);
	}
	if (radio4.isSelected()== true){
dia= "Jueves";
System.out.println(dia);
	}

}

	public static void main (String args[]){
		Insertar formmulario = new Insertar();
		formmulario.setBounds(100,100,500,400);
		formmulario.setVisible(true);
	}
}