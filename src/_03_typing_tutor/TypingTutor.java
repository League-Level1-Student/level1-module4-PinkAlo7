package _03_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame typingFrame = new JFrame();
	JPanel typingPanel = new JPanel();
	JLabel typingLabel = new JLabel();
	char currentLetter;



	public static void main(String[] args) {
		new TypingTutor().setup();
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}



	public void setup() {
		typingFrame.setVisible(true);
		typingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		typingLabel.setText(String.valueOf(currentLetter));
		typingLabel.setFont(typingLabel.getFont().deriveFont(28.0f));
		typingLabel.setHorizontalAlignment(JLabel.CENTER);
		typingFrame.addKeyListener(this);
		typingPanel.add(typingLabel);
		typingFrame.add(typingPanel);
		typingFrame.pack();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		System.out.println( keyEvent.getKeyChar() );
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		generateRandomLetter();
		typingLabel.setText(String.valueOf(currentLetter));
	}
}
