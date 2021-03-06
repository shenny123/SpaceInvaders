import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceInvaders extends JFrame {
	public SpaceInvaders() {
        
        initUI();
    }
	public void initUI() {
		add(new Board());
        
		//Board Size
        setSize(1000, 650);
        setResizable(false);
        
        setTitle("Space Invaders");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            SpaceInvaders ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}
