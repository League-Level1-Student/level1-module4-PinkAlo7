package Alo_Game;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Alo_Game {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel manaFace;
int manaFaceX;
int manaFaceY;
int manaBodyX = 6;
int manaBodyY = 0;
int atiFaceX;
int atiFaceY;
int atiBodyX;
int atiBodyY;
JLabel m1 = loadImageFromComputer("mana_standing_heroically.jpg");
JLabel m2 = loadImageFromComputer("mana flying to the left.jpg");
JLabel m3 = loadImageFromComputer("mana punching forward while flying.jpg");
JLabel m4 = loadImageFromComputer("mana punching up.jpg");
JLabel m5 = loadImageFromComputer("mana running forward.jpg");
JLabel m6 = loadImageFromComputer("mana standing facing forward.jpg");
		


	public void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setPreferredSize(new Dimension (2000, 900));
		panel.setLayout(null);
		panel.add(m1);
		
		frame.add(panel);
		
JLabel manaFace = loadImageFromComputer("DSC01678.JPG");
JLabel atiFace = loadImageFromComputer("DSC01679.JPG");


frame.pack();
	}

public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
public void mouseClicked(MouseEvent e) {
	System.out.println(e.getX() + " " + e.getY());
}
}
