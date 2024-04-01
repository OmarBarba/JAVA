import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


public class MODIFICAR extends JFrame implements ActionListener, FocusListener, KeyListener, MouseListener,ItemListener, ChangeListener{
	public JLabel etiqueta;
	public JLabel etiqueta2, etiqueta7;
	public JLabel etiqueta3, etiqueta4, etiqueta5, etiqueta6;
	public JLabel etiqueta8;

	public JButton boton1, bot;
	public JTextField campoTexto;
	public JTextField campotex;
	public JTextField campoTexto2, campoTexto3;
	public JTextField campoTexto4;
	String cadena;
	public JComboBox<String> combo,combo2;
	public JRadioButton radio1,radio2,radio3,radio4;

	public MODIFICAR(){
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		 radio1= new JRadioButton("Lunes");
	  radio1.setBounds(350,200,100,20);
	  add(radio1);

	radio2= new JRadioButton("Martes");
	  radio2.setBounds(350,230,100,20);
	  add(radio2);

	radio3= new JRadioButton("Miercoles");
	  radio3.setBounds(350,260,100,20);
	  add(radio3);

	  radio4= new JRadioButton("Jueves");
	  radio4.setBounds(350,290,100,20);
	  add(radio4);



		{etiqueta = new JLabel ("Nombre");
		etiqueta.setBounds(220, 200, 150, 15);
		add(etiqueta);}

		{etiqueta2 = new JLabel ("Domicilio");
		etiqueta2.setBounds(220, 230, 150, 15);
		add(etiqueta2);}

		{etiqueta3 = new JLabel ("correo");
		etiqueta3.setBounds(220, 260, 150, 15);
		add(etiqueta3);}

		{etiqueta4 = new JLabel ("Telefono");
		etiqueta4.setBounds(220, 290, 180, 15);
		add(etiqueta4);}

		{etiqueta5 = new JLabel ("Modificar datos del solicitante");
		etiqueta5.setBounds(10, 10, 180, 15);
		add(etiqueta5);}

		{etiqueta6 = new JLabel ("Ayuda ");
		etiqueta6.setBounds(300, 400, 150, 15);
		add(etiqueta6);}

		{etiqueta7 = new JLabel ("Tipo de cita ");
		etiqueta7.setBounds(220, 170, 150, 15);
		add(etiqueta7);}



		{boton1 = new JButton ("Actulizar");
		boton1.setBounds(60,330,100,30);
		add(boton1);}

		{campoTexto = new JTextField();
	   campoTexto.setBounds(50,200,150,25);
		add (campoTexto);}

	   { campotex = new JTextField();
	   campotex.setBounds(50,230,150,25);
	   add (campotex);}

	   { campoTexto2 = new JTextField();
	   campoTexto2.setBounds(50,260,150,25);
	   add (campoTexto2);}

	   {campoTexto3 = new JTextField();
	   campoTexto3.setBounds(50,290,150,25);
		add (campoTexto3);}

		{combo = new JComboBox<String>();
		combo.setBounds(60,170,90,20);
		add(combo);

		combo.addItem("Corte");
		combo.addItem("Barba");
		combo.addItem("Facial");
		}

		{bot = new JButton ("Modificar");
		bot.setBounds(260, 100, 100, 30);
		add(bot);}

		{etiqueta8 = new JLabel ("Nombre a: ");
		etiqueta8.setBounds(220, 80, 150, 15);
		add(etiqueta8);}

		{campoTexto4 = new JTextField();
	   campoTexto4.setBounds(50,50,150,100);
		add (campoTexto4);}

{combo2 = new JComboBox<String>();
		combo2.setBounds(350,40,90,20);
		add(combo2);
		combo2.addItem("09:00");
		combo2.addItem("10:00");
		combo2.addItem("11:00");
		combo2.addItem("12:00");
		}

	   setFocusable(true);
	   addKeyListener(this);



	   boton1.addActionListener(this);

	campotex.addKeyListener(this);
	campoTexto.addKeyListener(this);
	campoTexto2.addKeyListener(this);
	campoTexto3.addKeyListener(this);
	campoTexto.addFocusListener(this);

	combo.addItemListener(this);

	etiqueta6.addMouseListener(this);
	addMouseListener(this);

	radio1.addChangeListener(this);
	radio2.addChangeListener(this);
	radio3.addChangeListener(this);
	radio4.addChangeListener(this);
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
	JOptionPane.showMessageDialog(null,"Bienvenido acontinuacion te mostrare como es que funciona este programa: \n Para modificar los datos primero escriba el nombre en la primer area, luego de en el boton modificar \n LLenar los campos en el siguiente orden \n Nombre \n Domicilio \n correo \n Telefono ");

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

	}
public void stateChanged(ChangeEvent accion){
	if (radio1.isSelected()== true){
	//cadena="\n" + cadena +"\n Masculino \n";
	String cadena = "\n Genero: Masculino\n";
	}

}

public static void main (String args[]){
		MODIFICAR formmulario = new MODIFICAR();
		formmulario.setBounds(400,400,500,500);
		formmulario.setVisible(true);
	}
}