import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import java.sql.*;

public class Prin extends JFrame implements ActionListener{

	public JMenuBar menubar;
	public JMenu menu1, menu2, menu3,menu4;
	public JMenuItem menuitem1, menuitem2;
	public JMenuItem  menuitem6,menuitem7,menuitem9;
	public JLabel etiqueta;
	public JTextField campoTexto;
	public JPanel panel1, panel2;
	public JScrollPane scroll, scroll1;
	public JLabel etiqueta1, etiqueta2;
	public JTextField campoTexto1;
	public JLabel et,et1,et2,et3,et4,et5,et6,et7,et8,et9;
	public JLabel et10,et11,et12,et13,et14,et15,et16,et17,et18,et19,imagen1;
	public JButton boton,boton1,boton2;
	public JTextArea areaTexto;
	public JButton bot;
	public String cadena="";
	int num=0;

public Prin(){

	setLayout(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setTitle("Control de citas");
//ventanas
{
	{panel1= new JPanel();
	panel1.setLayout(null);
	panel1.setBounds(0,0,600,600);
	panel1.setBackground(new Color (0,240,255));
	panel1.setVisible(true);
	add(panel1);}

	{panel2= new JPanel();
	panel2.setLayout(null);
	panel2.setBounds(0,0,600,600);
	panel2.setBackground(Color.GREEN);
	panel2.setVisible(false);
	add(panel2);}

}

//menus
{
	{menubar = new JMenuBar();
	setJMenuBar(menubar);}

    {menu1=new JMenu("Configurar");
	menubar.add(menu1);
	menu2=new JMenu("Ver cita");
	menubar.add(menu2);
	menu3=new JMenu("Calculadora");
	menubar.add(menu3);
	menu4=new JMenu("Size");}

	//conf
	{menuitem1 = new JMenuItem("1920*1080");
	menuitem2 = new JMenuItem("640*720");
	menu1.add(menu4);
	menu4.add(menuitem2);
	menu4.add(menuitem1);

	}

	//titulo
	{menuitem6 = new JMenuItem("volver a principal ");
	menuitem7 = new JMenuItem("Generar cita");
	menu2.add(menuitem6);
	menu2.add(menuitem7);}

	//ventana
	{
	menuitem9 = new JMenuItem("Calculadora");

	menu3.add(menuitem9);
	}

}

// diseño de la primer ventana
{
	{areaTexto = new JTextArea();
	panel1.add (areaTexto);
	scroll1 = new JScrollPane(areaTexto);
	scroll1.setBounds(200,100,300,400);
	panel1.add(scroll1);}

	Font fuente = new Font("Arial", Font.PLAIN, 30);
	etiqueta = new JLabel ("Citas hechas");
	etiqueta.setBounds(10, 300, 400, 80);
	etiqueta.setFont(fuente);
	//etiqueta.setForeground(Color.Blue);
	panel1.add(etiqueta);

	{etiqueta1 = new JLabel ("Barberia OMARCITO");
	etiqueta1.setBounds(10, 0, 350, 150);
	etiqueta1.setFont(fuente);
	panel1.add(etiqueta1);
	}

	ImageIcon imagen = new ImageIcon("descarga.jpeg");
	imagen1= new JLabel (imagen);
	imagen1.setBounds(20,100,150,150);
	Icon icono = new ImageIcon (imagen.getImage().getScaledInstance(imagen1.getWidth(), imagen1.getHeight(), Image.SCALE_DEFAULT));
	imagen1.setIcon(icono);
	panel1.add(imagen1);
	
	bot = new JButton ("Ver Citas");
		bot.setBounds(10, 400, 150, 30);
		panel1.add(bot);
}

// diseño de la segunda ventana
{
	{et = new JLabel ("Barberia OMAR");
	et.setBounds(220, 10, 150, 15);
	panel2.add(et);
	}

	{et1 = new JLabel ("Horarios de atencion");
	et1.setBounds(220, 40, 150, 15);
	panel2.add(et1);
	}

	{et2 = new JLabel ("LUNES ");
	et2.setBounds(50, 70, 150, 15);
	panel2.add(et2);
	}

	{et3 = new JLabel ("MARTES");
	et3.setBounds(110, 70, 150, 15);
	panel2.add(et3);
	}

	{et4 = new JLabel ("MIERCOLES");
	et4.setBounds(180, 70, 150, 15);
	panel2.add(et4);
	}

	{et5 = new JLabel ("JUEVES");
	et5.setBounds(270, 70, 150, 15);
	panel2.add(et5);
	}




//LUNES
{
	{et5 = new JLabel ("09:00");
	et5.setBounds(50, 95, 150, 15);
	panel2.add(et5);
	}

	{et6 = new JLabel ("10:00");
	et6.setBounds(50, 120, 150, 15);
	panel2.add(et6);
	}

	{et7 = new JLabel ("11:00");
	et7.setBounds(50, 150, 150, 15);
	panel2.add(et7);
	}

	{et6 = new JLabel ("12:00");
	et6.setBounds(50, 180, 150, 15);
	panel2.add(et6);
	}

}
//MARTES
{
	{et8 = new JLabel ("09:00");
	et8.setBounds(110, 95, 150, 15);
	panel2.add(et8);
	}

	{et9 = new JLabel ("10:00");
	et9.setBounds(110, 120, 150, 15);
	panel2.add(et9);
	}

	{et10 = new JLabel ("11:00");
	et10.setBounds(110, 150, 150, 15);
	panel2.add(et10);
	}

	{et11 = new JLabel ("12:00");
	et11.setBounds(110, 180, 150, 15);
	panel2.add(et11);
	}

}

//MIERCOLES
{
	{et8 = new JLabel ("09:00");
	et8.setBounds(180, 95, 150, 15);
	panel2.add(et8);
	}

	{et9 = new JLabel ("10:00");
	et9.setBounds(180, 120, 150, 15);
	panel2.add(et9);
	}

	{et10 = new JLabel ("11:00");
	et10.setBounds(180, 150, 150, 15);
	panel2.add(et10);
	}

	{et11 = new JLabel ("12:00");
	et11.setBounds(180, 180, 150, 15);
	panel2.add(et11);
	}

}

//JUEVES
{
	{et8 = new JLabel ("09:00");
	et8.setBounds(270, 95, 150, 15);
	panel2.add(et8);
	}

	{et9 = new JLabel ("10:00");
	et9.setBounds(270, 120, 150, 15);
	panel2.add(et9);
	}

	{et10 = new JLabel ("11:00");
	et10.setBounds(270, 150, 150, 15);
	panel2.add(et10);
	}

	{et11 = new JLabel ("12:00");
	et11.setBounds(270, 180, 150, 15);
	panel2.add(et11);
	}
	
}



	{ boton = new JButton ("GENERAR CITA");
	boton.setBounds(50, 270, 200, 30);
	panel2.add(boton);
	}

	{ boton1 = new JButton ("MODIFICAR CITA");
	boton1.setBounds(300, 270, 200, 30);
	panel2.add(boton1);
	}


}

//agragar para funcion
{
	menuitem1.addActionListener(this);
	menuitem2.addActionListener(this);
	menuitem6.addActionListener(this);
	menuitem7.addActionListener(this);


	menuitem9.addActionListener(this);
	boton.addActionListener(this);
	boton1.addActionListener(this);
	bot.addActionListener(this);
}

}

	 public void actionPerformed(ActionEvent e ){

if (e.getSource()==menuitem1){
  setSize(1920,1080);
  panel1.setSize(1920,1080);
  panel2.setSize(1920,1080);
  }
if (e.getSource()==menuitem2){
  setSize(720,640);
   panel1.setSize(720,640);
  panel2.setSize(720,640);
  }
if (e.getSource()==menuitem6){
  panel1.setVisible(true);
  panel2.setVisible(false);
 	 }
if (e.getSource()==menuitem7){
	panel1.setVisible(false);
	panel2.setVisible(true);
 	 }
	
if (e.getSource()==menuitem9){
	Micalc calc = new Micalc();
		calc.setBounds(800,300,400,400);
		calc.setVisible(true);
  	}
if( e.getSource() == boton1 ){
		MODIFICAR formmulario = new MODIFICAR();
		formmulario.setBounds(400,400,500,500);
		formmulario.setVisible(true);
		}
if( e.getSource() == boton ){
		Insertar formmulario = new Insertar();
		formmulario.setBounds(100,100,500,500);
		formmulario.setVisible(true);}

if(e.getSource()== bot){

	Connection cn = null;
	PreparedStatement pst = null;
	ResultSet rs= null;
	String AccionSQL = " ";
	int num=0;
	System.out.println("A punto de conectar ");
	try{

		cn = DriverManager.getConnection("jdbc:mysql://localhost/basedatos","root","");
		System.out.println("conexion exitosa");

		
		AccionSQL = "SELECT * FROM datos";
		pst = cn.prepareStatement(AccionSQL);
		rs= pst.executeQuery();

		while(rs.next()){
		cadena= cadena + "\n\tCitas\n\n" + "  Nombre:  "+
			rs.getString("Nombre")+"\n domicilio"+"\t"+
			rs.getString("Domicilio")+"\n Correo"+"\t"+
			rs.getString("Correo")+"\n Telefono"+"\t"+
			rs.getString("Telefono")+"\n Dia"+"\t"+
			rs.getString("Dia")+"\n Hora"+"\t"+
			rs.getString("Hora")+"\n Tipo"+"\t"+
			rs.getString("Tipo")+"\n";

		}

	if(num==0) cadena=cadena + "\n\tSon todas las citas hoy";

	}
	catch(Exception a){
		System.out.println("Algo salio mal"+a.getMessage());
	}
	try{
	if(pst != null) pst.close();
	if(cn !=null)cn.close();
} catch (SQLException a){
	System.out.println("Algo salio mal1"+a.getMessage());
}
	areaTexto.setText(cadena);
		}
 }

public static void main (String args []){
	 Prin menus = new Prin();
	 menus.setBounds(100,100,600,600);
	 menus.setVisible(true);
	 menus.setResizable(true);
	 }


 }
