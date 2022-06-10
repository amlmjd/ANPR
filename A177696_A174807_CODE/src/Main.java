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

import org.opencv.core.Core;

public class Main {
	
	//change test file here
	//can get it from src/input
	public static String getName() {
		String filename = "src/input/test_010.jpg";
		return filename;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------");
		System.out.println("      Step 1: Original Image     ");
		System.out.println("---------------------------------");
		
		//shows original image
		new OriginalImage(); 
		System.out.println("Original Image of the input : " + getName());
		System.out.println("Status : SUCCESS");
		
		System.out.println();
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("     Step 2 : Noise Reduction    ");
		System.out.println("---------------------------------");
		
		//reduce noise
		new NoiseReduction(); 
		
		//show image after noise reduction
		new NoiseReductionImage();
		
		System.out.println();
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("       Step 3 : Grayscale        ");
		System.out.println("---------------------------------");
		
		//converts rgb to grayscale
		Grayscale obj = new Grayscale(); 
		
		//shows grayscale image
		new GrayscaleIImage(); 
		
		System.out.println();
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("     Step 4 : Edge Detection     ");
		System.out.println("---------------------------------");
		
		//detects edges
		new EdgeDetection(); 
		
		//show image
		new EdgeDetectionImage();
		
		System.out.println(); 
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("         Step 5 : Binary         ");
		System.out.println("---------------------------------");
		
		//converts grayscale to binary
		new Binary().run(args);
		
		//show binary image
		new BinaryImage();
		
		System.out.println(); 
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("      Step 6 : Find Contour      ");
		System.out.println("---------------------------------");
		
		//show image
		new FindContourImage();
		 
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("       Step 7 : Top Contour      ");
		System.out.println("---------------------------------");
		
		//show image
		new TopContourImage();
		
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("      Step 8 : Plate Contour     ");
		System.out.println("---------------------------------");
		
		//show image
		new PlateContourImage();

		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("      Step 9 : Number Plate      ");
		System.out.println("---------------------------------");
		
		//show image
		new PlateImage();
		
		synchronized(args) {
			args.wait(3000);
		}
		
		System.out.println("---------------------------------");
		System.out.println("   Step 10 : Crop Number Plate   ");
		System.out.println("---------------------------------");
		
		//show image
		new CropPlateImage();

		synchronized(args) {
			args.wait(3000);
		}
	}
	
}
