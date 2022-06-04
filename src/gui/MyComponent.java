package gui;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class MyComponent extends JComponent {
	final int MESSAGE_X = 75;
	final int MESSAGE_Y = 100;
	final String CONTENT = "This is a string.";
	
	// set how to paint a component
	public void paintComponent(Graphics graphics) {
		graphics.drawString(CONTENT, MESSAGE_X, MESSAGE_Y);
		// paint shape
		{
			var graphics2D = (Graphics2D)graphics;
			var rectangle = new Rectangle2D.Double(100, 100, 10, 20);
			graphics2D.setPaint(new Color(64, 131, 147)); // change pen color to glass look and feel
			graphics2D.fill(rectangle);
			graphics2D.draw(rectangle);
			
			var ellipse = new Ellipse2D.Double(100, 100, 3, 2);
			ellipse.setFrame(rectangle);
			graphics2D.draw(ellipse);
		}
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(100, 120);
	}
}
