import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class CropPlateImage {

	public CropPlateImage(){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Crop Plate Image");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				BufferedImage img = null;
				
				try {
					File input = new File("src/output/9. No Plate.jpg");
					img = ImageIO.read(input);
					System.out.println("Status : SUCCESS");
			         System.out.println("No Plate.jpg created.");
				    System.out.println("Number plate detected. \n");
				}
				
				catch (IOException e){
					System.out.println("No plate detected");
					System.out.println("Check src/output and delete previous images");
				}
				
				ImageIcon imgIcon = new ImageIcon(img);
				JLabel lbl = new JLabel();
				lbl.setIcon(imgIcon);
				frame.getContentPane().add(lbl, BorderLayout.CENTER);
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}
