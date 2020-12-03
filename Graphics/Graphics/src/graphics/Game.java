package graphics;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
   
    public Game() {
        this.setPreferredSize(new Dimension(Screen.getW() * Screen.getS(), Screen.getH() * Screen.getS()));
        Frame();
        
    }

    public synchronized void start(){
        looping.setThread(new Thread(this));
        looping.setRunning(true);
        looping.getThread().start();
    }

    public synchronized void stop(){

    }

    public static void main(String args[]){
        Game game =new Game();
        game.start();
    }

    public void tick(){

    }

    public void render(){

    }

    @Override
    public void run() {
        while (looping.isRunning) {
            looping.setNow(System.nanoTime());
            looping.delta += (looping.now - looping.lastTime) / looping.fps;
            looping.lastTime = looping.now;
            if (looping.delta >= 1){
                tick();
                render();
                looping.frames++;
                looping.delta--;
            }
            if (System.currentTimeMillis() - looping.timer >=      1000) {
                System.out.println("FPS:" + looping.frames);
                looping.frames = 0;
                looping.timer += 1000;
            }   
            
        }
    }
    
    public void Frame(){
        Screen.setFrame(new JFrame());
        Screen.getFrame().add(this);
		Screen.getFrame().setResizable(false);
		Screen.getFrame().pack();
		Screen.getFrame().setLocationRelativeTo(null);
		Screen.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Screen.getFrame().setVisible(true);
    }
}
