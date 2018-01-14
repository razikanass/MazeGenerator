import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Panel extends JPanel{

	private static final long serialVersionUID = -6540665032796165458L;
	private static int W = 500,H = 500;
	private int size = 30;
	private int cols,rows;
	
	public Panel(){
		rows = W / size;
		cols = H / size;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Panel pan = new Panel();
		pan.setBackground(Color.RED);
		Window w = pan.new Window(W, H, "maze Generator", pan);
	}
	
	public void start(){
		System.out.println("Programme starting ...");
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, W, H);
		for(int x = 0; x < cols; x++){
			for(int y = 0; y < rows; y++){
				g.setColor(Color.WHITE);
				g.drawRect(x*size, y*size, size, size);
			}
		}
	}
	
	class Window extends JFrame{
		
		private static final long serialVersionUID = -5385708461927093718L;

		public Window(int w, int h, String title, Panel panel){
			setSize(w-12, h+10);
			setLocation(300,100);
			setTitle(title);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(false);
			add(panel);
			panel.start();
		}
	}

}
