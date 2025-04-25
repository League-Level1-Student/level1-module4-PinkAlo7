package _05_fortune_teller;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FortuneTellerRunner {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new FortuneTeller());
        begin();
    }

    static void begin() {
        // Welcome the user. Give them a hint for the secret location.
JOptionPane.showMessageDialog(null,"Welcome! I am about to give you a picture, and you will have to click a specific point on that picture in order to reveal"
		+ "\n your fortune. However, you will not know the coordinates of that point unless you are able to solve this clue: the y-coordinate is 1 number less  "
		+ "\nthan the x coordinate. If you take the x-coordinate divided by 4, and multiply it by the y-coordinate, you will get 1580. Hope you know algebra!");
    }
}
