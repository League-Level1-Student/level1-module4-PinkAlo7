package _05_fortune_teller;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import game_tools.Sound;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    JFrame frame = new JFrame();

    int frameWidth = 500;
    int frameHeight = 500;

    FortuneTeller() throws Exception {
        // 1. Choose an image for your fortune teller and put it in your default package
        fortuneTellerImage = ImageIO.read(getClass().getResource("fortune teller.png"));
        
        // 2. Adjust the frameWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)
        
        // 3. Complete the begin() method in the FortuneTellerRunner class
        
        // 4. add a mouse listener to the frame
        frame.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        
        // 5. Print the mouseX variable
        System.out.println(mouseX + " " + mouseY);
        // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
        
        // 7. Adjust your secret location co-ordinates here:
        int secretLocationX = 80;
        int secretLocationY = 79;
        
        // If the mouse co-ordinates and secret location are close, we'll let them ask a question.
        if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
        	 play("587017__victor_natas__something-spooky.wav");
        	 JOptionPane.showInputDialog("Hi again, you are close to the secret coordinates so you "
        			+ "\nget to ask a question. ");
        		int randomNum = new Random().nextInt(4);
    			System.out.println(randomNum);
    			if(randomNum == 0) {
    				JOptionPane.showMessageDialog(null, "Yes!");
    			}
    			if(randomNum == 1) {
    				JOptionPane.showMessageDialog(null,"No");
    			}
    			if(randomNum == 2) {
    				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
    			}
    			if(randomNum == 3) {
    				JOptionPane.showMessageDialog(null, "I don't know");
    			}
    			
        }
        }
            // 8. Find a spooky sound and put it in your _05_fortune_teller package (freesound.org)
            //    play("creepy-noise.wav");
            
            // 9. Play the sound
          
            // 10. Insert your completed Magic 8 ball code here
        	 public static void main(String[] args) {
        		 try {
					SwingUtilities.invokeLater(new FortuneTeller());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 JOptionPane.showMessageDialog(null,"Welcome! I am about to give you a picture, and you will have to click a specific point on that picture in order to reveal"
     					+ "\n your fortune. However, you will not know the coordinates of that point unless you are able to solve this clue: the y-coordinate is 1 number less  "
     					+ "\nthan the x coordinate. If you take the x-coordinate divided by 4, and multiply it by the y-coordinate, you will get 1580. Hope you know algebra!");
     			    
        		
        }

    

    private boolean areClose(int mouseX, int secretLocationX) {
        return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**************** don't worry about the stuff under here *******************/

    BufferedImage fortuneTellerImage;

    @Override
    public void run() {
        frame.add(this);
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static synchronized void play(final String fileName)
    {
        Sound sound = new Sound("_05_fortune_teller/" + fileName);
        sound.play();
    }

    private void showAnotherImage(String imageName) {
        try {
            fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
        } catch (Exception e) {
            System.err.println("Couldn't find this image: " + imageName);
        }
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}




