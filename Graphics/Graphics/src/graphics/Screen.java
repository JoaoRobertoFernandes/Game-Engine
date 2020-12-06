package graphics;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;

public class Screen{
	public static JFrame frame;
	public static int h = 120;
	public static int w = 160;
	public static int s = 4;
	public static BufferedImage image;

	public static JFrame getFrame() {
		return frame;
	}
	public static void setFrame(JFrame frame) {
		Screen.frame = frame;
		
	}

	public static int getH() {
		return h;
	}
	public static void setH(int h) {
		Screen.h = h;
		
	}

	public static int getW() {
		return w;
	}
	public static void setW(int w) {
		Screen.w = w;
		
	}

	public static int getS() {
		return s;
	}
	public static void setS(int s) {
		Screen.s = s;
		
	}

	public static BufferedImage getImage() {
		return image;
	}
	public static void setImage(BufferedImage image) {
		Screen.image = image;
	}
}
