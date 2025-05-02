package _06_calculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener, MouseListener {
JFrame calculatorFrame = new JFrame();
JPanel calculatorPanel = new JPanel();
JTextField box1 = new JTextField();
JTextField box2 = new JTextField();
JButton add = new JButton("add");
JButton subtract = new JButton("subtract");
JButton multiplication = new JButton("multiplication");
JButton division = new JButton("division");
JLabel answer = new JLabel();


public void run() {
	calculatorFrame.setVisible(true);
	calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	calculatorPanel.setLayout(null);
	box1.setBounds(285,50, 170, 70);
	box2.setBounds(470,50,170, 70);
	calculatorPanel.add(box1);
	calculatorPanel.add(box2);
	add.setBounds(44, 201,170,50);
	subtract.setBounds(258, 201, 170, 50);
	multiplication.setBounds(472, 201, 170, 50);
	division.setBounds(686, 201, 170, 50);
	calculatorPanel.add(add);
	calculatorPanel.add(subtract);
	calculatorPanel.add(multiplication);
	calculatorPanel.add(division);
	calculatorPanel.add(answer);
	calculatorFrame.add(calculatorPanel);
	calculatorPanel.add(answer);
	answer.setBounds(0, 388, 900, 60);
	calculatorPanel.addMouseListener(this);
	calculatorPanel.setPreferredSize(new Dimension(900,700));
	calculatorFrame.pack();
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiplication.addActionListener(this);
	division.addActionListener(this);
	answer.setHorizontalAlignment(JLabel.CENTER);
answer.setFont(new Font("Arial", Font.PLAIN, 40));
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String n1 = box1.getText();
	double num1 = Double.parseDouble(n1);
	String n2 = box2.getText();
	double num2 = Double.parseDouble(n2);
		if(e.getSource() == add) {
	answer.setText(String.valueOf(num1 + num2));
	}
		if(e.getSource() == subtract) {
			answer.setText(String.valueOf(num1 - num2));
		}
		if(e.getSource() == multiplication) {
			answer.setText(String.valueOf(num1*num2));
		}
		if(e.getSource() == division) {
			answer.setText(String.valueOf(num1/num2));
		}
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getX() + " " + e.getY());
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




}


