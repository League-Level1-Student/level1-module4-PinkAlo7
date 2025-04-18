package _04_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame illusionframe = new JFrame();
	JLabel illusionLabelOne;
	JLabel illusionLabelTwo;
	JLabel illusionLabelThree;
	int currentImage = 1;
	public void run() {
		// 2. make the frame visible
		illusionframe.setVisible(true);
		// 3. set the size of the frame
		illusionframe.setSize(600,700);
		// 4. find 2 images and save them to your project’s _06_book_of_illusions folder
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String illusionOne = "colorful optical illusion.jpg";
		String illusionTwo = "orange and blue tunnel optical illusion.jpg";
		String illusionThree = "rotating sphere illusion.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet

		// 7. use the "loadImage..." methods below to initialize your JLabel
		illusionLabelOne = loadImageFromComputer(illusionOne);
		illusionLabelTwo =loadImageFromComputer(illusionTwo);
		illusionLabelThree = loadImageFromComputer(illusionThree);
		// 8. add your JLabel to the frame
		illusionframe.add(illusionLabelOne);
		illusionframe.add(illusionLabelTwo);


		// 9. call the pack() method on the frame
		illusionframe.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		illusionframe.addMouseListener(this);

	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		//Work on removing illusion labels every time mouse is clicked
		if(currentImage == 0) {
			
		}
		illusionframe.remove(illusionLabelOne);
		// 13. load a new image like before (this is more than one line of code)

		illusionframe.add(illusionLabelThree);
		// 14. pack the frame
		illusionframe.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


