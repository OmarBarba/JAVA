import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuT extends JFrame implements ActionListener{

	public JMenuBar menubar;
	public JMenu menu1, menu2, menu3,menu4, menu5;
	public JMenuItem menuitem1, menuitem2, menuitem3;
	public JMenuItem menuitem4, menuitem5, menuitem6,menuitem7,menuitem8,menuitem9;
	public JLabel etiqueta;

public MenuT(){

	  setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Ventana con Menus");

	menubar = new JMenuBar();
	setJMenuBar(menubar);

    menu1=new JMenu("conf");
	menubar.add(menu1);
	menu2=new JMenu("Titulo");
	menubar.add(menu2);
	menu3=new JMenu("ventana");
	menubar.add(menu3);
	menu4=new JMenu("Size");
	menu5=new JMenu("Color");
	//conf
	{menuitem1 = new JMenuItem("240*480");
	menuitem2 = new JMenuItem("640*720");
	menuitem3 = new JMenuItem("Rojo");
	menuitem5 = new JMenuItem("Azul");
	menuitem4 = new JMenuItem("Verde");
	menu1.add(menu4);
	menu4.add(menuitem2);
	menu4.add(menuitem1);
	menu1.add(menu5);
	menu5.add(menuitem3);
	menu5.add(menuitem4);
	menu5.add(menuitem5);}

	//titulo
	{menuitem6 = new JMenuItem("Titulo original");
	menuitem7 = new JMenuItem("Titulo nuevo");
	menu2.add(menuitem6);
	menu2.add(menuitem7);}

	//ventana
	{menuitem8 = new JMenuItem("ventana pre-hecha");
	menuitem9 = new JMenuItem("Calculadora");
	menu3.add(menuitem8);
	menu3.add(menuitem9);
	}

		menuitem1.addActionListener(this);
	menuitem2.addActionListener(this);
	menuitem3.addActionListener(this);
	menuitem4.addActionListener(this);
	menuitem5.addActionListener(this);
	menuitem6.addActionListener(this);
	menuitem7.addActionListener(this);
	menuitem8.addActionListener(this);
	menuitem9.addActionListener(this);
}

	 public void actionPerformed(ActionEvent e ){

  if (e.getSource()==menuitem1){
  setSize(240,480);
  }
  if (e.getSource()==menuitem2){
  setSize(640,720);
  }
  if (e.getSource()==menuitem3){
  getContentPane().setBackground(new Color (255,0,0));
  }
  if (e.getSource()==menuitem4){
  getContentPane().setBackground(new Color (0,255,0));
  }
  if (e.getSource()==menuitem5){
  getContentPane().setBackground(new Color (0,0,255));
  }
 if (e.getSource()==menuitem6){
  setTitle("Menus");
  }
 if (e.getSource()==menuitem7){
String  titulo = JOptionPane.showInputDialog("Ingresa un nuevo Titulo");
		setTitle(titulo);
  }
 if (e.getSource()==menuitem8){
	JOptionPane.showMessageDialog(null, "Gracias por utilizarlo");
  }
  if (e.getSource()==menuitem9){
  	Micalc calc = new Micalc();
		calc.setBounds(20,20,400,400);
		calc.setVisible(true);
  }



 }

public static void main (String args []){
	 MenuT menus = new MenuT();
	 menus.setBounds(200,300,400,400);
	 menus.setVisible(true);
	 menus.setResizable(true);
	 }


 }

