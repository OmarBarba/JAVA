import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Tienda extends JFrame implements ActionListener, ItemListener{

	public JLabel etiqueta;
	public JLabel etiqueta1;
	public JLabel etiqueta2;
	public JLabel etiqueta3;
	public JLabel etiqueta4;
	public JComboBox<String> combo;
	public JComboBox<String> combo1;
	public JComboBox<String> combo2;
	public JComboBox<String> combo3;
	public JComboBox<String> combo4;
	public JComboBox<String> combo5;
	public JComboBox<String> combo6;
	public JComboBox<String> combo7;
	public JComboBox<String> combo8;
	public JTextArea campotex;
	public String texto;
	public String texto1;
	public String texto2;
	public String texto3;
	public String texto4;
	public String texto5;
	public String texto6;
	public String texto7;
	public String texto8;
	public String f;
	public JButton boton;
	public JScrollPane scroll, scroll1;
	JPanel miPanel;



	public Tienda(){


		setDefaultCloseOperation(EXIT_ON_CLOSE);


		miPanel = new JPanel();
		miPanel.setLayout(null);

		{etiqueta = new JLabel ("Tienda ");
		etiqueta.setBounds(100,10,400,40);
		add(etiqueta);}

		//Pantalon

		{etiqueta1 = new JLabel ("Pantalon");
		etiqueta1.setBounds(20,20,100,40);
		miPanel.add(etiqueta1);}

		{combo = new JComboBox<String>();
		combo.setBounds(20,60,90,20);
		miPanel.add(combo);

		combo.addItem("Color");
		combo.addItem("Mezclilla");
		combo.addItem("Gris");
		combo.addItem("Azul");
		combo.addItemListener(this);}

		{combo1 = new JComboBox<String>();
		combo1.setBounds(20,85,90,20);
		miPanel.add(combo1);

		combo1.addItem("Talla");
		combo1.addItem("Ch");
		combo1.addItem("M");
		combo1.addItem("G");
		combo1.addItem("EG");
		combo1.addItemListener(this);}

		{combo2 = new JComboBox<String>();
		combo2.setBounds(20,110,90,20);
		miPanel.add(combo2);

		combo2.addItem("Corte");
		combo2.addItem("Slim");
		combo2.addItem("Campana");
		combo2.addItem("Recto");
		combo2.addItemListener(this);}

		//Camisa

		{etiqueta2 = new JLabel ("Camisas");
		etiqueta2.setBounds(20,130,100,40);
		miPanel.add(etiqueta2);}

		{combo3 = new JComboBox<String>();
		combo3.setBounds(20,160,90,20);
		miPanel.add(combo3);

		combo3.addItem("Color");
		combo3.addItem("Blanca");
		combo3.addItem("Gris");
		combo3.addItem("Azul");
		combo3.addItemListener(this);}

		{combo4 = new JComboBox<String>();
		combo4.setBounds(20,185,90,20);
		miPanel.add(combo4);

		combo4.addItem("Talla");
		combo4.addItem("Ch");
		combo4.addItem("M");
		combo4.addItem("G");
		combo4.addItem("EG");
		combo4.addItemListener(this);}

		{combo5 = new JComboBox<String>();
		combo5.setBounds(20,210,90,20);
		miPanel.add(combo5);

		combo5.addItem("Manga");
		combo5.addItem("Corta");
		combo5.addItem("Larga");
		combo5.addItemListener(this);}

		//calcetas

		{etiqueta3 = new JLabel ("Calcetas");
		etiqueta3.setBounds(20,230,100,40);
		miPanel.add(etiqueta3);}

		{combo6 = new JComboBox<String>();
		combo6.setBounds(20,260,90,20);
		miPanel.add(combo6);

		combo6.addItem("Color");
		combo6.addItem("Blanca");
		combo6.addItem("Gris");
		combo6.addItem("Azul");
		combo6.addItemListener(this);}

		//Ropa Niño
		{etiqueta4 = new JLabel ("Ropa Nin@");
		etiqueta4.setBounds(20,290,100,40);
		miPanel.add(etiqueta4);}

		{combo7 = new JComboBox<String>();
		combo7.setBounds(20,320,90,20);
		miPanel.add(combo7);

		combo7.addItem("Ropa Nin@");
		combo7.addItem("Nino");
		combo7.addItem("Nina");
		combo7.addItemListener(this);}

		{combo8 = new JComboBox<String>();
		combo8.setBounds(20,350,90,20);
		miPanel.add(combo8);

		combo8.addItem("meses");
		combo8.addItem("2-4");
		combo8.addItem("4-8");
		combo8.addItem("9-12");
		combo8.addItem("1a");
		combo8.addItem("2a");
		combo8.addItemListener(this);}

		//Muestra
		{campotex = new JTextArea();
		miPanel.add (campotex);}

		scroll1 = new JScrollPane(campotex);
		scroll1.setBounds(300,100,100,100);
		miPanel.add(scroll1);

		// Boton
		{ boton = new JButton ("Hacer pedido");
		boton.setBounds(130, 220, 100, 30);
		miPanel.add(boton);
		boton.addActionListener(this);
	}

		//SCROLL


		scroll = new JScrollPane(miPanel);
		miPanel.setPreferredSize(new Dimension(500,500));
		scroll.getVerticalScrollBar().setUnitIncrement(16);
		add(scroll);

	}

	public void itemStateChanged(ItemEvent accion){
	texto=  "Pantalon "+ "\n Color " + combo.getSelectedItem().toString();
	texto1= "\nTalla " + combo1.getSelectedItem().toString();
	texto2= "\n Corte "+ combo2.getSelectedItem().toString();
	texto3=  "\n\n Camisa: "+ "\n Color "+combo3.getSelectedItem().toString();
	texto4= "\nTalla " + combo4.getSelectedItem().toString();
	texto5=  "\n Manga " + combo5.getSelectedItem().toString();
	texto6=  "\n\n Calcetas: "+ "\n Color " + combo6.getSelectedItem().toString();
	texto7= "\n\n Ropa nin "+ "\nGenero "+ combo7.getSelectedItem().toString();
	texto8=  "\n Meses "+ combo8.getSelectedItem().toString();

	f= texto  + texto1  + texto2  +  texto3 + texto4 +  texto5 +texto6+ texto7 + texto8 ;
	}

	public void actionPerformed(ActionEvent accion){
		if( accion.getSource() == boton ){
		campotex.setText(f);}
	}
	public static void main (String args[]){

		Tienda ventana = new Tienda();
		ventana.setBounds(200,100,400,400);
		ventana.setVisible(true);
		ventana.setResizable(true);

	}


}