package graphics;
import javax.swing.JFrame;


public class GraphicsF{
	public static JFrame frame;
	public static int h = 120;
	public static int w = 160;
	public static int s = 3;
	public static Thread thread;
	public static boolean isRunning = true;

	public static JFrame getFrame() {
		return frame;
	}
	public static void setFrame(JFrame frame) {
		GraphicsF.frame = frame;
		
	}
	
	public static int getH() {
		return h;
	}
	public static void setH(int h) {
		GraphicsF.h = h;
		
	}

	public static int getW() {
		return w;
	}
	public static void setW(int w) {
		GraphicsF.w = w;
		
	}

	public static int getS() {
		return s;
	}
	public static void setS(int s) {
		GraphicsF.s = s;
		
	}

	public static Thread getThread() {
		return thread;
	}
	public static void setThread(Thread thread) {
		GraphicsF.thread = thread;
	}

	public static boolean isRunning() {
		return isRunning;
	}
	public static void setRunning(boolean isRunning) {
		GraphicsF.isRunning = isRunning;
	}

	
    
}
