package graphics;

public class looping {
    public static Thread thread;
    public static boolean isRunning = true;
    public static long lastTime = System.nanoTime();
    public static double amountOfTicks = 60.0;
    public static double fps = 1000000000 / amountOfTicks;
    public static double delta = 0;
    public static long now;
    public static int frames = 0;
    public static double timer = System.currentTimeMillis();
    
    public static Thread getThread() {
		return thread;
	}
	public static void setThread(Thread thread) {
		looping.thread = thread;
	}

	public static boolean isRunning() {
		return isRunning;
	}
	public static void setRunning(boolean isRunning) {
		looping.isRunning = isRunning;
	}

}
