import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Encuesta extends JFrame implements ItemListener, ActionListener, ChangeListener{
  public JRadioButton radio1,radio2,radio3,radio4;
  public JLabel etiqueta,etiqueta1,etiqueta2,etiqueta3,etiqueta4;
  public JCheckBox check1,check2,check3,check4,check5,check6;
  public JComboBox<String> combo;
  public String texto ="";
  public JTextArea campotex;
  public JButton boton;
  public String cadena3= " ";
  public String cadena2= "";
  public String cadena1= " ";
  public String cadena11= " ";
  public String cadena12= " ";
  public String cadena13= " ";
  public String cadena14= " ";
  public String cadena15= " ";
  public String cadena= " ";
  public String cadenax= " ";
  public ButtonGroup genero, turno;

   public String f= " ";
   public String a= "";
  public String b= "";

  public Encuesta(){
	  setLayout(null);
	  setTitle("Encuesta");
	  setDefaultCloseOperation(EXIT_ON_CLOSE);

	  //Municipio
	  {etiqueta1 = new JLabel ("Municipio");
	  etiqueta1.setBounds(40,50,300,20);
	  add(etiqueta1);
	  }
	  {combo = new JComboBox<String>();
		combo.setBounds(40,75,90,20);
		add(combo);

		combo.addItem("Municipio");
		combo.addItem("Zapopan");
		combo.addItem("Tlaquepaque");
		combo.addItem("Gdl");
		combo.addItem("Tonala");
		combo.addItemListener(this);}

	  //Genero
	 {etiqueta2 = new JLabel ("Genero");
	  etiqueta2.setBounds(40,100,300,20);
	  add(etiqueta2);
	  }
	 {radio1= new JRadioButton("Masculino");
	  radio1.setBounds(40,130,100,20);
	  add(radio1);
	  radio1.addChangeListener(this);
	  }
	 {radio2= new JRadioButton("Femenino");
	  radio2.setBounds(40,160,100,20);
	  add(radio2);
	 radio2.addChangeListener(this);
	  }

	 //Grado de estudio
	  {etiqueta3 = new JLabel ("Grado de Estudio");
	  etiqueta3.setBounds(40,190,300,20);
	  add(etiqueta3);
	  }
	  { check1= new JCheckBox("Licenciatura");
	  check1.setBounds(40,210,100,20);
	  add(check1);
	  check1.addChangeListener(this);
  }
	  { check2= new JCheckBox("Maestria");
	  check2.setBounds(40,240,100,20);
	  add(check2);
	  check2.addChangeListener(this);
	  }
	  {check3= new JCheckBox("Doctorado");
	  check3.setBounds(40,270,100,20);
	  add(check3);
	  check3.addChangeListener(this);
	  }

	  //Gustos
	  {etiqueta4 = new JLabel ("Gustos");
	  etiqueta4.setBounds(40,300,300,20);
	  add(etiqueta4);
	  }
	  {check4= new JCheckBox("Leer");
	  check4.setBounds(40,330,100,20);
	  add(check4);
	  check4.addChangeListener(this);
	  }
	  { check5= new JCheckBox("Correr");
	  check5.setBounds(40,360,100,20);
	  add(check5);
	  check5.addChangeListener(this);
  }
	  { check6= new JCheckBox("Bicicleta");
	  check6.setBounds(40,390,100,20);
	  add(check6);
	  check6.addChangeListener(this);
	  }

	  //Horarios
	  {etiqueta = new JLabel ("Horario");
	  etiqueta.setBounds(40,420,300,20);
	  add(etiqueta);
	  }
	  {radio3= new JRadioButton("Matutino");
	  radio3.setBounds(40,440,100,20);
	  add(radio3);
	  radio3.addChangeListener(this);
	  }
	  {radio4= new JRadioButton("Vespertino");
	  radio4.setBounds(40,470,100,20);
	  add(radio4);
	  radio4.addChangeListener(this);
	  }

	  //titulo
	  {etiqueta = new JLabel ("");
	  etiqueta.setBounds(0,0,300,20);
	  add(etiqueta);
	  }

	  //Muestra
		{campotex = new JTextArea();
		campotex.setBounds(250,10,300,510);
		add (campotex);}
		//boton
		{ boton = new JButton ("Enviar");


		boton.setBounds(40, 500, 100, 30);
		add(boton);
		boton.addActionListener(this);
	}
	genero = new ButtonGroup();
	turno  = new ButtonGroup();

	genero.add(radio1);
	genero.add(radio2);
	turno.add(radio3);
	turno.add(radio4);

  }// fin del constructor

  public void itemStateChanged(ItemEvent accion){
		f=combo.getSelectedItem().toString();
		f = f + "\n";

  }

  public void stateChanged(ChangeEvent accion){


	{if (radio1.isSelected()== true){
	//cadena="\n" + cadena +"\n Masculino \n";
	cadena = "\n Genero: Masculino\n";
	}
	if (radio2.isSelected()== true){
	//cadenax="\n" + cadenax +"\n Femenino \n";
	cadena = "\n Genero: Femenino\n";
	}
	}

	cadena1= " ";
	{if (check1.isSelected()== true){
		a= "\n"+ "Nivel de estudios:  ";
	cadena1=  "Licenciatura \n";}
	cadena11= " ";
	if (check2.isSelected()== true){a= "\n"+ "Nivel de estudios:  ";
	cadena11= cadena11 +" Maestria \n";}
	cadena12= " ";
	if (check3.isSelected()== true){a= "\n"+ "Nivel de estudios:  ";
	cadena12= cadena12 +" Doctorado \n";}}

	cadena13= " ";
	{if (check4.isSelected()== true){
		b= "\n"+ "Gustos:  ";
	cadena13=cadena13+"\n Leer ";}
	cadena14= " ";
	if (check5.isSelected()== true){
		b= "\n"+ "Gustos:  ";
	cadena14= cadena14 +"\n Correr ";}
	cadena15= " ";
	if (check6.isSelected()== true){
		b= "\n"+ "Gustos:  ";
	cadena15= cadena15 +"\n Bicicleta ";}}


	{if (radio3.isSelected()== true){
	cadena3="\n Turno: Matutino \n";}
	if (radio4.isSelected()== true){
	cadena3="\n Turno: Vespertino \n";}}


  }

  public void actionPerformed(ActionEvent accion){

	    campotex.setText("");

		texto= f + cadena+ cadenax + a+ cadena1+cadena11+cadena12+b+cadena13+cadena14+cadena15 + cadena2 + cadena3;

		if( accion.getSource() == boton ){
		campotex.setText(texto);}
	}

  public static void main(String args[]){
	Encuesta ventana = new Encuesta();
	ventana.setBounds (200,200,600,600);
	ventana.setVisible(true);
	ventana.setResizable(true);
  }

}