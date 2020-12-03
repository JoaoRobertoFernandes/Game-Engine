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
        this.setPreferredSize(new Dimension(GraphicsF.getW() * GraphicsF.getS(), GraphicsF.getH() * GraphicsF.getS()));
        Frame();
        
    }

    public void Frame(){
        GraphicsF.setFrame(new JFrame());
        GraphicsF.getFrame().add(this);
		GraphicsF.getFrame().setResizable(false);
		GraphicsF.getFrame().pack();
		GraphicsF.getFrame().setLocationRelativeTo(null);
		GraphicsF.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsF.getFrame().setVisible(true);
    }

    public synchronized void start(){
        GraphicsF.setThread(new Thread(this));
        GraphicsF.setRunning(true);
        GraphicsF.getThread().start();
    }

    public synchronized void stop(){

    }

    public static void main(String args[]){
        Game game =new Game();
        game.start();
    }

    @Override
    public void run() {
        while(GraphicsF.isRunning){
            System.out.println("Game started!");
        }

    }
    
}
