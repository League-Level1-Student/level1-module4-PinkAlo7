package _06_calculator;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
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
	add.setBounds(50, 201,165,50);
	subtract.setBounds(285, 201, 165, 50);
	multiplication.setBounds(510, 201, 165, 50);
	division.setBounds(735, 201, 165, 50);
	calculatorPanel.add(add);
	calculatorPanel.add(subtract);
	calculatorPanel.add(multiplication);
	calculatorPanel.add(division);
	calculatorPanel.add(answer);
	calculatorFrame.add(calculatorPanel);
	
	calculatorPanel.setPreferredSize(new Dimension(900,700));
	calculatorFrame.pack();
	calculatorPanel.addMouseListener(this);
	
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getX() + " " + e.getY());
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
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
