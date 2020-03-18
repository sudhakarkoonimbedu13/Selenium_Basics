package com.advanceduserinteractions;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormDemo1 extends JFrame {

	
	public void start() { 
		
		JLabel l=new JLabel(); 
		
		l.setText("	Username :"); 
		
		JTextField usernameField=new JTextField(10); 
		
		JLabel l1=new JLabel();
		
		l1.setText(" Password :");
		
		JPasswordField ps=new JPasswordField(10);
		
		JButton but=new JButton();
		
		but.setText("Submit");
		//setSize(100,120);	
		add(l); 
		add(usernameField);
		//setSize(200,220);
		add(l1);
		add(ps); 
		add(but); 
		but.addActionListener( new ActionListener()
		{ 
			public void actionPerformed( ActionEvent e)
			{ l.setText("Button clicked"); 
			} 
			} ); 
		setLayout(new FlowLayout()); 
		setSize(400,400); 
		setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		} 
	public static void main(String args[]) { new FormDemo1().start(); }

	//Read more: http://mrbool.com/how-to-create-a-form-and-simple-frame-with-java-swing/25408#ixzz5YJvn9RnB

}
