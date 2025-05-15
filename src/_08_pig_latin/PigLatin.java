package _08_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatin implements MouseListener, ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField textfield1 = new JTextField();
JTextField textfield2 = new JTextField();
JButton translate1 = new JButton("Translate "
		+ "\nto Pig Latin");
JButton translate2 = new JButton("Translate to English");
  public static void main(String[] args) {
	new PigLatin().run();
}
public void run() {
	frame.setVisible(true);
	frame.add(panel);
	panel.setPreferredSize(new Dimension(800, 300));
	panel.setLayout(null);
	panel.addMouseListener(this);
	translate1.addActionListener(this);
	translate2.addActionListener(this);
	panel.add(textfield1);
	panel.add(textfield2);
	panel.add(translate1);
	panel.add(translate2);
	textfield1.setBounds(38, 60, 470, 60);
	textfield2.setBounds(38, 150, 470, 60);
	translate1.setBounds(551, 52, 200, 80);
	translate2.setBounds(551, 146, 200, 80);
	frame.pack();
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == translate1) {
		textfield2.setText(PigLatinTranslator.translateEnglishToPigLatin(textfield1.getText()));
		Sound.speak(textfield2.getText());
	}
	if(e.getSource() == translate2) {
		textfield1.setText(PigLatinTranslator.translatePigLatinToEnglish(textfield2.getText()));
		Sound.speak(PigLatinTranslator.translatePigLatinToEnglish(textfield2.getText()));
	}
}
}
