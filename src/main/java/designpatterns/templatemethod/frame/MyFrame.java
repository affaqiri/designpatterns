package designpatterns.templatemethod.frame;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Another example of the template method with hooks within the Swing API.
 */
public class MyFrame extends JFrame {

	private static final long serialVersionUID = 2L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	/**
	 * A hook method used by subclasses of the JFrame class to draw on the
	 * frame.
	 */
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!!";
		graphics.drawString(msg, 100, 100);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}

}