package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _03_gui_with_help._2_photo_quiz.PhotoQuiz;

public class ChuckleClicker implements ActionListener {
	JFrame platform = new JFrame("Make Buttons");
	JPanel chucklePanel = new JPanel();
	JButton joke = new JButton("Joke");
	JButton punchline = new JButton("Punchline");
	
	
	
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}
	
	
	
	

	void makeButtons() {
		platform.add(chucklePanel);
		chucklePanel.add(joke);
		chucklePanel.add(punchline);
		punchline.addActionListener(this);
		joke.addActionListener(this);
		platform.pack();
		platform.setVisible(true);
		
//if this object of this class is the action listener, then why do we need the variable JButton to access the events/messages sent by the buttons?	
		
		

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == joke) {
			JOptionPane.showMessageDialog(null,  "Do you know why the tailor got fired?");
		}
//the tailor got fired, he just wasn't a good fit
		if(buttonPressed == punchline) {
			JOptionPane.showMessageDialog(null, "He just wasn't a good fit!");
		}
	}
}
