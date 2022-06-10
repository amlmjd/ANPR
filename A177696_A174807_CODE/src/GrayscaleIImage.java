import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GrayscaleIImage {
	
	public GrayscaleIImage(){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Grayscale Image");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				BufferedImage img = null;
				
				try {
					File input = new File("src/output/2. Grayscale.jpg");
			        img = ImageIO.read(input);
				}
				catch (IOException e){
					e.printStackTrace();
					System.exit(1);
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
