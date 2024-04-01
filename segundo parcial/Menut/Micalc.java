import javax.swing.*;
import java.awt.event.*;

public class Micalc extends JFrame implements ActionListener{
	
	
	public JButton boton;
	public JButton boton1;
	public JButton boton2;
	public JButton boton3;
	public JButton boton4;
	public JButton boton5;
	public JButton boton6;
	public JButton boton7;
	public JButton boton8;
	public JButton boton9;
	public JButton boton10;
	public JButton boton11;
	public JButton boton12;
	public JButton boton13;
	public JButton boton14;
	public JButton boton15;
	public JTextField campoTexto;
	
	public String op;
	public String Resultado;
	public float num1;
	public float num2;
	public float val;
	
	public Micalc(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		boton = new JButton ("1");
		boton.setBounds(35, 240, 50, 50);
		add(boton);
		
		boton1 = new JButton ("0");
		boton1.setBounds(20,300,200,50);
		add(boton1);
		
		boton2 = new JButton ("2");
		boton2.setBounds(95, 240, 50, 50);
		add(boton2);
		boton3 = new JButton ("3");
		boton3.setBounds(155, 240, 50, 50);
		add(boton3);
		boton4 = new JButton ("4");
		boton4.setBounds(35, 180, 50, 50);
		add(boton4);
		
		boton5 = new JButton ("5");
		boton5.setBounds(95, 180, 50, 50);
		add(boton5);
		
		boton6 = new JButton ("6");
		boton6.setBounds(155, 180, 50, 50);
		add(boton6);
		
		boton7 = new JButton ("7");
		boton7.setBounds(35, 115, 50, 50);
		add(boton7);
       
		boton8 = new JButton ("8");
		boton8.setBounds(95, 115, 50, 50);
		add(boton8);
	   
		boton9 = new JButton ("9");
		boton9.setBounds(155, 115, 50, 50);
		add(boton9);
	   
	   boton10 = new JButton ("CE");
		boton10.setBounds(240, 115, 50, 50);
		add(boton10);
	   
	   boton11	   = new JButton ("-");
		boton11.setBounds(300, 115, 50, 50);
		add(boton11);
	   
	   boton12 = new JButton ("x");
		boton12.setBounds(240, 180, 50, 50);
		add(boton12);
	   
	   boton13 = new JButton ("/");
		boton13.setBounds(300, 180, 50, 50);
		add(boton13);
		
		boton14 = new JButton ("=");
		boton14.setBounds(300, 240, 50, 100);
		add(boton14);
		
		boton15 = new JButton ("+");
		boton15.setBounds(240, 240, 50, 100);
		add(boton15);
	   
	   
	   campoTexto = new JTextField(); //listo
	   campoTexto.setBounds(10,10,370,100);
	   add (campoTexto);
	  
	   
	   boton.addActionListener(this);
	   boton1.addActionListener(this);
	   boton2.addActionListener(this);
	   boton3.addActionListener(this);
	   boton4.addActionListener(this);
	   boton5.addActionListener(this);
	   boton6.addActionListener(this);
	   boton7.addActionListener(this);
	   boton8.addActionListener(this);
	   boton9.addActionListener(this);
	   boton10.addActionListener(this);
	   boton11.addActionListener(this);
	   boton12.addActionListener(this);
	   boton13.addActionListener(this);
	   boton14.addActionListener(this);
	   boton15.addActionListener(this);
	   
	}
	
	public void actionPerformed(ActionEvent accion){
			if( accion.getSource() == boton ){
			campoTexto.setText(campoTexto.getText()+"1");}
			if(accion.getSource() == boton1){
		campoTexto.setText(campoTexto.getText()+"0");
		}
			if(accion.getSource() == boton2){
		campoTexto.setText(campoTexto.getText()+"2");
		}
			if(accion.getSource() == boton3){
		campoTexto.setText(campoTexto.getText()+"3");
		}
			if(accion.getSource() == boton4){
		campoTexto.setText(campoTexto.getText()+"4");
		}
			if(accion.getSource() == boton5){
		campoTexto.setText(campoTexto.getText()+"5");
		}
			if(accion.getSource() == boton6){
		campoTexto.setText(campoTexto.getText()+"6");
		}
			if(accion.getSource() == boton7){
		campoTexto.setText(campoTexto.getText()+"7");
		}
			if(accion.getSource() == boton8){
		campoTexto.setText(campoTexto.getText()+"8");
		}
			if(accion.getSource() == boton9){
		campoTexto.setText(campoTexto.getText()+"9");
		}
			if(accion.getSource() == boton10){
		campoTexto.setText("");
		}
			if(accion.getSource() == boton11){
		num1=Float.parseFloat(campoTexto.getText());
		op="-";
		campoTexto.setText("");
		}
			if(accion.getSource() == boton12){
		num1=Float.parseFloat(campoTexto.getText());
		op="x";
		campoTexto.setText("");
		}
			if(accion.getSource() == boton13){
		num1=Float.parseFloat(campoTexto.getText());
		op="/";
		campoTexto.setText("");
		}
			if(accion.getSource() == boton14){
		num2=Float.parseFloat(campoTexto.getText());
		if(op.equals("+"))
		{
		val=num1+num2;
		}
		if(op.equals("-")) {
		val=num1-num2;
		}
		if(op.equals("x")) {
		val=num1*num2;
		}
		if(op.equals("/")) {
		val=num1/num2;
		}
		
		Resultado=Float.toString(val);
		campoTexto.setText(Resultado);
		}
		
		
		if(accion.getSource() == boton15){
		num1=Float.parseFloat(campoTexto.getText());
		op="+";
		campoTexto.setText("");
		}
	}
	
	public static void main (String args[]){
		Micalc calc = new Micalc();
		calc.setBounds(200,200,400,400);
		calc.setVisible(true);
	}
	
	}