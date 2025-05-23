package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import game_tools.Sound;

public class whack_a_mole implements MouseListener, ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random random = new Random();
	JButton hello;
	JButton button;
	String word;



	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		whack_a_mole wam = new whack_a_mole();
		wam.drawButtons(wam.random.nextInt(26));

	}



	public void drawButtons(int randomNum) {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(800, 800));
		frame.add(panel);
		panel.addMouseListener(this);
		
		for(int i=1; i<=25; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
			if(i==randomNum) {
				button.setName("hello");
				button.setText("mole!");


			}
		}
		
		








	}

	
	
	
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
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
		int numPlayed = 0;
		JButton pressed = (JButton) e.getSource();
		String text = pressed.getText();
		int randomword = random.nextInt(6);
		if(randomword == 1) {
			word = "miss";
		}
		if(randomword == 2) {
			word = "wrong";
		}
		if(randomword ==3) {
			word = "looser";
		}
		if(randomword == 4) {
			word = "too slow";
		}
		if(randomword == 5) {
			word = "haha";
		}
		
		
		if(text.equals("mole!")) {
			playSound("correctBell.wav");
			panel.removeAll();
			drawButtons(random.nextInt(26));
			numPlayed+=1;
		}
		else {
			
			Sound.speak(word);
			panel.removeAll();
			drawButtons(random.nextInt(26));
			numPlayed+=1;
			
		
		}
		if(numPlayed == 10) {
			endGame(1, 10);
		}
		}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	//why are these errors showing?
	//What is date and how would I make a variable of this type to use as a paramter when I call the method above?
}
