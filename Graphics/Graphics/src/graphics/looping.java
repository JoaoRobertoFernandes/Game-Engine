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

    public static long getLastTime() {
        return lastTime;
    }
    public static void setLastTime(long lastTime) {
        looping.lastTime = lastTime;
    }

    public static double getAmountOfTicks() {
        return amountOfTicks;
    }
    public static void setAmountOfTicks(double amountOfTicks) {
        looping.amountOfTicks = amountOfTicks;
    }

    public static double getFps() {
        return fps;
    }
    public static void setFps(double fps) {
        looping.fps = fps;
    }

    public static double getDelta() {
        return delta;
    }
    public static void setDelta(double delta) {
        looping.delta = delta;
    }

    public static long getNow() {
        return now;
    }
    public static void setNow(long now) {
        looping.now = now;
    }

    public static int getFrames() {
        return frames;
    }
    public static void setFrames(int frames) {
        looping.frames = frames;
    }

    public static double getTimer() {
        return timer;
    }
    public static void setTimer(double timer) {
        looping.timer = timer;
    }
}
