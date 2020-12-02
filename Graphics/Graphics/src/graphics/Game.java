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
        GraphicsF.setFrame(new JFrame());
        GraphicsF.getFrame().add(this);
		GraphicsF.getFrame().setResizable(false);
		GraphicsF.getFrame().pack();
		GraphicsF.getFrame().setLocationRelativeTo(null);
		GraphicsF.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsF.getFrame().setVisible(true);
    }

    public static void main(String args[]){
        Game game =new Game();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
    
}
