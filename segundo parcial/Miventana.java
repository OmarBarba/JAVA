import javax.swing.*;

public class Miventana extends JFrame{
	JLabel etiqueta;
	
	public Miventana(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		etiqueta = new JLabel ("Texto 1");
		etiqueta.setBounds(75,120,70,15);
		add(etiqueta);
		etiqueta = new JLabel ("Texto 2");
		etiqueta.setBounds(150,20,70,15);
		add(etiqueta);
		etiqueta = new JLabel ("Texto 3");
		etiqueta.setBounds(10,20,70,15);
		add(etiqueta);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		etiqueta = new JLabel ("Texto 5");
		etiqueta.setBounds(150,250,70,15);
		add(etiqueta);
		etiqueta = new JLabel ("Texto 4");
		etiqueta.setBounds(10,250,70,15);
		add(etiqueta);
	}
	
	
	
	public static void main(String args[]){
		{Miventana Miventana = new Miventana();
		Miventana.setBounds(10,20,230,300);
		Miventana.setVisible(true);}
		
		{Miventana Miventana1 = new Miventana();
		Miventana1.setBounds(1260,20,230,300);
		Miventana1.setVisible(true);}
		
		{Miventana Miventana2 = new Miventana();
		Miventana2.setBounds(20,500,230,300);
		Miventana2.setVisible(true);}
		
        {Miventana Miventana3 = new Miventana();
		Miventana3.setBounds(1260,500,230,300);
		Miventana3.setVisible(true);}
		
		 {Miventana Miventana4 = new Miventana();
		Miventana4.setBounds(630,250,230,300);
		Miventana4.setVisible(true);}
}
}