import gui.MyComponent;
import gui.MyFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var frame = new MyFrame();
			// frame
			{
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setLocation(192,108);
				frame.setIconImage(new ImageIcon("Path").getImage());
				frame.setTitle("MyFrame");
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension screenSize = toolkit.getScreenSize();
				int width = screenSize.width / 2;
				int height = screenSize.height / 2;
				frame.setSize(width, height);
				
				// setSize() & setLocation()
//				frame.setBounds(192, 108, width / 2, height / 2);
				
				frame.setLocationByPlatform(true);
			}
			// component
			{
				frame.add(new MyComponent());
				// use preferred size instead of setSize() of a component
				frame.pack();
				
				// paint component again at once
				frame.repaint();
			}
		});
	}
}