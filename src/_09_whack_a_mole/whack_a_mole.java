package _09_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whack_a_mole implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random random = new Random();
	int randomNum = random.nextInt();
	JButton box1 = new JButton("");
	JButton box2 = new JButton();
	JButton box3 = new JButton();
	JButton box4 = new JButton();
	JButton box5 = new JButton();
	JButton box6 = new JButton();
	JButton box7 = new JButton();
	JButton box8 = new JButton();
	JButton box9 = new JButton();
	JButton box10 = new JButton();
	JButton box11 = new JButton();
	JButton box12 = new JButton();
	JButton box13 = new JButton();
	JButton box14 = new JButton();
	JButton box15 = new JButton();
	JButton box16 = new JButton();
	JButton box17 = new JButton();
	JButton box18 = new JButton();
	JButton box19 = new JButton();
	JButton box20 = new JButton();
	JButton box21 = new JButton();
	JButton box22 = new JButton();
	JButton box23 = new JButton();
	JButton box24 = new JButton();
	
	
		// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		whack_a_mole wam = new whack_a_mole();
		wam.drawButtons(wam.randomNum);
		
	}
	


public void drawButtons(int randomNum) {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(800, 800));
	frame.add(panel);
	panel.setLayout(null);
	panel.addMouseListener(this);
	
	panel.add(box1);
	panel.add(box2);
	panel.add(box2);
	panel.add(box4);
	panel.add(box5);
	panel.add(box6);
	panel.add(box7);
	panel.add(box8);
	panel.add(box9);
	panel.add(box10);
	panel.add(box11);
	panel.add(box12);
	panel.add(box13);
	panel.add(box14);
	panel.add(box16);
	panel.add(box17);
	panel.add(box18);
	panel.add(box19);
	panel.add(box20);
	panel.add(box21);
	panel.add(box22);
	panel.add(box23);
	panel.add(box24);

	box1.setBounds(267, 760, 90, 40);
	
	
	
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
